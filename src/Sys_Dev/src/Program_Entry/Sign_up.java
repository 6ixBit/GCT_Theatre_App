package Program_Entry;

import javax.swing.JOptionPane;
import Database.Singleton; //Importing Class from separate package
import sys_dev.*;
import User_functions.User;
import User_functions.Home;

public class Sign_up extends javax.swing.JFrame {

    public Sign_up() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textbox_signup_Username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textbox_signup_Number = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textbox_signup_Address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textbox_signup_Postcode = new javax.swing.JTextField();
        Button_signup_submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textbox_signup_Email = new javax.swing.JTextField();
        textbox_signup_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel4.setText("Number");

        jLabel5.setText("Address");

        jLabel6.setText("Postcode");

        Button_signup_submit.setText("Submit");
        Button_signup_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_signup_submitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setText("Sign up");

        jLabel8.setText("E-mail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textbox_signup_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textbox_signup_Postcode, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textbox_signup_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(textbox_signup_Username))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textbox_signup_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(textbox_signup_Address)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_signup_submit)
                            .addComponent(jLabel7))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textbox_signup_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(textbox_signup_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textbox_signup_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textbox_signup_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textbox_signup_Postcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textbox_signup_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(Button_signup_submit)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_signup_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_signup_submitActionPerformed

        //Input Validation
        boolean sign_up = false;
        User u1 = new User();

        if (textbox_signup_Username.getText() == null || textbox_signup_Username.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a username", "Stop", JOptionPane.ERROR_MESSAGE);

        } else if (textbox_signup_Password.getText() == null || textbox_signup_Password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a password", "Stop", JOptionPane.ERROR_MESSAGE);

        } else if (textbox_signup_Address.getText() == null || textbox_signup_Address.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your address", "Stop", JOptionPane.ERROR_MESSAGE);
        } else if (textbox_signup_Postcode.getText() == null || textbox_signup_Postcode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your Postcode", "Stop", JOptionPane.ERROR_MESSAGE);
        } else if (textbox_signup_Number.getText() == null || textbox_signup_Number.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your phone number", "Stop", JOptionPane.ERROR_MESSAGE);
        } else if (textbox_signup_Email.getText() == null || textbox_signup_Email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your email address", "Stop", JOptionPane.ERROR_MESSAGE);
        } else { //DB Writing of details will go here

            Singleton.check_user_exists(textbox_signup_Username.getText());

            if (Singleton.exists == true) {
                JOptionPane.showMessageDialog(null, "This username already exists", "Enter another Username", JOptionPane.INFORMATION_MESSAGE);
            } else {
                this.hide(); //Hide old form
                sign_up = true; //Sets login token to true
            }
        }

        if (sign_up == true) {
            u1.set_user(textbox_signup_Username.getText());
            u1.set_pass(textbox_signup_Password.getText());
            u1.set_address(textbox_signup_Address.getText());
            u1.set_postcode(textbox_signup_Postcode.getText());
            u1.set_numb(textbox_signup_Number.getText());
            u1.set_email(textbox_signup_Email.getText());

            //Store sign up info in database by referncing Singleton class because it's static
            Singleton.InsertData(u1.get_user(), u1.get_pass(), u1.get_address(), u1.get_numb(), u1.get_email(), u1.get_postcode());

            //Tell user DB write was successful
            JOptionPane.showMessageDialog(null, "You can now login!", "Sign up sucessfull", JOptionPane.INFORMATION_MESSAGE);

            //Clear object of current data as we dont need it anymore
            //Singleton.clear(u1.user_name, u1.pass_w, u1.address, u1.postcode, u1.numb, u1.e_mail);
        }
    }//GEN-LAST:event_Button_signup_submitActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_signup_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField textbox_signup_Address;
    private javax.swing.JTextField textbox_signup_Email;
    private javax.swing.JTextField textbox_signup_Number;
    private javax.swing.JPasswordField textbox_signup_Password;
    private javax.swing.JTextField textbox_signup_Postcode;
    private javax.swing.JTextField textbox_signup_Username;
    // End of variables declaration//GEN-END:variables
}
