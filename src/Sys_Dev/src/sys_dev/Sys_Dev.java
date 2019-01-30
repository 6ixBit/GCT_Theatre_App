
package sys_dev;


public class Sys_Dev {

    //Protected vars for user object - Each user will have one of these variables assigned to them when they sign up.
    protected String user_name;
    protected String pass_w;
    protected String numb;
    protected String address;
    protected String postcode;
    protected String e_mail;
    
    //Protected vars for ticket attributes
    protected int ticket_no;
    protected String event_name;
    protected String event_date;
    protected double ticket_price;
    
    //Protected var for multiple tickets which should equal to a total price
    protected double total_price;
    
    //Protected vars for Receipt class
    protected int receipt_no;
    protected String receipt_date;
    
    
    //protected var for discounts
    protected double discount_1 = total_price / 100 * 10; //10% discount if user purchases a ticket between Monday - Thursday
    
    public Sys_Dev(){
       int x = 400 / 100*10;
    }
    
    public static void main(String[] args) {
        Sys_Dev sav = new Sys_Dev();
        System.out.println(sav);
    }
}
