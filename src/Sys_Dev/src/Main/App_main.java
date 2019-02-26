package sys_dev;

import javax.swing.ImageIcon;
import Database.Singleton; //Importing Class from separate package
import static com.oracle.jrockit.jfr.ContentType.Bytes;
import static com.sun.webkit.graphics.WCImage.getImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class App_main extends javax.swing.JFrame {

    //List of Object of type class Home Loaded from database
    static ArrayList<Byte> images = new ArrayList<>();
    
    byte[] myImages = new byte[images.size()]; ///Byte Array to hold Byte ArrayList objects -- Sets size of Byte Array to that of ArrayList defined above it

    
    
    //List of descriptions of images
    ArrayList<Home> image_desc = new ArrayList<>();
    String[] image_desc_str = new String[image_desc.size()];

    //List of descriptions of dates
    ArrayList<Home> image_date = new ArrayList<>();
    
    //List of name of events
    ArrayList<Home> name = new ArrayList<>();

    public App_main() {
        initComponents();
  
        //Not working currently.
        User u1 = new User();
        label_Name.setText(u1.get_user()); //Sets label text to that of user currently signed in.   

        //Calling method to query DB for images
        Singleton.Event_Images(images, image_desc, image_date, name);
                
     
        image_desc_str = image_desc.toArray(image_desc_str); //Converts arrayList to array so it can be read
        
        
        
        
        Event_1.setIcon(new ImageIcon("images/hamilton.jpg"));
        Label_Event_1.setText("<html>" + image_desc_str[0] + "</html>"); //Gets text from ArrayList and converts to String
        
        Event_2.setIcon(new ImageIcon("images/lion_king.jpg"));
        Label_Event_2.setText("<html>" + image_desc_str[1] + "</html>");
        
        Event_3.setIcon(new ImageIcon("images/warHorse.jpg"));
        Label_Event_3.setText("<html>" + image_desc_str[2] + "</html>");
        
        Event_4.setIcon(new ImageIcon("images/the-phantom-of-the-opera-200.jpg"));
        Label_Event_4.setText("<html>" + image_desc_str[3] + "</html>");
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_Basket = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_Name = new javax.swing.JLabel();
        Next_play = new javax.swing.JButton();
        previous_play = new javax.swing.JButton();
        Event_1 = new javax.swing.JLabel();
        Event_3 = new javax.swing.JLabel();
        Event_2 = new javax.swing.JLabel();
        Event_4 = new javax.swing.JLabel();
        Label_Event_1 = new javax.swing.JLabel();
        Label_Event_2 = new javax.swing.JLabel();
        Label_Event_3 = new javax.swing.JLabel();
        Label_Event_4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dubai", 2, 18)); // NOI18N
        jLabel1.setText("                 GCT events");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Shopping Basket:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("£");

        label_Basket.setText("0.00");

        jLabel4.setText("Welcome Back, ");

        label_Name.setText("blank");

        Next_play.setText("Next");
        Next_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_playActionPerformed(evt);
            }
        });

        previous_play.setText("Back");

        Event_3.setPreferredSize(new java.awt.Dimension(200, 200));

        Event_2.setPreferredSize(new java.awt.Dimension(200, 200));

        Event_4.setPreferredSize(new java.awt.Dimension(200, 200));

        Label_Event_1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_Basket))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(previous_play)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Event_3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Next_play)
                                    .addComponent(Label_Event_3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Event_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_Event_2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_Event_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Event_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(label_Basket)
                            .addComponent(jLabel4)
                            .addComponent(label_Name))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Event_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Event_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Event_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Event_2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Event_3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Label_Event_4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next_play)
                    .addComponent(previous_play))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Next_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_playActionPerformed
        Event_1.setIcon(new ImageIcon("images/singin_in_the.jpg")); //This should allow us to change the image of labels
        Event_2.setIcon(new ImageIcon("images/Alladin.jpg"));
        Event_3.setIcon(new ImageIcon("images/warHorse.jpg"));
        Event_4.setIcon(new ImageIcon("images/jihad.jpg"));

        //If Next PRessed then show description

    }//GEN-LAST:event_Next_playActionPerformed

  
    
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
            java.util.logging.Logger.getLogger(App_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Event_1;
    private javax.swing.JLabel Event_2;
    private javax.swing.JLabel Event_3;
    private javax.swing.JLabel Event_4;
    private javax.swing.JLabel Label_Event_1;
    private javax.swing.JLabel Label_Event_2;
    private javax.swing.JLabel Label_Event_3;
    private javax.swing.JLabel Label_Event_4;
    private javax.swing.JButton Next_play;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label_Basket;
    private javax.swing.JLabel label_Name;
    private javax.swing.JButton previous_play;
    // End of variables declaration//GEN-END:variables
}
