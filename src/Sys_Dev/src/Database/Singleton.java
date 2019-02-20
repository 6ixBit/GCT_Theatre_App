
package Database;

//Import DB stuff
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//Singleton Design Pattern - All Classes that talk to database go through this class
public class Singleton {
    
    private static Singleton instance = null;
    
    //So that other classes can't create an instance of it
    private Singleton(){
    }
    
    //Method which returns an object of this singleton class
    public static synchronized Singleton getInstance(){
     
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
     public static void login(String user, String pass){
   
         
         
         
         
         
         
         
         //Throw Messagebox if Username not found
     }
     
     
   
}
