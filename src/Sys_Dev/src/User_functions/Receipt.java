package User_functions;

import java.util.Random;

public class Receipt extends Home {

    public String get_receipt_no() {
        return receipt_no;
    }

    public void set_receipt_no(String receipt_no) {
        this.receipt_no = receipt_no;
    }

    public String get_receipt_date() {
        return receipt_date;
    }

    public void set_receipt_date(String receipt_date) {
        this.receipt_date = receipt_date;
    }

    public double get_shipping_method() {
        return shipping_method;
    }

    public void set_shipping_method(double shipping_method) {
        this.shipping_method = shipping_method;
    }

    public void set_total_price(double total_price) {
        this.total_price = total_price;
    }

    public double get_total_price() {
        return total_price;
    }

    public void add_total_price(double amount) {
        this.total_price += amount;
    }
    
    public void dec_total_price(double amount) {
        this.total_price -= amount;
    }

    public String generate_receipt() {

        Random rand = new Random();

        int n = rand.nextInt(100000) + 1; //Generate a random ticket number between 1 & 99999 
        String s = "#";

        String result = Integer.toString(n);

        return s + result;
    }

    @Override
    public void clear() {
        this.receipt_no = "";
        this.receipt_date = "";
    }
}
