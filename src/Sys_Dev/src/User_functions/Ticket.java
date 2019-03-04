package sys_dev;
import Sys_Dev.*;

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
    
    @Override
    public void clear(){
        this.event_date = "";
        this.event_name = "";
        this.ticket_no = 0;
        this.ticket_price = 0;
    }

}
