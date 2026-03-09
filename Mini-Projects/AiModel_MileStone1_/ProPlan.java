/**
 * ProPlan - Child class of AIModel.
 * Targets teams. Offers unlimited prompts (no monthly quota decrement) and
 * manages available team-member slots.
 */
public class ProPlan extends AiModel {

    // ── Attributes ───────────────────────────────────────────────────────────────
    private int teamSlots; // available collaboration slots

    // ── Constructor ──────────────────────────────────────────────────────────────
    public ProPlan(String modelName, double price, int parameterCount,
                   String contextWindow, int teamSlots) {
        super(modelName, price, parameterCount, contextWindow);
        this.teamSlots = teamSlots;
    }

    // ── Accessor ─────────────────────────────────────────────────────────────────
    public int getTeamSlots() { return teamSlots; }

    // ── addTeamMember() ──────────────────────────────────────────────────────────
    /**
     * Adds a team member if a slot is available, then decrements the slot count.
     * @param memberName name of the team member to add
     * @return status message
     */
    public String addTeamMember(String memberName) {
        if (teamSlots <= 0) {
            return "Error: No available team slots. " +
                   "Please upgrade your plan or remove an existing member.";
        }
        teamSlots--;
        return "Team member '" + memberName + "' added successfully. " +
               "Available slots remaining: " + teamSlots + ".";
    }

    // ── removeTeamMember() ───────────────────────────────────────────────────────
    /**
     * Removes a team member and increments the slot count.
     * @param memberName name of the team member to remove
     * @return status message
     */
    public String removeTeamMember(String memberName) {
        teamSlots++;
        return "Team member '" + memberName + "' removed successfully. " +
               "Available slots now: " + teamSlots + ".";
    }

    // ── enterPrompt() ────────────────────────────────────────────────────────────
    /**
     * Pro plan prompt submission — no quota decrement, but context window is still
     * enforced. This method is provided so that Main.java can test context limits
     * on ProPlan objects using the same pattern as PersonalPlan.
     *
     * @param promptText   the prompt text
     * @param inputTokens  estimated input tokens
     * @param outputTokens expected output tokens
     * @param systemTokens system / instruction tokens
     * @return result message
     */
    public String enterPrompt(String promptText, int inputTokens,
                              int outputTokens, int systemTokens) {
        int contextLimit = parseContextWindow(getContextWindow());
        int totalTokens  = inputTokens + outputTokens + systemTokens;

        if (totalTokens > contextLimit) {
            return "Error: Total token usage (" + totalTokens +
                   ") exceeds the context window limit (" + contextLimit +
                   " tokens) for model '" + getModelName() + "'.";
        }

        // Pro plan: prompts are unlimited — no counter to decrement
        return "Prompt submitted successfully (Pro Plan – unlimited prompts).\n" +
               "  Prompt       : " + promptText + "\n" +
               "  Input Tokens : " + inputTokens + "\n" +
               "  Output Tokens: " + outputTokens + "\n" +
               "  System Tokens: " + systemTokens + "\n" +
               "  Total Tokens : " + totalTokens;
    }

    // ── display() ────────────────────────────────────────────────────────────────
    /**
     * Returns full details of the ProPlan (calls parent display()).
     */
    @Override
    public String display() {
        return super.display() + "\n" +
               "Plan Type       : Pro Plan (Team)\n" +
               "Team Slots Left : " + teamSlots;
    }

    // ── Helper ───────────────────────────────────────────────────────────────────
    private int parseContextWindow(String cw) {
        cw = cw.trim().toUpperCase();
        if (cw.endsWith("M")) {
            return (int)(Double.parseDouble(cw.replace("M", "")) * 1_000_000);
        } else if (cw.endsWith("K")) {
            return (int)(Double.parseDouble(cw.replace("K", "")) * 1_000);
        }
        return Integer.parseInt(cw);
    }
}