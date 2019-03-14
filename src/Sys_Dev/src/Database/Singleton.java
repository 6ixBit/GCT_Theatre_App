package Database;

//Import DB stuff
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



//Singleton Design Pattern - All Classes that talk to database go through this class
public class Singleton {

    private static Singleton instance = null;

    //Check Login status
    public static boolean status = false;
    
    //Check if Login username already exists
    public static boolean exists = false;

    //So that other classes can't create an instance of it
    private Singleton() {
    }

    //Method which returns an object of this singleton class
    public static synchronized Singleton getInstance() {

        if (instance == null) { //Prevents two instances being created at the same time
            instance = new Singleton();
        }
        return instance;
    }

    //Insert Sign up Info into database
    public static void InsertData(String user, String pass, String address, String numb, String email, String postcode) {

        Connection connect = null; //Set connector to null
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder
            System.out.println("Connection to database successfull");

            PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO User (username, passw, number, address, postcode, e_mail)VALUES(?, ?, ?, ?, ?, ?)"); //SQL statement to get data
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, numb);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, postcode);
            preparedStatement.executeUpdate();

            connect.close();
            preparedStatement.close();
            System.out.println("User signed up");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Check DB for User Login
    public static void login(String user, String pass) {

        Connection connect = null; //Set connector to null

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder
            System.out.println("Connection to database successfull");

            PreparedStatement preparedStatement = connect.prepareStatement("SELECT username,passw FROM User WHERE username=? AND passw=?"); //SQL statement to get data
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);
            ResultSet rset = preparedStatement.executeQuery(); //Creating resultset object

            if (rset.next()) {
                status = true; //Setting boolean to true
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or passowrd", "Access Denied", JOptionPane.ERROR_MESSAGE); //Throw error to user if username not found
            }
            connect.close();
            preparedStatement.close();
            System.out.println("User Logged in");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        //Throw Messagebox if Username not found
    }

    public static void check_user_exists(String Login) {
        Connection connect = null; //Set connector to null

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder
            System.out.println("Connection to database successfull");

            PreparedStatement preparedStatement = connect.prepareStatement("SELECT username FROM User WHERE username=?"); //SQL statement to get data
            preparedStatement.setString(1, Login);

            ResultSet rset = preparedStatement.executeQuery(); //Creating resultset object

            if (rset.next()) {
                exists = true; //Sets boolean true to alert GUI that user already exists
            } else {
                System.out.println("You can now log in"); //Throw error to user if username not found
                exists = false;
            }
            connect.close();
            preparedStatement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    //Takes in 3 ArrayLists which hold Name, Date and Images of each event
    public static void Event_Images(ArrayList img, ArrayList desc, ArrayList date, ArrayList name, ArrayList price, ArrayList time) {

        //Count items being passed - Test - Remove when done
        int count = 0;

        Connection connect = null; //Set connector to null

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder
            System.out.println("Connection to database successfull");

            PreparedStatement preparedStatement = connect.prepareStatement("SELECT image FROM Event"); //SQL statement to get data
            ResultSet rset = preparedStatement.executeQuery(); //Creating resultset object

            PreparedStatement preparedStatement2 = connect.prepareStatement("SELECT description FROM Event"); //SQL statement to get data
            ResultSet rset2 = preparedStatement2.executeQuery(); //Creating resultset object

            PreparedStatement preparedStatement3 = connect.prepareStatement("SELECT event_date FROM Event"); //SQL statement to get data
            ResultSet rset3 = preparedStatement3.executeQuery(); //Creating resultset object

            PreparedStatement preparedStatement4 = connect.prepareStatement("SELECT event_name FROM Event"); //SQL statement to get data
            ResultSet rset4 = preparedStatement4.executeQuery(); //Creating resultset object
            
             PreparedStatement preparedStatement5 = connect.prepareStatement("SELECT event_price FROM Event"); //SQL statement to get data
            ResultSet rset5 = preparedStatement5.executeQuery(); //Creating resultset object
            
            PreparedStatement preparedStatement6 = connect.prepareStatement("SELECT event_time FROM Event"); //SQL statement to get data
            ResultSet rset6 = preparedStatement6.executeQuery(); //Creating resultset object


            //Loop through objects in DB - Adds images to arraylist to then be loaded by program
            while (rset.next()) {
                count++;
                img.add(rset.getBytes("image"));
            }

            //Add descriptions to list to be read from
            while (rset2.next()) {
                desc.add(rset2.getString("description"));
            }
            //Add dates to list
            while (rset3.next()) {
                date.add(rset3.getString("event_date"));
            }

            //Adds name to list
            while (rset4.next()) {
                name.add(rset4.getString("event_name"));
            }
            
            while (rset5.next()) {
                price.add(rset5.getString("event_price"));
            }
            
            while (rset6.next()) {
                time.add(rset6.getString("event_time"));
            }

            System.out.println("Counted = " + count);
            connect.close();
            preparedStatement.close();
            System.out.println("Images Loaded successfully");

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    public static void User_Orders(String username, ArrayList Total_prices, ArrayList Receipt_dates, ArrayList Receipt_nos) {

        Connection connect = null; //Set connector to null

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder

            PreparedStatement preparedStatement = connect.prepareStatement("SELECT Total_Price,Receipt_date,ReceiptNo FROM User AS u, Receipt AS r WHERE u.username=? AND u.ID = r.UserID"); //SQL statement to get data
            preparedStatement.setString(1, username);
            ResultSet rset = preparedStatement.executeQuery(); //Creating resultset object

            while (rset.next()) {
                Total_prices.add(rset.getString("Total_price"));
                Receipt_dates.add(rset.getString("Receipt_date"));
                Receipt_nos.add(rset.getString("ReceiptNo"));
            }

            connect.close();
            preparedStatement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Call this method to clear object to avoid data collision when reusing the object
    public static void clear(String user, String pass, String address, String numb, String email, String postcode) {
        user = "";
        pass = "";
        address = "";
        numb = "";
        email = "";
        postcode = "";
    }
}
