package User_functions;


abstract public class Home {

      //Protected vars for user object - Each user will have one of these variables assigned to them when they sign up.
    protected String user_name;
    protected String pass_w;
    protected String numb;
    protected String address;
    protected String postcode;
    protected String e_mail;
    protected int id;
    
    //Protected vars for ticket attributes
    protected int ticket_no;
    protected int event_id;
    protected String event_name;
    protected String event_date;
    protected double ticket_price;
    protected String seat_no;
    
    //Protected var for multiple tickets which should equal to a total price
    protected double total_price;
    
    //Protected vars for Receipt class
    protected String receipt_no;
    protected String receipt_date;
    protected String shipping_method;
    
    
    //protected var for discounts
    protected double discount_1 = total_price / 100 * 10; //10% discount if user purchases a ticket between Monday - Thursday
    
    //ABstract Method
    abstract public void clear();
    
    //Default constructor with no values
    public Home(){  
    }
    
    //Constructor - TO set up user object, will work in hand with sign up form
    public Home(String user_name, String pass_w, String numb, String address, String postcode, String e_mail){ 
        this.user_name = user_name;
        this.pass_w = pass_w;
        this.numb = numb;
        this.address = address;
        this.postcode = postcode;
        this.e_mail = e_mail;
    }
   
    //Constructor for receipt
    public Home(String receipt_no, String receipt_date){
        this.receipt_no = receipt_no;
        this.receipt_date = receipt_date;
    }
    
    public Home(int ticket_no, String event_name, String event_date, double ticket_price){
        this.ticket_no = ticket_no;
        this.event_name = event_name;
        this.event_date = event_date;
        this.ticket_price = ticket_price;
    }    
}
