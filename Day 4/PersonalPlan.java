
public class PersonalPlan extends AiModel {

    
    private int promptsRemaining; // monthly quota counter

    
    public PersonalPlan(String modelName, double price, int parameterCount,
                        String contextWindow, int promptsRemaining) {
        super(modelName, price, parameterCount, contextWindow);
        this.promptsRemaining = promptsRemaining;
    }

    
    public int getPromptsRemaining() { 
        return promptsRemaining; }

    
    public String purchasePrompts(int additionalPrompts) {
        if (additionalPrompts <= 0) {
            return "Invalid input: You must enter a positive value, " +
                   "or consider upgrading to a Pro Plan.";
        }
        promptsRemaining += additionalPrompts;
        return additionalPrompts + " prompts purchased successfully. " +
               "New quota: " + promptsRemaining + " prompts.";
    }

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

    
    @Override
    public String display() {
        return super.display() + "\n" +
               "Plan Type       : Personal Plan\n" +
               "Prompts Left    : " + promptsRemaining + " / month";
    }
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