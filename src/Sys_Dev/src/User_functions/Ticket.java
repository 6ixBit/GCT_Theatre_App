package User_functions;

import java.util.Random;

public class Ticket extends Home {

    public int get_ticket_no() {
        return ticket_no;
    }

    public void set_ticket_no(int ticket) {
        this.ticket_no = ticket;
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
    
    public void dec_ticket_price(double amount) {
        this.ticket_price -= amount;
    }
    
    public String generate_ticket() {

        Random rand = new Random();

        int n = rand.nextInt(16) + 1; //Generate a random ticket number between 1 & 16 - There are 16 tickets in the cinema seating hall

        String result = Integer.toString(n);

        return result;
    }
    
    @Override
    public void clear(){
        this.event_date = "";
        this.event_name = "";
        this.ticket_no = 0;
        this.ticket_price = 0;
    }

}
