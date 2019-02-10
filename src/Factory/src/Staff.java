package comp1549payrollproject;

/**
 * Base class for Staff in the payroll system.
 */
public abstract class Staff {

    /**
     * Full name for the member of staff
     */
    private String name;

    /**
     * Standard hourly payment rate for the member of staff
     */
    private float hourlyRate;

    // enumerated type of the various types of staff dealt with by the system
    public static enum STAFF_TYPE {

        AGENCY, ZERO, CONSULTANT
    }

    /**
     * Default constructor. Creates a member of staff with unknown name and zero
     * hourly rate.
     */
    public Staff() {
        this("unknown staff", 0);
    }

    /**
     * Creates a member of staff
     *
     * @param name full name of the member of staff
     * @param hourlyRate standard hourly payment rate for the member of staff
     */
    public Staff(String name, float hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public String getName() {
        return name;
    }

    /**
     * Calculate the payment due to a member of staff at their normal hourly
     * rate for the specified number of hours
     *
     * @param hours number of hours worked
     * @return amount to be paid to the member of staff based on their normal
     * hourly payment rate
     */
    public abstract float calculateNormalPayment(int hours);

    /**
     * Calculate the payment due to a member of staff at their unsocial hourly 
     * rate for the specified number of unsocial hours worked
     *
     * @param hours number of unsocial hours worked
     * @return amount to be paid to the member of staff based on their unsocial hours
     * payment rate
     */
    public abstract float calculateUnSocialPayment(int hours);

}
