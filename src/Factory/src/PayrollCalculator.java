package comp1549payrollproject;

import java.util.ArrayList;
import java.util.List;
import static comp1549payrollproject.Staff.*;

/**
 * Class which holds a list of payroll records and calculates the current total
 * payroll bill.
 */
public class PayrollCalculator {

    private List<PayrollRecord> payrollRecords;

    /**
     * Default constructor creates and empty list of payroll records
     */
    public PayrollCalculator() {
        this.payrollRecords = new ArrayList<>();
    }

    /**
     * Creates a payroll record and adds it to the list of payroll records
     *
     * @param name full name of the member of staff
     * @param hourlyRate default hourly payment rate for the member of staff
     * @param type the type of staff member
     * @param normalHours number of hours worked by the staff to be paid at
     * their normal hourly rate
     * @param unsocialHours number of hours worked by the member of staff at
     * their unsocial hourly rate
     */
    public void addPayrollRecord(String name, float hourlyRate, STAFF_TYPE type, int normalHours, int unsocialHours) {
        Staff newStaff = null;
        PayrollRecord newPayrollRecord;
        if (type == STAFF_TYPE.AGENCY) {
            newStaff = new AgencyStaff(name, hourlyRate);
        } else if (type == STAFF_TYPE.CONSULTANT) {
            newStaff = new Consultant(name, hourlyRate);
        } else if (type == STAFF_TYPE.ZERO) {
            newStaff = new ZeroHours(name, hourlyRate);
        }
        newPayrollRecord = new PayrollRecord(newStaff, normalHours, unsocialHours);
        payrollRecords.add(newPayrollRecord);
    }

    /**
     * Calculate and return the total current payroll bill
     *
     * @return the current total payroll bill including both normal and unsocial
     * hours worked based on all the records in the payroll records list.
     */
    public float getPayrollTotal() {
        float total = 0.0F;
        for (PayrollRecord pr : payrollRecords) {  // loop through all the records in the list
            total += pr.calculateTotalPayment();
        }
        return total;
    }
}
