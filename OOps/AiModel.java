public abstract class AiModel {
    private String modelName;
    private double price;           // in Nepali Rupee(s) per 1 Lakh tokens
    private int parameterCount;     // in billions
    private String contextWindowSize; // in tokens

    // Constructor
    public AiModel(String modelName, double price, int parameterCount, String contextWindowSize) {
        this.modelName = modelName;
        this.price = price;
        this.parameterCount = parameterCount;
        this.contextWindowSize = contextWindowSize;
    }

    // Accessor/getter methods
    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    public int getParameterCount() {
        return parameterCount;
    }

    public String getContextWindowSize() {
        return contextWindowSize;
    }

    // Abstract display method — must be implemented by subclasses
    public abstract String display();

    // Shared base info used by subclass display() methods
    public String displayBaseInfo() {
        return "Model Name: " + modelName
             + "\nPrice: " + price + " NPR per 1 Lakh tokens"
             + "\nParameter Count: " + parameterCount + " billion"
             + "\nContext Window Size: " + contextWindowSize;
    }
}
