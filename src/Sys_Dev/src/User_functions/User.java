
package sys_dev;
import Sys_Dev.*;


public class User extends Home {
     
    //Get username of user
    public String get_user(){
        return user_name;
    }
    
    //Set username of user
    public void set_user(String user){
        this.user_name = user;
    }
    
    //Get password of user to store in DB
    public String get_pass(){
        return pass_w;
    }
    
    //Set password of user when they sign up to be store in DB later on
    public void set_pass(String pass){
        this.pass_w = pass;
    }
    
    public String get_numb(){
     return numb;
    }
    
    public void set_numb(String numb){
        this.numb = numb;
    }
    
    public String get_address(){
        return address;
    }
    
    public void set_address(String address){
        this.address = address;
    }
    
    public String get_postcode(){
     return postcode;   
    }
    
    public void set_postcode(String postcode){
        this.postcode = postcode;
    }
    
    public String get_email(){
        return e_mail;
    }
    
    public void set_email(String email){
        this.e_mail = email;
    }
    
    @Override
    public void clear() {
        this.user_name = "";
        this.pass_w = "";
        this.address = "";
        this.e_mail = "";
        this.postcode = "";
        this.numb = "";

    }

}
