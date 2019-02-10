package comp1549payrollproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static comp1549payrollproject.Staff.*;

/**
 * Class which contains methods to process a text file containing newStaff details
 */
public class StaffFileHandler {

    private List<Staff> staffList; // list of newStaff read from file

    /**
     * Default constructor creates an empty list of newStaff
     */
    public StaffFileHandler() {
        this.staffList = new ArrayList<>();
    }

    /**
     * Read newStaff data from a file and generate a list of newStaff records held in
 memory
     *
     * @param fileName name of text file to be read. Staff data consists of
 newStaff type, newStaff name and hourly rate each on separate lines.
     * @throws IOException thrown if file cannot be read e.g. if it is not found
     */
    public void readStaffFromFile(String fileName) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String staffType = br.readLine(); // read first line from file

            while (staffType != null && !staffType.equals("END")) { // while not got to end of file
                String name = br.readLine();  // read the name
                String hourlyRateStr = br.readLine(); // read the hourly rate
                float hourlyRate = Float.parseFloat(hourlyRateStr); // convert hourly rate to numeric
                Staff newStaff = null;

                // create appropriate newStaff object based on type of newStaff
                if (staffType.equals(STAFF_TYPE.AGENCY.toString())) {
                    newStaff = new AgencyStaff(name, hourlyRate);
                } else if (staffType.equals(STAFF_TYPE.CONSULTANT.toString())) {
                    newStaff = new Consultant(name, hourlyRate);
                } else if (staffType.equals(STAFF_TYPE.ZERO.toString())) {
                    newStaff = new ZeroHours(name, hourlyRate);
                }
                staffList.add(newStaff);  // add new newStaff object to the list
                staffType = br.readLine();  // read the next line
            }
        }
    }

    /**
     * Count the number of newStaff records read from file
     * @return the total number of newStaff records read from file
     */
    public int countOfStaff() {
        return staffList.size();
    }

    /**
     * Count the number of newStaff of a particular type read from file
     * @param type a class representing the type of newStaff to be counted
     * @return the number of newStaff of the particular type that have been read from file
     */
    public int countStaffOfType(Class type) {
        int count = 0;
        for (Staff s : staffList) {  // loop through whole list
            if (s.getClass().equals(type)) {
                count++;
            }
        }
        return count;
    }
}
