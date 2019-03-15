package User_functions;



public class Receipt extends Home {
     
public int get_receipt_no(){
    return receipt_no;
}

public void set_receipt_no(int receipt_no){
    this.receipt_no = receipt_no;
}

public String get_receipt_date(){
    return receipt_date;
}

public void set_receipt_date(String receipt_date){
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

@Override
public void clear(){
 this.receipt_no = 0;
 this.receipt_date = "";
}
}
