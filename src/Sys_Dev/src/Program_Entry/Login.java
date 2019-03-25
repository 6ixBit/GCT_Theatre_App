package Program_Entry;

import javax.swing.JOptionPane;
import Database.Singleton; //Importing Class from separate package
import Main.App_main;
import Main.IF_tick;
import User_functions.*;

public class Login extends javax.swing.JFrame implements IF_tick {

    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textbox_login_Username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Button_login = new javax.swing.JButton();
        Button_signup = new javax.swing.JButton();
        textbox_login_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setText("Greenwich Community Theatre");

        Button_login.setText("Login");
        Button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_loginActionPerformed(evt);
            }
        });

        Button_signup.setText("Sign up");
        Button_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Button_login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_signup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textbox_login_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(textbox_login_Username))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textbox_login_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textbox_login_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(Button_login)
                .addGap(26, 26, 26)
                .addComponent(Button_signup)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Button_login.getAccessibleContext().setAccessibleName("button_Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_signupActionPerformed
        // TODO add your handling code here:
        Sign_up su = new Sign_up(); //Creates object to access sign up form
        su.setVisible(true); //If sign up button is clicked open this form
    }//GEN-LAST:event_Button_signupActionPerformed

    private void Button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_loginActionPerformed

        //Validation check to see if fields are left empty
        if (textbox_login_Username.getText() == null || textbox_login_Username.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a username", "Stop", JOptionPane.ERROR_MESSAGE);
        } else if (textbox_login_Password.getText() == null || textbox_login_Password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a password", "Stop", JOptionPane.ERROR_MESSAGE);
        } else {
            //Pass input to user object - Once both fields aren't empty
            u1.set_user(textbox_login_Username.getText());
            u1.set_pass(textbox_login_Password.getText());
            Singleton.login(u1.get_user(), u1.get_pass()); //Call DB method to check login
            u1.set_id(Singleton.login(u1.get_user(), u1.get_pass())); //Calls DB method that returns ID of user 
            System.out.println("Your USER ID is " + u1.get_id());

            //If User input is found in database then
            if (Singleton.status == true) {
                ap.setVisible(true); //Show next form
                this.setVisible(false); //Hide old form
            }

            ap.get_Label_Name().setText(u1.get_user());

            //Fill Your Orders table here
            Singleton.User_Orders(u1.get_user(), ap.total_prices, ap.receipt_dates, ap.receipt_nos);

            //Converts arraylist to array so it can be read
            ap.total_prices_str = ap.total_prices.toArray(ap.total_prices_str);
            ap.receipt_dates_str = ap.receipt_dates.toArray(ap.receipt_dates_str);
            ap.receipt_nos_str = ap.receipt_nos.toArray(ap.receipt_nos_str);

            //Calls regex method to split date of receipts
            for (int i = 0; i < ap.receipt_dates_str.length; i++) {
                ap.receipt_dates_str[i] = ap.split_date(ap.receipt_dates_str[i]);
            }

            //Fill Upcoming table
            ap.Table_Fill("Greenwich Theatre");

    }//GEN-LAST:event_Button_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_login;
    private javax.swing.JButton Button_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField textbox_login_Password;
    private javax.swing.JTextField textbox_login_Username;
    // End of variables declaration//GEN-END:variables
}
