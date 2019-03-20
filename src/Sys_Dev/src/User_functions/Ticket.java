package User_functions;

import java.util.ArrayList;
import java.util.Random;

public class Ticket extends Home {

    //List to hold list of ticket numbers incase user wants multiple tickets
    public ArrayList <Integer> list_of_tickNo = new ArrayList<>();
    //public int[] list_of_tick_arr = new int[list_of_tickNo.size()];
    
    //ArrayList to hold lis of seats incase user wants to book multiple tickets
    public ArrayList <String> list_of_Seats = new ArrayList<>();
    public String[] list_of_seats_arr = new String[list_of_Seats.size()];
    
    //ArrayList to hold list of ticket prices
    public ArrayList <Double> list_of_tick_prices = new ArrayList<>();
    //public double[] list_of_tick_prices_arr = new double[list_of_tick_prices.size()];
    
    //ArrayList to hold EventIDs for each event
    public ArrayList <Integer> list_of_event_ids = new ArrayList<>();
    //public int[] list_of_event_ids_arr = new int[list_of_event_ids.size()];
    
    
    public int get_ticket_no() {
        return ticket_no;
    }

    public void set_ticket_no(int ticket) {
        this.ticket_no = ticket;
    }
    
    public int get_event_id(){
        return event_id;
    }
    
    public void set_event_id(int event_id){
        this.event_id = event_id;
    }

    public String get_event_name() {
        return event_name;
    }

    public void set_event_name(String event) {
        this.event_name = event;
    }

    public String get_event_date() {
        return event_date;
    }

    public void set_event_date(String event) {
        this.event_date = event;
    }

    public double get_ticket_price() {
        return ticket_price;
    }

    public void set_ticket_price(double price) {
        this.ticket_price = price;

    }
    
     public void inc_ticket_price(double amount) {
        this.ticket_price += amount;
    }
    
    public void dec_ticket_price(double amount) {
        this.ticket_price -= amount;
    }
    
    public String get_seat_no(){
     return seat_no;   
    }
    
    public void set_seat_no(String seat){
        this.seat_no = seat;
    }
    
    public int generate_ticket() {

        Random rand = new Random();

        int n = rand.nextInt(16) + 1; //Generate a random ticket number between 1 & 16 - There are 16 tickets in the cinema seating hall

        //Get rid of if you dont need later
        return n;
    }
    
    @Override
    public void clear(){
        this.event_date = "";
        this.event_name = "";
        this.ticket_no = 0;
        this.ticket_price = 0;
        this.seat_no = "";
        this.list_of_Seats.clear();
        this.list_of_tickNo.clear();
    }
}
