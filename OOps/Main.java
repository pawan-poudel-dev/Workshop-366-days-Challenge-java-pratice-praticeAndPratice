
public class Main {
    public static void main(String[] args) {

        // --- Personal Plan ---
        // AiModel reference holds a PersonalPlan instance (polymorphism)
        AiModel personalPlan = new PersonalPlan("GPT-3.5", 0.02, 6, "4K tokens", 5);
        System.out.println("=== Personal Plan ===");
        System.out.println(personalPlan.display());

        // Cast needed to access PersonalPlan-specific methods
        PersonalPlan pp = (PersonalPlan) personalPlan;
        System.out.println("\n" + pp.enterPrompt("What is the capital of Nepal?", 10));
        System.out.println(pp.purchasePrompts(3));
        System.out.println(pp.purchasePrompts(-1)); // validation test

        System.out.println("\n");

        // --- Pro Plan ---
        AiModel proPlan = new ProPlan("GPT-4", 0.06, 175, "8K tokens", 3);
        System.out.println("=== Pro Plan ===");
        System.out.println(proPlan.display());

        // Cast needed to access ProPlan-specific methods
        ProPlan pro = (ProPlan) proPlan;
        System.out.println("\n" + pro.addTeamMember("Hanuman"));
        System.out.println(pro.addTeamMember("Rawan"));
        System.out.println(pro.removeTeamMember("Bali"));
    }
}

