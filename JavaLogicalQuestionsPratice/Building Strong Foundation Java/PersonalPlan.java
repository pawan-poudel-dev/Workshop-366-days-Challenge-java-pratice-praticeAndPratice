/**
 * Represents a Personal subscription plan for an AI model.
 * Designed for individual users with a limited monthly prompt quota.
 *
 * <p>
 * The default monthly quota starts at the value passed to the constructor.
 * Users can purchase additional prompts or submit prompts until the quota
 * runs out.
 * </p>
 *
 * @author  Pawan Poudel
 * @version 2.0
 * @see     AIModel
 */
public class PersonalPlan extends AIModel {

    // ---------------------------------------------------------------
    // Instance Variable
    // ---------------------------------------------------------------

    /**
     * Remaining prompts in the monthly quota.
     * Decremented by 1 on each submitted prompt.
     */
    private int promptsRemaining;

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    /**
     * Constructs a new PersonalPlan. The first four parameters are passed
     * to the parent {@link AIModel} constructor via {@code super()}.
     *
     * @param modelName        name of the AI model
     * @param price            price per 1 Lakh tokens in NPR
     * @param parameterCount   number of parameters in billions
     * @param contextWindow    context window size in thousands of tokens
     *                         (e.g. 128 = 128K)
     * @param promptsRemaining initial monthly prompt quota (e.g. 500)
     */
    public PersonalPlan(String modelName, double price,
                        int parameterCount, int contextWindow,
                        int promptsRemaining) {
        super(modelName, price, parameterCount, contextWindow);
        this.promptsRemaining = promptsRemaining;
    }

    // ---------------------------------------------------------------
    // Getter
    // ---------------------------------------------------------------

    /** @return number of prompts remaining in the monthly quota */
    public int getPromptsRemaining() {
        return promptsRemaining;
    }

    // ---------------------------------------------------------------
    // Methods
    // ---------------------------------------------------------------

    /**
     * Adds extra prompts to the user's monthly quota.
     * Rejects zero or negative values with an error message.
     *
     * @param prompts number of additional prompts to purchase; must be positive
     * @return confirmation message on success, or an error message if
     *         {@code prompts < 0}
     */
    public String purchasePrompts(int prompts) {
        if (prompts <= 0) {
            return "Error: Please enter a positive value, " +
                   "or consider upgrading to a Pro Plan!";
        }
        promptsRemaining += prompts;
        return "Success! " + prompts + " prompts added. " +
               "Current quota: " + promptsRemaining + " prompts remaining.";
    }

    /**
     * Submits a prompt to the AI model, consuming one quota slot.
     * Returns a quota-exhausted message if no prompts remain.
     *
     * @param promptText  the text of the prompt
     * @param tokenLength expected output length in tokens
     * @return prompt details with remaining quota, or a quota-exhausted message
     */
    public String enterPrompt(String promptText, int tokenLength) {
        if (promptsRemaining > 0) {
            promptsRemaining--;
            return "===== Prompt Submitted =====" +
                   "\nPrompt Text     : " + promptText +
                   "\nExpected Tokens : " + tokenLength +
                   "\nPrompts Left    : " + promptsRemaining;
        } else {
            return "Monthly prompt quota reached! " +
                   "Please purchase additional prompts or upgrade to Pro Plan.";
        }
    }

    /**
     * Returns all plan details by overriding {@code display()} from
     * {@link AIModel}. Calls {@code super.display()} to obtain the
     * base model fields, then appends the remaining prompt quota.
     *
     * @return formatted string with all AIModel fields plus prompts remaining
     */
    @Override
    public String display() {
        return super.display() +
               "\n--- Personal Plan ---" +
               "\nPrompts Remaining : " + promptsRemaining;
    }

}
