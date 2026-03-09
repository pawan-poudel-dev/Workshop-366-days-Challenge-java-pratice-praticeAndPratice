/**
 * AIModel - Parent class representing an AI model subscription.
 * Stores model name, price per 1 Lakh tokens (NPR), parameter count (billions),
 * and context window size (e.g. "64K").
 */
public class AiModel {

    // ── Attributes ──────────────────────────────────────────────────────────────
    private String modelName;
    private double price;          // NPR per 1 Lakh tokens
    private int    parameterCount; // billions
    private String contextWindow;  // e.g. "64K", "128K"

    // ── Constructor ──────────────────────────────────────────────────────────────
    public AiModel(String modelName, double price, int parameterCount, String contextWindow) {
        this.modelName      = modelName;
        this.price          = price;
        this.parameterCount = parameterCount;
        this.contextWindow  = contextWindow;
    }

    // ── Accessor / Getter Methods ────────────────────────────────────────────────
    public String getModelName()      { return modelName; }
    public double getPrice()          { return price; }
    public int    getParameterCount() { return parameterCount; }
    public String getContextWindow()  { return contextWindow; }

    // ── display() ────────────────────────────────────────────────────────────────
    /**
     * Returns a formatted string with all AiModel attributes.
     */
    public String display() {
        return "Model Name      : " + modelName      + "\n" +
               "Price (NPR/1L)  : Rs. " + price      + "\n" +
               "Parameters      : " + parameterCount + " Billion\n" +
               "Context Window  : " + contextWindow;
    }
}