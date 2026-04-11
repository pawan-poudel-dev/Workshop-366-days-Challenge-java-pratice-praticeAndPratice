
public class ProPlan extends AiModel {

    
    private int teamSlots; // available collaboration slots

    
    public ProPlan(String modelName, double price, int parameterCount,
                   String contextWindow, int teamSlots) {
        super(modelName, price, parameterCount, contextWindow);
        this.teamSlots = teamSlots;
    }

   
    public int getTeamSlots() { return teamSlots; }

    public String addTeamMember(String memberName) {
        if (teamSlots <= 0) {
            return "Error: No available team slots. " +
                   "Please upgrade your plan or remove an existing member.";
        }
        teamSlots--;
        return "Team member '" + memberName + "' added successfully. " +
               "Available slots remaining: " + teamSlots + ".";
    }

     
    public String removeTeamMember(String memberName) {
        teamSlots++;
        return "Team member '" + memberName + "' removed successfully. " +
               "Available slots now: " + teamSlots + ".";
    }
    public String enterPrompt(String promptText, int inputTokens,
                              int outputTokens, int systemTokens) {
        int contextLimit = parseContextWindow(getContextWindow());
        int totalTokens  = inputTokens + outputTokens + systemTokens;

        if (totalTokens > contextLimit) {
            return "Error: Total token usage (" + totalTokens +
                   ") exceeds the context window limit (" + contextLimit +
                   " tokens) for model '" + getModelName() + "'.";
        }

        // Pro plan: prompts are unlimited — no counter to decrement
        return "Prompt submitted successfully (Pro Plan – unlimited prompts).\n" +
               "  Prompt       : " + promptText + "\n" +
               "  Input Tokens : " + inputTokens + "\n" +
               "  Output Tokens: " + outputTokens + "\n" +
               "  System Tokens: " + systemTokens + "\n" +
               "  Total Tokens : " + totalTokens;
    }
    @Override
    public String display() {
        return super.display() + "\n" +
               "Plan Type       : Pro Plan (Team)\n" +
               "Team Slots Left : " + teamSlots;
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