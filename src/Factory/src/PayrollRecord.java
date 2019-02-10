package comp1549payrollproject;

/**
 * Represents a current payroll record consisting of a member of staff and the
 * number of normal and unsocial hours they have worked in the current payroll
 * period.
 */
public class PayrollRecord {

    private Staff staff;
    private int normalHours;
    private int unsocialHours;

    /**
     * Create a payroll record
     *
     * @param staff the member of staff whose hours are being recorded
     * @param normalHours the number of hours the member of staff worked to be paid at
     * the normal rate
     * @param unsocialHours the number of hours the member of staff worked to be paid at
     * the unsocial hours rate
     */
    public PayrollRecord(Staff staff, int normalHours, int unsocialHours) {
        this.staff = staff;
        this.normalHours = normalHours;
        this.unsocialHours = unsocialHours;
    }

    /**
     * Default constructor for a PayrollRecord.
     */
    public PayrollRecord() {
        this(null, 0, 0);
    }

    /**
     * Calculate the payment due to a member of staff at their normal hourly
     * rate for the specified number of hours
     *
     * @return amount to be paid to the member of staff based on their normal
     * hourly payment rate. Returns zero if no staff member recorded.
     */
    public float calculateNormalPayment() {
        // this uses the ternary conditional operator ?: to avoid a possible null pointer exception
        // see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html for an explanation
        return staff != null ? staff.calculateNormalPayment(normalHours) : 0;
    }

    /**
     * Calculate the payment due to a member of staff at their unsocial hourly
     * rate for the specified number of unsocial hours worked
     *
     * @return amount to be paid to the member of staff based on their normal
     * hourly payment rate. Returns zero if no staff member present
     */
    public float calculateUnSocialPayment() {
        return staff != null ? staff.calculateUnSocialPayment(unsocialHours) : 0;
    }

    /**
     * Calculate total amount due based on normal and unsocial hours.
     * @return total of normal payment plus unsocial payment due
     */
    public float calculateTotalPayment() {
        return calculateNormalPayment() + calculateUnSocialPayment();
    }
}
