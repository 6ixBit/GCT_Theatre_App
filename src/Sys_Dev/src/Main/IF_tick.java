/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import User_functions.Receipt;
import User_functions.Ticket;
import User_functions.User;

/**
 *
 * @author The Emperor
 */
public interface IF_tick {

    //Interface that can be utilised by classes so that they can share one object

    Ticket te = new Ticket();
    Receipt re = new Receipt();
    Shipping sh = new Shipping();
    User u1 = new User();
    App_main ap = new App_main(); 

}
