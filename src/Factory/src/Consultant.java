package comp1549payrollproject;

import static comp1549payrollproject.Constants.*;

/**
 * Represents an external consultant in the payroll system
 */
public class Consultant extends Staff {

    /**
     * Default constructor. Creates a consultant with unknown name and zero
     * hourly rate.
     */
    public Consultant() {
        this("unknown consultant", 0);
    }

    /**
     * Creates a consultant
     *
     * @param name full name of the consultant
     * @param hourlyRate standard hourly payment rate for the consultant 
     */
    public Consultant(String name, float hourlyRate) {
        super(name, hourlyRate);
    }

    /**
     * Calculate the payment due to a consultant at their normal hourly rate for
     * the specified number of hours
     *
     * @param hours number of hours worked
     * @return amount to be paid to the consultant based on their normal
     * hourly payment rate. Calculation is hourly rate x hours worked + VAT
     */
    @Override
    public float calculateNormalPayment(int hours) {
        float basic = getHourlyRate() * hours;
        return (basic + (basic * VAT / 100));
    }

     /**
     * Calculate the payment due to a consultant at their unsocial
     * hourly rate for the specified number of unsocial hours worked
     *
     * @param hours number of hours worked
     * @return amount to be paid to the consultant based on their unsocial
     * hours payment rate. Calculation is hourly rate x hours worked weighted
     * using the UNSOCIAL_RATE_MULTIPLIER + VAT
     */
    @Override
    public float calculateUnSocialPayment(int hours) {
        float basic = getHourlyRate() * hours * UNSOCIAL_RATE_MULTIPLIER;
        return (basic + (basic * VAT / 100));
    }
}
