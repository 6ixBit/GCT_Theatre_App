package sys_dev;
import Sys_Dev.*;


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


@Override
public void clear(){
 this.receipt_no = 0;
 this.receipt_date = "";
}
}
