/**
 * PersonalPlan - Child class of AIModel.
 * Targets recreational / individual users with a monthly prompt quota (default 500).
 * Supports purchasing extra prompts and submitting prompts with token-limit checks.
 */
public class PersonalPlan extends AiModel {

    // ── Attributes ───────────────────────────────────────────────────────────────
    private int promptsRemaining; // monthly quota counter

    // ── Constructor ──────────────────────────────────────────────────────────────
    public PersonalPlan(String modelName, double price, int parameterCount,
                        String contextWindow, int promptsRemaining) {
        super(modelName, price, parameterCount, contextWindow);
        this.promptsRemaining = promptsRemaining;
    }

    // ── Accessor ─────────────────────────────────────────────────────────────────
    public int getPromptsRemaining() { return promptsRemaining; }

    // ── purchasePrompts() ────────────────────────────────────────────────────────
    /**
     * Adds extra prompts to the monthly quota.
     * @param additionalPrompts number of prompts to purchase (must be > 0)
     * @return status message
     */
    public String purchasePrompts(int additionalPrompts) {
        if (additionalPrompts <= 0) {
            return "Invalid input: You must enter a positive value, " +
                   "or consider upgrading to a Pro Plan.";
        }
        promptsRemaining += additionalPrompts;
        return additionalPrompts + " prompts purchased successfully. " +
               "New quota: " + promptsRemaining + " prompts.";
    }

    // ── enterPrompt() ────────────────────────────────────────────────────────────
    /**
     * Simulates the user sending a prompt.
     *
     * Context-window check: input + output + system tokens must not exceed
     * the numeric portion of contextWindow (interpreted in thousands).
     * e.g. "64K" → 64 000 tokens.
     *
     * @param promptText       the prompt text
     * @param inputTokens      estimated input tokens
     * @param outputTokens     expected output tokens
     * @param systemTokens     system / instruction tokens
     * @return result message
     */
    public String enterPrompt(String promptText, int inputTokens,
                              int outputTokens, int systemTokens) {
        // Parse context window limit
        int contextLimit = parseContextWindow(getContextWindow());
        int totalTokens  = inputTokens + outputTokens + systemTokens;

        if (totalTokens > contextLimit) {
            return "Error: Total token usage (" + totalTokens +
                   ") exceeds the context window limit (" + contextLimit +
                   " tokens) for model '" + getModelName() + "'.";
        }

        if (promptsRemaining <= 0) {
            return "Monthly quota reached. Please purchase additional prompts " +
                   "or wait until next month.";
        }

        promptsRemaining--;
        return "Prompt submitted successfully.\n" +
               "  Prompt      : " + promptText + "\n" +
               "  Input Tokens: " + inputTokens + "\n" +
               "  Output Tokens: " + outputTokens + "\n" +
               "  System Tokens: " + systemTokens + "\n" +
               "  Total Tokens : " + totalTokens + "\n" +
               "  Prompts Remaining: " + promptsRemaining;
    }

    // ── display() ────────────────────────────────────────────────────────────────
    /**
     * Returns full details of the PersonalPlan (calls parent display()).
     */
    @Override
    public String display() {
        return super.display() + "\n" +
               "Plan Type       : Personal Plan\n" +
               "Prompts Left    : " + promptsRemaining + " / month";
    }

    // ── Helper ───────────────────────────────────────────────────────────────────
    /**
     * Parses "64K", "128K", "1M" etc. into an integer token count.
     */
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