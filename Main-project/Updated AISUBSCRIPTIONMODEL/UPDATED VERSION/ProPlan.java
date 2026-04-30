/**
 * Represents a Professional (Pro) subscription plan for an AI model.
 * Designed for teams that require collaboration features.
 *
 * <p>
 * Tracks available team member slots. Slots are consumed when members
 * are added and freed when members are removed. The slot count is
 * dynamic — no fixed upper cap is enforced.
 * </p>
 *
 * @author  Pawan Poudel
 * @version 2.0
 * @see     AIModel
 */
public class ProPlan extends AIModel {

    // ---------------------------------------------------------------
    // Instance Variables
    // ---------------------------------------------------------------

    /**
     * Current available team member slots.
     * Decrements on {@code addTeamMember}, increments on
     * {@code removeTeamMember}.
     */
    private int teamSlots;

    /**
     * The original slot count provided at construction.
     * Stored for informational display only.
     */
    private int initialSlots;

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
     * @param contextWindow  context window size in thousands of tokens
     *                       (e.g. 128 = 128K)
     * @param teamSlots      initial number of available team member slots
     */
    public ProPlan(String modelName, double price,
                   int parameterCount, int contextWindow,
                   int teamSlots) {
        super(modelName, price, parameterCount, contextWindow);
        this.teamSlots    = teamSlots;
        this.initialSlots = teamSlots;
    }

    // ---------------------------------------------------------------
    // Getter
    // ---------------------------------------------------------------

    /** @return current number of available team member slots */
    public int getTeamSlots() {
        return teamSlots;
    }

    // ---------------------------------------------------------------
    // Methods
    // ---------------------------------------------------------------

    /**
     * Adds a team member, consuming one available slot.
     * Returns an error message if no slots remain.
     *
     * @param memberName name of the team member to add
     * @return success message with updated slot count, or an error if
     *         no slots remain
     */
    public String addTeamMember(String memberName) {
        if (teamSlots > 0) {
            teamSlots--;
            return "Success! '" + memberName + "' has been added to the team." +
                   "\nRemaining Slots: " + teamSlots;
        } else {
            return "Error: No team slots available! " +
                   "All " + initialSlots + " slots are currently occupied.";
        }
    }

    /**
     * Removes a team member, freeing one slot.
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
     * Returns all plan details by overriding {@code display()} from
     * {@link AIModel}. Calls {@code super.display()} to obtain the
     * base model fields, then appends team slot information.
     *
     * @return formatted string with all AIModel fields plus team slot info
     */
    @Override
    public String display() {
        return super.display() +
               "\n--- Pro Plan ---" +
               "\nTeam Slots Available : " + teamSlots +
               "\nInitial Slot Count   : " + initialSlots;
    }

}
