/**
 * AIModel is a base class for all AI subscription plan types.
 * Stores the core attributes of any AI model: name, pricing,
 * parameter count, and context window size. It ensures data binding
 * and protects from unauthorised access outside the class by
 * implementing encapsulation.
 *
 * <p>
 * Both {@link PersonalPlan} and {@link ProPlan} extend this class.
 * The {@code display()} method is overridden in each subclass, which
 * also calls this parent implementation via {@code super.display()}.
 * </p>
 *
 * @author  Pawan Poudel
 * @version 2.0
 */
public class AIModel {

    // ---------------------------------------------------------------
    // Instance Variables declared as private
    // ---------------------------------------------------------------

    /** AI model name (e.g. "GPT-4", "Claude 3"). */
    private String modelName;

    /** Subscription price in NPR per 1 Lakh (100,000) tokens. */
    private double price;

    /** Number of parameters in billions (e.g. 70 = 70 billion). */
    private int parameterCount;

    /**
     * Context window size as an integer number of tokens in thousands.
     * For example, 128 represents a 128K-token context window.
     */
    private int contextWindow;

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    /**
     * Constructs a new AIModel. Called by child classes via {@code super()}.
     *
     * @param modelName      name of the AI model
     * @param price          price per 1 Lakh tokens in NPR
     * @param parameterCount number of parameters in billions
     * @param contextWindow  context window size in thousands of tokens
     *                       (e.g. 128 = 128K)
     */
    public AIModel(String modelName, double price,
                   int parameterCount, int contextWindow) {
        this.modelName      = modelName;
        this.price          = price;
        this.parameterCount = parameterCount;
        this.contextWindow  = contextWindow;
    }

    // ---------------------------------------------------------------
    // Getters / Accessors
    // ---------------------------------------------------------------

    /** @return the AI model name */
    public String getModelName() {
        return modelName;
    }

    /** @return price per 1 Lakh tokens in NPR */
    public double getPrice() {
        return price;
    }

    /** @return parameter count in billions */
    public int getParameterCount() {
        return parameterCount;
    }

    /**
     * @return context window size in thousands of tokens
     *         (e.g. 128 represents 128K tokens)
     */
    public int getContextWindow() {
        return contextWindow;
    }

    // ---------------------------------------------------------------
    // Display Method
    // ---------------------------------------------------------------

    /**
     * Returns a formatted string of the core AIModel fields.
     * Subclasses ({@link PersonalPlan}, {@link ProPlan}) call
     * {@code super.display()} and append their own plan-specific
     * fields to the returned string.
     *
     * @return formatted string containing model name, price,
     *         parameter count, and context window
     */
    public String display() {
        return "======== AI Model Details ========" +
               "\nModel Name      : " + modelName +
               "\nPrice (per 1L)  : NPR " + price +
               "\nParameters      : " + parameterCount + " Billion" +
               "\nContext Window  : " + contextWindow + "K tokens";
    }

}
