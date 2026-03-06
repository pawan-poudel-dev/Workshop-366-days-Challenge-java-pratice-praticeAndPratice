public class PersonalPlanTest {
    
}
public class PersonalPlan extends AiModel {
    private int promptsRemaining; // number of prompts remaining in monthly quota
    private static final int CONTEXT_LIMIT = 4000; // 4K token context window
    private static final int SYSTEM_TOKENS = 200;  // fixed system overhead

    // Constructor
    public PersonalPlan(String modelName, double price, int parameterCount, String contextWindowSize, int promptsRemaining) {
        super(modelName, price, parameterCount, contextWindowSize);
        this.promptsRemaining = promptsRemaining;
    }

    // Accessor method
    public int getPromptsRemaining() {
        return promptsRemaining;
    }

    // Adds prompts to the monthly quota — rejects negative values
    public String purchasePrompts(int additionalPrompts) {
        if (additionalPrompts < 0) {
            return "Please enter a positive value for additional prompts or consider upgrading to the Pro plan.";
        }
        this.promptsRemaining += additionalPrompts;
        return "Successfully added " + additionalPrompts + " prompts."
             + "\nTotal prompts remaining: " + this.promptsRemaining;
    }

    // Consumes one prompt — checks context limit first, then quota
    public String enterPrompt(String promptText, int expectedOutputLength) {
        int inputTokens  = promptText.length();
        int totalTokens  = inputTokens +expectedOutputLength + SYSTEM_TOKENS;

        //  for  Testing 2: Reject if total tokens exceed context window
        if (totalTokens > CONTEXT_LIMIT) {
            return "Prompt REJECTED: Context limit exceeded!"
                 + "\n  Input tokens   : " + inputTokens
                 + "\n  Output tokens  : " + expectedOutputLength
                 + "\n  System tokens  : " + SYSTEM_TOKENS
                 + "\n  Total tokens   : " + totalTokens
                 + "\n  Context limit  : " + CONTEXT_LIMIT
                 + "\n  Exceeds by     : " + (totalTokens - CONTEXT_LIMIT) + " tokens"
                 + "\nPlease reduce the input or output size.";
        }

        //  for Testing 3: Reject if monthly quota is exhausted
        if (promptsRemaining > 0) {
            promptsRemaining--;
            return "Prompt ACCEPTED: \"" + promptText + "\""
                 + "\n  Output tokens  : " + expectedOutputLength
                 + "\n  Total tokens   : " + totalTokens
                 + "\n  Context limit  : " + CONTEXT_LIMIT
                 + "\n  Prompts remaining: " + promptsRemaining;
        } else {
            return "Prompt REJECTED: Monthly quota has been reached."
                 + "\nPlease purchase additional prompts or upgrade to the Pro plan.";
        }
    }

    // Displays PersonalPlan-specific details
    @Override
    public String display() {
        return super.displayBaseInfo()
             + "\nPrompts Remaining: " + promptsRemaining;
    }
}