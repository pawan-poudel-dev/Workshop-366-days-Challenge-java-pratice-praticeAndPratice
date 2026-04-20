/**
 * AIModel is  a base class for all AI subscription plan types.
 * Stores the core attributes of any AI model: name, pricing,
 * parameter count, and context window size it ensures the data binding and protecting  from unauthorized access outside  the class by implementing  encapsulation.
 *
 * <p>Both {@link PersonalPlan} and {@link ProPlan} extend this class.</p>
 *
 * @author  Pawan Poudel
 * @version 1.0
 */
public class AIModel {

    // ---------------------------------------------------------------
    // Instance Variables declaare as private 
    // ---------------------------------------------------------------

    /** AI model name (e.g. "GPT-4", "Claude 3"). */
    private String modelName;

    /** Subscription price in NPR per 1 Lakh (100,000) tokens. */
    private double price;

    /** Number of parameters in billions (e.g. 70 = 70 billion). */
    private int parameterCount;

    /** Context window size stored as a String (e.g. "64K", "128K", "1M"). */
    private String contextWindow;


    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------
    /**
     * Constructs a new AIModel. Called by child classes via {@code super()}.
     *
     * @param modelName      name of the AI model
     * @param price          price per 1 Lakh tokens in NPR
     * @param parameterCount number of parameters in billions
     * @param contextWindow  context window size (e.g. "64K")
     */
    public AIModel(String modelName, double price,
                   int parameterCount, String contextWindow) {
        this.modelName      = modelName;
        this.price          = price;
        this.parameterCount = parameterCount;
        this.contextWindow  = contextWindow;
    }


    // ---------------------------------------------------------------
    // Getters/accessors - to read the value from the private variables
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

    /** @return context window size (e.g. "64K") */
    public String getContextWindow() {
        return contextWindow;
    }


    // ---------------------------------------------------------------
    // Display method
    // ---------------------------------------------------------------
    /**
     * Returns a formatted string of this model's main attributes.
     * Overridden by {@link PersonalPlan} and {@link ProPlan}, which call
     * {@code super.display()} before appending their own fields.
     *
     * @return formatted string with model name, price, parameters, and context window
     */
    public String display() {
        return "======== AI Model Details ========" +
               "\nModel Name      : " + modelName +
               "\nPrice (per 1L)  : NPR " + price +
               "\nParameters      : " + parameterCount + " Billion" +
               "\nContext Window  : " + contextWindow;
    }

}