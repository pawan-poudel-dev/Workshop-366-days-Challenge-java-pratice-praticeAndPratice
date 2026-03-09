/**
 * Main.java  –  Milestone 1 Test Driver
 *
 * Demonstrates:
 *   1. Object instantiation for PersonalPlan and ProPlan
 *   2. Exhausting the PersonalPlan monthly quota → "Quota Reached" message
 *   3. Purchasing extra prompts via purchasePrompts()
 *   4. Context-window limit enforcement for BOTH plan types
 *   5. ProPlan prompt submission (no quota decrement)
 *   6. ProPlan team-member management (add / remove)
 */
public class Main {

    // ── Helpers ──────────────────────────────────────────────────────────────────
    private static void section(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("  " + title);
        System.out.println("=".repeat(60));
    }

    private static void print(String msg) { System.out.println(msg); }

    // ── main ─────────────────────────────────────────────────────────────────────
    public static void main(String[] args) {

        /* ─────────────────────────────────────────────────────────────────────
         * 1.  INSTANTIATE OBJECTS
         * ──────────────────────────────────────────────────────────────────── */
        section("1. Object Instantiation");

        // PersonalPlan: Claude Haiku, Rs 150/1L tokens, 7B params, 64K ctx, 500 prompts
        PersonalPlan personal = new PersonalPlan(
                "Claude Haiku", 150.00, 7, "64K", 500);

        // ProPlan: Claude Sonnet, Rs 500/1L tokens, 70B params, 128K ctx, 10 team slots
        ProPlan pro = new ProPlan(
                "Claude Sonnet", 500.00, 70, "128K", 10);

        print("PersonalPlan created:\n" + personal.display());
        print("\nProPlan created:\n"     + pro.display());


        /* ─────────────────────────────────────────────────────────────────────
         * 2.  EXHAUST PERSONAL PLAN QUOTA (500 prompts) via a loop
         * ──────────────────────────────────────────────────────────────────── */
        section("2. Exhausting PersonalPlan Monthly Quota");

        // Use small token values well within the 64K window
        int inputTok = 100, outputTok = 200, sysTok = 50; // total = 350 ✓

        print("Sending 500 prompts to exhaust the quota …");
        for (int i = 1; i <= 500; i++) {
            personal.enterPrompt("Test prompt #" + i, inputTok, outputTok, sysTok);
        }
        print("Prompts remaining after loop: " + personal.getPromptsRemaining());

        // 501st prompt → should trigger "monthly quota reached"
        String exhaustedMsg = personal.enterPrompt(
                "One more prompt", inputTok, outputTok, sysTok);
        print("\n[501st prompt attempt]");
        print(exhaustedMsg);


        /* ─────────────────────────────────────────────────────────────────────
         * 3.  PURCHASE EXTRA PROMPTS
         * ──────────────────────────────────────────────────────────────────── */
        section("3. Purchasing Extra Prompts");

        // Invalid purchase (negative value)
        print("[Attempt to purchase -10 prompts]");
        print(personal.purchasePrompts(-10));

        // Valid purchase
        print("\n[Purchase 50 additional prompts]");
        print(personal.purchasePrompts(50));

        // Verify prompt now works again
        print("\n[Prompt after purchase]");
        print(personal.enterPrompt("Prompt after top-up", inputTok, outputTok, sysTok));


        /* ─────────────────────────────────────────────────────────────────────
         * 4.  CONTEXT-WINDOW LIMIT ENFORCEMENT
         *     PersonalPlan context = 64K = 64 000 tokens
         *     ProPlan      context = 128K = 128 000 tokens
         * ──────────────────────────────────────────────────────────────────── */
        section("4a. Context Limit – PersonalPlan (64K window)");

        // Total = 40 000 + 20 000 + 5 000 = 65 000  →  EXCEEDS 64K
        int bigInput  = 40_000;
        int bigOutput = 20_000;
        int bigSystem =  5_000;

        print("[Sending prompt that exceeds 64K context window]");
        print(personal.enterPrompt("Large context prompt", bigInput, bigOutput, bigSystem));

        // Within limit: 30 000 + 20 000 + 5 000 = 55 000 < 64 000
        print("\n[Sending prompt within 64K context window]");
        print(personal.enterPrompt("Normal prompt", 30_000, 20_000, 5_000));


        section("4b. Context Limit – ProPlan (128K window)");

        // Total = 80 000 + 40 000 + 10 000 = 130 000  →  EXCEEDS 128K
        print("[Sending prompt that exceeds 128K context window]");
        print(pro.enterPrompt("Large context prompt", 80_000, 40_000, 10_000));

        // Within limit: 60 000 + 40 000 + 10 000 = 110 000 < 128 000
        print("\n[Sending prompt within 128K context window]");
        print(pro.enterPrompt("Team analysis", 60_000, 40_000, 10_000));


        /* ─────────────────────────────────────────────────────────────────────
         * 5.  ProPlan PROMPTS RUN WITHOUT QUOTA DECREMENT
         * ──────────────────────────────────────────────────────────────────── */
        section("5. ProPlan – No Quota Decrement");

        print("Sending 1 000 prompts on ProPlan (unlimited) …");
        for (int i = 1; i <= 1_000; i++) {
            pro.enterPrompt("Pro prompt #" + i, 100, 200, 50);
        }
        // ProPlan has no promptsRemaining field — no counter to check,
        // so we just confirm the 1001st prompt also succeeds.
        String proResult = pro.enterPrompt("Final pro prompt", 100, 200, 50);
        print("1 001st prompt result:\n" + proResult);
        print("\n[ProPlan still fully functional – no quota enforced ✓]");


        /* ─────────────────────────────────────────────────────────────────────
         * 6.  ProPlan TEAM MEMBER MANAGEMENT
         * ──────────────────────────────────────────────────────────────────── */
        section("6. ProPlan – Team Member Management");

        print("Initial team slots: " + pro.getTeamSlots());

        // Add members until slots run out
        String[] members = {"Alice","Bob","Carol","Dave","Eve",
                            "Frank","Grace","Heidi","Ivan","Judy"};
        for (String m : members) {
            print(pro.addTeamMember(m));
        }

        // Try adding one more → no slots
        print("\n[Attempt to add member when no slots remain]");
        print(pro.addTeamMember("Mallory"));

        // Remove a member → slot freed
        print("\n[Remove 'Alice']");
        print(pro.removeTeamMember("Alice"));
        print("[Add 'Mallory' after freeing a slot]");
        print(pro.addTeamMember("Mallory"));

        print("\nFinal ProPlan state:\n" + pro.display());


        /* ─────────────────────────────────────────────────────────────────────
         * 7.  FINAL STATE SUMMARY
         * ──────────────────────────────────────────────────────────────────── */
        section("7. Final State Summary");
        print("PersonalPlan:\n" + personal.display());
        print("\nProPlan:\n"     + pro.display());
    }
}