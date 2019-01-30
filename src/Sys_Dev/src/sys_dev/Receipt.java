package sys_dev;


public class Receipt extends Sys_Dev {

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
    
}
