package comp1549payrollproject;

/**
 * Represents a member of staff on a zero hours contract in the payroll system
 */
public class ZeroHours extends Staff {

    /**
     * Default constructor. Creates member of staff on a zero hours contract
     * with unknown name and zero hourly rate.
     */
    public ZeroHours() {
        this("unknown zero hours staff", 0);
    }

    /**
     * Creates a member of staff on a zero hours contract
     *
     * @param name full name of the member of staff
     * @param hourlyRate standard hourly payment rate for the member staff
     */
    public ZeroHours(String name, float hourlyRate) {
        super(name, hourlyRate);
    }

    /**
     * Calculate the payment due to a member of staff on a zero hours contract
     * at their normal hourly rate for the specified number of hours
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
     * Calculate the payment due to a member of staff on a zero hours contract at their unsocial
     * hourly rate for the specified number of unsocial hours worked
     *
     * @param hours number of unsocial hours worked
     * @return amount to be paid to the member of staff based on their unsocial
     * hours payment rate. Calculation is hourly rate x hours
     */
    @Override
    public float calculateUnSocialPayment(int hours) {
        return getHourlyRate() * hours;
    }
}
