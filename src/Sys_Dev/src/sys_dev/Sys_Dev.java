
package sys_dev;


public class Sys_Dev {

    static Purchase p = new Purchase();
    
    private double shopping_cart = 0.0;
    public static int discount = 10;
  
    public static void main(String[] args) {
       p.run(discount);
    }
    
}
