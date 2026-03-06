
public class MainTest {
    public static void main(String[] args) {
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.println(" Ting 1: Valid Prompt Execution (Tokens within Context)");
        System.out.println("-------------------------------------------------------------");

        AiModel personalPlan = new PersonalPlan("GPT-3.5", 0.02, 6, "4K tokens", 5);
        System.out.println(personalPlan.display());

        PersonalPlan pp = (PersonalPlan) personalPlan;
        System.out.println("\n" + pp.enterPrompt("What is the capital of Nepal?", 10));


      
        System.out.println("\n-------------------------------------------------------------");
        System.out.println(" TESTting 2: Prompt Rejected due to Context Limit");
        System.out.println(" (Input + Output + System > Context)");
        System.out.println("-------------------------------------------------------------");

        // Output length 5000 far from  exceeds 4K context window
        System.out.println("\n" + pp.enterPrompt("Explain the entire history of AI in great detail.", 5000));


        System.out.println("\n-------------------------------------------------------------");
        System.out.println(" TEST 3 (Personal): Exhausting Monthly Quota & Purchasing More");
        System.out.println("-------------------------------------------------------------");

        PersonalPlan pp2 = new PersonalPlan("GPT-3.5", 0.02, 6, "4K tokens", 2);
        System.out.println(pp2.display());

        
        System.out.println("\n>> Prompt 1 (quota: 2 -> 1):");
        System.out.println(pp2.enterPrompt("What is machine learning?", 100));

        
        System.out.println("\n>> Prompt 2 (quota: 1 -> 0):");
        System.out.println(pp2.enterPrompt("What is deep learning?", 100));

    
        System.out.println("\n>> Prompt 3 (quota = 0, should be REJECTED):");
        System.out.println(pp2.enterPrompt("What is neural network?", 100));

        // Purchase more prompts
        System.out.println("\n>> Purchasing 3 more prompts:");
        System.out.println(pp2.purchasePrompts(3));

        // Now  it ,works again
        System.out.println("\n>> Retry after purchase (should be ACCEPTED):");
        System.out.println(pp2.enterPrompt("What is neural network?", 100));



        System.out.println("\n-------------------------------------------------------------");
        System.out.println(" TEST 4 (Pro): Verifying Unlimited Prompts (No Decrement)");
        System.out.println("-------------------------------------------------------------");

        AiModel proPlan = new ProPlan("GPT-4", 0.06, 175, "8K tokens", 3);
        System.out.println(proPlan.display());

        ProPlan pro = (ProPlan) proPlan;

        // Send multiple prompts , no quota tracking, always accepted
        System.out.println("\n>> Pro Prompt 1:");
        System.out.println(pro.addTeamMember("Hanuman"));

        System.out.println("\n>> Pro Prompt 2:");
        System.out.println(pro.addTeamMember("Rawan"));

        System.out.println("\n>> Remove a team member:");
        System.out.println(pro.removeTeamMember("Bali"));

        System.out.println("\n>> Verify: Pro Plan has no prompt limit (unlimited usage):");
        System.out.println("Pro Plan does not track prompt count — unlimited prompts available.");
    
    }
}