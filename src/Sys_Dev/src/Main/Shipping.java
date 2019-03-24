/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Database.Singleton;
import static Main.App_main.images;
import User_functions.Home;
import User_functions.Receipt;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static net.ucanaccess.converters.Functions.date;

/**
 *
 * @author The Emperor
 */
public class Shipping extends javax.swing.JFrame implements IF_tick {

    boolean selected = false;
    String status_msg;
    double shipping_price;

    boolean purchase_complete = false;

    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String get_date = dateFormat.format(date).toString();

    public Shipping() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Shipping");

        Lbl_shipping_img.setIcon(new ImageIcon("images/delivery.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Btn_Standard = new javax.swing.JRadioButton();
        Btn_Express = new javax.swing.JRadioButton();
        Btn_one_day = new javax.swing.JRadioButton();
        Btn_Complete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Lbl_shipping_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Shipping Methods");

        buttonGroup1.add(Btn_Standard);
        Btn_Standard.setText("Standard Delivery - £1.00");

        buttonGroup1.add(Btn_Express);
        Btn_Express.setText("Express Delivery - £3.00");

        buttonGroup1.add(Btn_one_day);
        Btn_one_day.setText("One day Delivery - £4.99");

        Btn_Complete.setText("Complete Order");
        Btn_Complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CompleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Please select the shipping method you'd like;");

        Lbl_shipping_img.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Lbl_shipping_img, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Standard)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Btn_one_day))
                    .addComponent(Btn_Express))
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Btn_Complete)
                        .addGap(146, 146, 146))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(Btn_Standard)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_shipping_img, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Btn_Express)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_one_day)))
                .addGap(31, 31, 31)
                .addComponent(Btn_Complete)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_CompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CompleteActionPerformed

        String[] method = {"Standard Delivery", "Express Delivery", "One day Delivery"};

        if (Btn_Standard.isSelected()) {
            selected = true;
            status_msg = "Your order will be there in 3 to 5 days. " + "\n" + "£" + re.get_total_price() + " was charged on your account.";
            shipping_price = 1.00; //Sets price fo shipping method
            re.set_shipping_method(method[0]);
        } else if (Btn_Express.isSelected()) {
            selected = true;
            status_msg = "Your order will be there in 1 to 3 days. " + "\n" + "£" + re.get_total_price() + " was charged on your account.";
            shipping_price = 3.00;
            re.set_shipping_method(method[1]);
        } else if (Btn_one_day.isSelected()) {
            selected = true;
            status_msg = "Your order will be there within a day. " + "\n" + "£" + re.get_total_price() + " was charged on your account.";
            shipping_price = 4.99;
            re.set_shipping_method(method[2]);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a shipping method", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (selected == true) {
            JOptionPane.showMessageDialog(null, status_msg, "Thank you!", JOptionPane.PLAIN_MESSAGE);
            this.hide(); //If user selects a shipping method then close shipping JFrame

            re.add_total_price(shipping_price); //Increment total price by shipping method

            te.clear(); //Clear all the variables associated to the object here

            //Reset value of shopping cart once the order has been completed
            purchase_complete = true;

            //Make database calls to refresh App_main with new user order and events    
            Singleton.insert_receipt(u1.get_id(), re.get_shipping_method(), re.generate_receipt(), get_date, re.get_total_price());

            //Empty out the array list so that new fresh data can be added
            ap.total_prices.clear();
            ap.receipt_dates.clear();
            ap.receipt_nos.clear();
            
            //Clear table
            ap.clear_table();

            //Refresh your orders table
            Singleton.User_Orders(u1.get_user(), ap.total_prices, ap.receipt_dates, ap.receipt_nos);
             
            //Fill table
            ap.Table_Fill("Greenwich Theatre");
        }
    }//GEN-LAST:event_Btn_CompleteActionPerformed

    public void your_order_table_fill() {

        String[] receipt_nos_str = new String[ap.receipt_nos.size()];
        String[] receipt_dates_str = new String[ap.receipt_dates.size()];
        String[] total_prices_str = new String[ap.total_prices.size()];

        DefaultTableModel model_2 = (DefaultTableModel) ap.table_YourOrders.getModel();

        for (int h = 0; h < total_prices_str.length; h++) {
            model_2.addRow(new Object[]{receipt_dates_str[h], receipt_nos_str[h], total_prices_str[h]});
        }

        ap.table_YourOrders.setModel(model_2);

    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shipping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Complete;
    private javax.swing.JRadioButton Btn_Express;
    private javax.swing.JRadioButton Btn_Standard;
    private javax.swing.JRadioButton Btn_one_day;
    private javax.swing.JLabel Lbl_shipping_img;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
