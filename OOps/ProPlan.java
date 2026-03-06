public class ProPlan extends AiModel {
    private int availableTeamSlots; // number of available slots for collaboration

    // Constructor
    public ProPlan(String modelName, double price, int parameterCount, String contextWindowSize, int availableTeamSlots) {
        super(modelName, price, parameterCount, contextWindowSize);
        this.availableTeamSlots = availableTeamSlots;
    }

    // Accessor method
    public int getAvailableTeamSlots() {
        return availableTeamSlots;
    }

    // Adds a team member if a slot is available, otherwise suggests upgrading
    public String addTeamMember(String teamMemberName) {
        if (availableTeamSlots > 0) {
            availableTeamSlots--;
            return "Successfully added team member: " + teamMemberName
                 + ". Available team slots remaining: " + availableTeamSlots;
        } else {
            return "No available team slots. Please remove a team member or consider upgrading your plan.";
        }
    }

    // Removes a team member and frees up a slot
    public String removeTeamMember(String teamMemberName) {
        availableTeamSlots++;
        return "Successfully removed team member: " + teamMemberName
             + ". Available team slots remaining: " + availableTeamSlots;
    }

    // Displays ProPlan-specific details
    @Override
    public String display() {
        return super.displayBaseInfo()
             + "\nAvailable Team Slots: " + availableTeamSlots;
    }
}
