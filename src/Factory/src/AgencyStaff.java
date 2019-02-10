package comp1549payrollproject;

import static comp1549payrollproject.Constants.*;

/**
 * Represents a member of agency staff in the payroll system
 */
public class AgencyStaff extends Staff {

    /**
     * Default constructor. Creates member of agency staff with unknown name and
     * zero hourly rate.
     */
    public AgencyStaff() {
        this("unknown agency staff", 0);
    }

    /**
     * Creates a member of agency staff
     *
     * @param name full name of the member of agency staff
     * @param hourlyRate standard hourly payment rate for the member of agency
     * staff
     */
    public AgencyStaff(String name, float hourlyRate) {
        super(name, hourlyRate);
    }

    /**
     * Calculate the payment due to a member of agency staff at their normal
     * hourly rate for the specified number of hours
     *
     * @param hours number of hours worked
     * @return amount to be paid to the member of staff based on their normal
     * hourly payment rate. Calculation is hourly rate x hours worked
     */
    @Override
    public float calculateNormalPayment(int hours) {
        return getHourlyRate() * hours;
    }

    /**
     * Calculate the payment due to a member of agency staff at their unsocial
     * hourly rate for the specified number of unsocial hours worked
     *
     * @param hours number of unsocial hours worked
     * @return amount to be paid to the member of staff based on their unsocial
     * hours payment rate. Calculation is hourly rate x hours x UNSOCIAL_RATE_MULTIPLIER
     */
    @Override
    public float calculateUnSocialPayment(int hours) {
        return getHourlyRate() * hours * UNSOCIAL_RATE_MULTIPLIER;
    }
}
