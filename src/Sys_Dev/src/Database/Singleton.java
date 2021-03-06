package Database;

//Import DB stuff
import Main.IF_tick;
import java.sql.Array;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Singleton Design Pattern - All Classes that talk to database go through this class
public class Singleton implements IF_tick {

    private static Singleton instance = null;

    //Check Login status
    public static boolean status = false;
    
    //Check if Login username already exists
    public static boolean exists = false;
    
    //Check if Reviews exists
    public static boolean review_exists = false;

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
    public static void InsertData(String user, String pass, String address, String numb, String email, String postcode) { //Insert sign up info for users

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
    public static int login(String user, String pass) {

        int id = 0; //Setting up int to hold ID of user logged in

        Connection connect = null; //Set connector to null

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder

            PreparedStatement preparedStatement = connect.prepareStatement("SELECT username,passw, ID FROM User WHERE username=? AND passw=?"); //SQL statement to get data
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);
            ResultSet rset = preparedStatement.executeQuery(); //Creating resultset object

            PreparedStatement preparedStatement2 = connect.prepareStatement("SELECT ID FROM User WHERE username=?"); //SQL statement to get data
            preparedStatement2.setString(1, user);
            ResultSet rset2 = preparedStatement2.executeQuery();

            if (rset.next()) {
                status = true; //Setting boolean to true
                if (rset2.next()) {
                    id = rset2.getInt("ID"); //If the user exists then make id = the users logged in ID
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or passowrd", "Access Denied", JOptionPane.ERROR_MESSAGE); //Throw error to user if username not found
            }
            connect.close();
            preparedStatement.close();
            System.out.println("User Logged in");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return id;
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
      
    public static void insert(int userid, int[] ticket_no, int[] eventid, String[] seat_no, double[] ticketPrice) { //Method to insert ticket info for users

        Connection connect = null; //Set connector to null
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder

            PreparedStatement preparedStatement = null;

            for (int i = 0; i < eventid.length; i++) {
                preparedStatement = connect.prepareStatement("INSERT INTO Ticket (UserID, TicketNo, EventID, seat_no, TicketPrice) VALUES (?, ?, ?, ?, ?)"); //Set prepared statement for SQL command
                preparedStatement.setInt(1, userid);
                preparedStatement.setInt(2, ticket_no[i]);
                preparedStatement.setInt(3, eventid[i]);
                preparedStatement.setString(4, seat_no[i]);
                preparedStatement.setDouble(5, ticketPrice[i]);
                int j = preparedStatement.executeUpdate();
                System.out.println(j + " Records inserted");
            }

            connect.close();
            preparedStatement.close();
            System.out.println("Ticket Order logged ");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    public static void insert_review(String info, int rating, int eventID) {

        Connection connect = null; //Set connector to null

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder

            PreparedStatement preparedStatement = null;

            preparedStatement = connect.prepareStatement("INSERT INTO Reviews (info, Rating, EventID) VALUES (?, ?, ?);"); //Set prepared statement for SQL command
            preparedStatement.setString(1, info);
            preparedStatement.setInt(2, rating);
            preparedStatement.setInt(3, eventID);
            preparedStatement.execute();
            
            System.out.println("Writing review sucessful");

            connect.close();
            preparedStatement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static int read_eventid(String event_name) {
        Connection connect = null; //Set connector to null

        int id = 0;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder

            PreparedStatement preparedStatement = null;

            preparedStatement = connect.prepareStatement("SELECT ID FROM Event WHERE event_name=?;"); //Set prepared statement for SQL command
            preparedStatement.setString(1, event_name);
            ResultSet rset = preparedStatement.executeQuery(); //Creating resultset object

            if (rset.next()) {
                id = rset.getInt("ID");
            }

            connect.close();
            preparedStatement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }
    
    public static void read_review(ArrayList event_name, ArrayList info, ArrayList ratings, String event) {

        Connection connect = null; //Set connector to null

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder

            PreparedStatement preparedStatement = connect.prepareStatement("SELECT info, Rating, event_name FROM Reviews As r, Event AS e WHERE r.EventID = e.ID AND e.event_name =?"); //SQL statement to get data
            preparedStatement.setString(1, event);
            ResultSet rset = preparedStatement.executeQuery(); //Creating resultset object
           

             while (rset.next()) { //Add values from DB query to arraylists
                event_name.add(rset.getString("event_name"));
                info.add(rset.getString("info"));
                ratings.add(rset.getString("Rating"));
                review_exists = true;
             }
           if (rset.next()){
               review_exists = true;
           }

            connect.close();
            preparedStatement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    public static void insert_receipt(int userid, String shipping_method, String receipt_no, String date, double totalPrice) {

        Connection connect = null; //Set connector to null
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Loading driver

            connect = DriverManager.getConnection("jdbc:ucanaccess://./GCT.accdb"); //String path to database which is the main project source folder

            PreparedStatement preparedStatement = null;

            preparedStatement = connect.prepareStatement("INSERT INTO Receipt (UserID, Shipping_method, ReceiptNo, Receipt_date, Total_price) VALUES (?, ?, ?, ?, ?)"); //Set prepared statement for SQL command
            preparedStatement.setInt(1, userid);
            preparedStatement.setString(2, shipping_method);
            preparedStatement.setString(3, receipt_no);
            preparedStatement.setString(4, date);
            preparedStatement.setDouble(5, totalPrice);
            preparedStatement.executeUpdate();

            connect.close();
            preparedStatement.close();
            System.out.println("Receipt Order logged ");
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
