/**
 * Represents a Professional (Pro) subscription plan for an AI model.
 * Designed for teams that require collaboration features  basically for the grou[s or organizations].
 *
 * <p>Tracks available team member slots — slots are consumed when members
 * are added and freed when members are removed.</p>
 *
 * @author  Pawan Poudel
 * @version 1.0
 * @see     AIModel
 */
public class ProPlan extends AIModel {

    // ---------------------------------------------------------------
    // Instance Variable
    // ---------------------------------------------------------------

    /**
     * Available team member slots. Decrements on {@code addTeamMember}
     * and increments on {@code removeTeamMember}.
     */
    private int teamSlots;

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------
    /**
     * Constructs a new ProPlan. The first four parameters are passed
     * to the parent {@link AIModel} constructor via {@code super()}.
     *
     * @param modelName      name of the AI model
     * @param price          price per 1 Lakh tokens in NPR
     * @param parameterCount number of parameters in billions
     * @param contextWindow  context window size (e.g. "128K")
     * @param teamSlots      initial number of available team slots
     */
    public ProPlan(String modelName, double price,
                   int parameterCount, String contextWindow,
                   int teamSlots) {
        super(modelName, price, parameterCount, contextWindow);
        this.teamSlots = teamSlots;
    }

    // ---------------------------------------------------------------
    // Getter
    // ---------------------------------------------------------------

    /** @return number of available team member slots */
    public int getTeamSlots() {
        return teamSlots;
    }

    // ---------------------------------------------------------------
    // Methods
    // ---------------------------------------------------------------

    /**
     * Adds a team member, consuming one slot.
     * Returns an error message if no slots are available.
     *
     * @param memberName name of the team member to add
     * @return success message with updated slot count, or an error if no slots remain
     */
    public String addTeamMember(String memberName) {

        if (teamSlots > 0) {
            teamSlots--;
            return "Success! '" + memberName + "' has been added to the team." +
                   "\nRemaining Slots: " + teamSlots;
        } else {
            return "Error: No team slots available! " +
                   "Please upgrade your plan to add more members.";
        }
    }


    /**
     * Removes a team member, freeing one slot.
     * Assumes the caller provides a valid member name.
     *
     * @param memberName name of the team member to remove
     * @return confirmation message with updated slot count
     */
    public String removeTeamMember(String memberName) {
        teamSlots++;
        return "'" + memberName + "' has been removed from the team." +
               "\nAvailable Slots: " + teamSlots;
    }

    /**
     * Returns all plan details, including inherited {@link AIModel} attributes.
     * Calls {@code super.display()} then appends the available team slot count.
     *
     * @return formatted string with all AIModel fields plus available team slots
     */
    @Override
    public String display() {
        return super.display() +
               "\n--- Pro Plan ---" +
               "\nTeam Slots Available : " + teamSlots;
    }

}