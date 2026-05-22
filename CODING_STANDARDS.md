# 366 Days Java Challenge - Coding Standards & Best Practices

## 🎯 Professional Java Coding Standards

### 1. **Project Structure**

```
AISubscriptionManagementSystem/
├── src/
│   ├── models/
│   │   ├── SubscriptionModel.java
│   │   ├── Plan.java
│   │   └── User.java
│   │
│   ├── services/
│   │   ├── SubscriptionService.java
│   │   ├── PaymentService.java
│   │   └── NotificationService.java
│   │
│   ├── ui/
│   │   ├── SubscriptionGUI.java
│   │   ├── LoginFrame.java
│   │   └── DashboardFrame.java
│   │
│   ├── utils/
│   │   ├── Constants.java
│   │   ├── ValidationUtils.java
│   │   └── FileUtils.java
│   │
│   └── Main.java
│
├── resources/
│   ├── config/
│   ├── data/
│   └── images/
│
├── tests/
│   ├── models/
│   ├── services/
│   └── utils/
│
├── docs/
├── build.xml
└── README.md
```

### 2. **Class Structure**

```java
/**
 * Manages subscription operations and plan selection.
 * 
 * @author Pawan Poudel
 * @version 1.0
 * @since 2026-05-22
 */
public class SubscriptionManager {
    
    // ===== CLASS CONSTANTS =====
    private static final String LOG_PREFIX = "SubscriptionManager: ";
    private static final int MAX_PLANS = 5;
    
    // ===== INSTANCE VARIABLES =====
    private List<Plan> plans;
    private User currentUser;
    private boolean isActive;
    
    // ===== CONSTRUCTORS =====
    
    /**
     * Initializes SubscriptionManager with empty plans.
     */
    public SubscriptionManager() {
        this.plans = new ArrayList<>();
        this.isActive = true;
    }
    
    /**
     * Initializes SubscriptionManager with existing plans.
     * 
     * @param plans the initial plans
     */
    public SubscriptionManager(List<Plan> plans) {
        this.plans = new ArrayList<>(plans);
        this.isActive = true;
    }
    
    // ===== PUBLIC METHODS =====
    
    /**
     * Adds a new subscription plan.
     * 
     * @param plan the plan to add
     * @return true if added successfully, false otherwise
     */
    public boolean addPlan(Plan plan) {
        if (plan == null || plans.size() >= MAX_PLANS) {
            return false;
        }
        return plans.add(plan);
    }
    
    /**
     * Retrieves a plan by name.
     * 
     * @param planName the name of the plan
     * @return the Plan object, or null if not found
     */
    public Plan getPlanByName(String planName) {
        for (Plan plan : plans) {
            if (plan.getName().equals(planName)) {
                return plan;
            }
        }
        return null;
    }
    
    // ===== PRIVATE METHODS =====
    
    /**
     * Validates the plan before adding.
     * 
     * @param plan the plan to validate
     * @return true if valid, false otherwise
     */
    private boolean validatePlan(Plan plan) {
        return plan != null && 
               plan.getName() != null && 
               !plan.getName().isEmpty();
    }
    
    // ===== GETTERS & SETTERS =====
    
    public List<Plan> getPlans() {
        return new ArrayList<>(plans);
    }
    
    public User getCurrentUser() {
        return currentUser;
    }
    
    public void setCurrentUser(User user) {
        this.currentUser = user;
    }
    
    public boolean isActive() {
        return isActive;
    }
}
```

### 3. **Naming Conventions**

```java
// ✅ Classes - PascalCase
public class AIModel { }
public class PersonalPlan { }
public class SubscriptionGUI { }

// ✅ Methods - camelCase
public void calculatePrice() { }
public String getUserName() { }
private boolean validateInput() { }

// ✅ Variables - camelCase
private String userName;
private int maxAttempts;
private boolean isActive;
private static final String API_KEY = "key";

// ✅ Constants - UPPER_SNAKE_CASE
private static final int MAX_USERS = 100;
private static final double DEFAULT_PRICE = 9.99;
private static final String CONFIG_FILE = "config.properties";

// ❌ Avoid
private int max_attempts;  // Use camelCase
public void calculatePrice_WithTax() { }  // Use camelCase
public void CALCULATE_PRICE() { }  // Use camelCase
```

### 4. **Comments & Documentation**

```java
// ✅ Comprehensive JavaDoc
/**
 * Calculates the subscription price based on the selected plan and duration.
 * 
 * This method applies promotional discounts if applicable and calculates
 * taxes based on the user's location.
 *
 * @param plan the selected subscription plan
 * @param durationMonths the number of months for the subscription
 * @param userLocation the user's location for tax calculation
 * @return the total price including taxes and discounts
 * @throws IllegalArgumentException if durationMonths is less than 1
 * @throws NullPointerException if plan or userLocation is null
 * 
 * @see Plan#getBasePrice()
 * @see TaxCalculator#calculateTax(String, double)
 */
public double calculateTotalPrice(Plan plan, int durationMonths, 
                                  String userLocation) {
    if (durationMonths < 1) {
        throw new IllegalArgumentException("Duration must be at least 1 month");
    }
    // Implementation...
}

// ✅ Clear inline comments
// Apply promotional discount if available
double discount = plan.getPromotionalDiscount();
double finalPrice = basePrice - (basePrice * discount);

// ⚠️ Acceptable - Explain WHY, not WHAT
// Using LinkedList instead of ArrayList for O(1) insertion at beginning
LinkedList<String> eventLog = new LinkedList<>();

// ❌ Obvious comments (remove)
int i = 0;  // Initialize i to 0
System.out.println(name);  // Print name
```

### 5. **Error Handling**

```java
// ✅ Good - Specific exception handling
try {
    int marks = Integer.parseInt(input);
    if (marks < 0 || marks > 100) {
        throw new IllegalArgumentException(
            "Marks must be between 0 and 100");
    }
    return marks;
} catch (NumberFormatException e) {
    LOG.error("Invalid marks format: " + e.getMessage());
    throw new InvalidInputException("Marks must be numeric", e);
} catch (IllegalArgumentException e) {
    LOG.warn("Invalid marks range: " + e.getMessage());
    throw e;
}

// ❌ Bad - Generic exception handling
try {
    int marks = Integer.parseInt(input);
} catch (Exception e) {
    System.out.println("Error");
}
```

### 6. **Code Formatting**

```java
// ✅ Good formatting
public class SubscriptionManager {
    
    public void processSubscription(Plan plan, User user) {
        // Validate inputs
        if (plan == null || user == null) {
            throw new IllegalArgumentException("Plan and User cannot be null");
        }
        
        // Process payment
        double amount = plan.getPrice();
        boolean paymentSuccess = processPayment(user, amount);
        
        if (paymentSuccess) {
            // Update subscription
            user.setActivePlan(plan);
            sendConfirmationEmail(user);
        }
    }
}

// ❌ Bad formatting
public class SubscriptionManager{
public void processSubscription(Plan plan, User user){
if(plan==null||user==null){throw new IllegalArgumentException("error");}
double amount=plan.getPrice();
boolean paymentSuccess=processPayment(user,amount);
if(paymentSuccess){user.setActivePlan(plan);sendConfirmationEmail(user);}}}
```

### 7. **Method Length**

```java
// ✅ Good - Focused, single responsibility
public void processUserRegistration(String email, String password) {
    User newUser = createUser(email, password);
    validateUser(newUser);
    saveUserToDatabase(newUser);
    sendWelcomeEmail(newUser);
}

// ✅ Extract complex logic to separate methods
private boolean validateEmail(String email) {
    return email != null && email.contains("@");
}

private User createUser(String email, String password) {
    User user = new User();
    user.setEmail(email);
    user.setPassword(encryptPassword(password));
    return user;
}

// ❌ Bad - Too long, multiple responsibilities
public void processUserRegistration(String email, String password) {
    if (email == null || !email.contains("@")) {
        throw new IllegalArgumentException("Invalid email");
    }
    if (password == null || password.length() < 8) {
        throw new IllegalArgumentException("Weak password");
    }
    // ... 50 more lines of mixed logic
}
```

### 8. **Logging**

```java
// ✅ Use logging framework (SLF4J/Log4j)
private static final Logger LOG = LoggerFactory.getLogger(
    SubscriptionManager.class);

public void activateSubscription(String userId) {
    LOG.info("Activating subscription for user: {}", userId);
    try {
        Subscription subscription = getSubscription(userId);
        subscription.activate();
        LOG.debug("Subscription activated successfully");
    } catch (NotFoundException e) {
        LOG.error("Subscription not found for user: {}", userId, e);
        throw e;
    }
}

// ❌ Bad - Using System.out.println
System.out.println("Activating subscription");
System.err.println("Error occurred");
```

---

## ✅ Pre-Submission Checklist

- [ ] Code follows naming conventions
- [ ] All public methods have JavaDoc
- [ ] Proper class structure and organization
- [ ] Specific exception handling
- [ ] No System.out for logging
- [ ] No unused variables or imports
- [ ] Maximum method length: 30-40 lines
- [ ] Proper indentation (4 spaces)
- [ ] Line length < 100 characters
- [ ] Single responsibility principle
- [ ] DRY (Don't Repeat Yourself)
- [ ] Programs compile without warnings
- [ ] All tests pass
- [ ] README updated

---

**Follow these standards for professional Java development!**
