package sys_dev;

import javax.swing.ImageIcon;
import Database.Singleton; //Importing Class from separate package
import java.util.ArrayList;

public class App_main extends javax.swing.JFrame {

    //This will be used by all the lists to determine what part of the slide show gets shown to the user.
    private int index = 0;

    //List of Object of type class Home Loaded from database
    static ArrayList<Byte> images = new ArrayList<>();
    byte[] myImages = new byte[images.size()]; ///Byte Array to hold Byte ArrayList objects -- Sets size of Byte Array to that of ArrayList defined above it

    //List of descriptions of images
    ArrayList<Home> image_desc = new ArrayList<>();
    String[] image_desc_str = new String[image_desc.size()];

    //List of descriptions of dates
    ArrayList<Home> image_date = new ArrayList<>();
    String[] image_date_str = new String[image_date.size()];

    //List of name of events
    ArrayList<Home> name = new ArrayList<>();
    String[] name_str = new String[name.size()];
    
    //List of event price
    ArrayList<Home> prices = new ArrayList<>();
    String[] price_str = new String[prices.size()];

    public App_main() {
        initComponents();
        this.setResizable(false);

        //Not working currently.
        User u1 = new User();
        label_Name.setText(u1.get_user()); //Sets label text to that of user currently signed in.   

        //Calling method to query DB for images
        Singleton.Event_Images(images, image_desc, image_date, name, prices);

        image_desc_str = image_desc.toArray(image_desc_str); //Converts arrayList to array so it can be read
        name_str = name.toArray(name_str);
        image_date_str = image_date.toArray(image_date_str);
        price_str = prices.toArray(price_str);

        //Images still need to be read from DB -- Still needs fix
        Event_1.setIcon(new ImageIcon("images/hamilton.jpg"));
        Label_Event_1.setText("<html>" + image_desc_str[index] + "</html>"); //Gets text from ArrayList and converts to String
        Label_EventName_1.setText("<html>" + name_str[index] + "</html>");
        Label_Date.setText("<html>" + image_date_str[index] + "</html>");
        Label_Price.setText("<html>" + price_str[index] + "</html>");

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
        Label_Event_1 = new javax.swing.JLabel();
        Label_EventName_1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Label_Price = new javax.swing.JLabel();
        Label_8 = new javax.swing.JLabel();
        Label_Date = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dubai", 2, 18)); // NOI18N
        jLabel1.setText("Greenwich Community Theatre");

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
        previous_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous_playActionPerformed(evt);
            }
        });

        Label_Event_1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        Label_EventName_1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        Label_EventName_1.setText("---");

        jLabel5.setText("Price:");

        Label_Price.setText("---");

        Label_8.setText("Date:");

        Label_Date.setText("---");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date of order", "Receipt Number", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TItle", "Time", "Date", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Upcoming Events");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Your Orders");

        jLabel8.setText("£");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(previous_play)
                                    .addGap(18, 18, 18)
                                    .addComponent(Next_play)
                                    .addGap(465, 465, 465))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label_Name)
                                    .addGap(292, 292, 292)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(273, 273, 273)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label_Basket))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(202, 202, 202))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(165, 165, 165)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_EventName_1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Label_8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Label_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(Label_Price)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Label_Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(626, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(label_Basket)
                    .addComponent(jLabel4)
                    .addComponent(label_Name))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_EventName_1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_8)
                    .addComponent(Label_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Label_Price)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next_play)
                    .addComponent(previous_play))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(386, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(138, 138, 138)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Next_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_playActionPerformed

        if (index < image_desc_str.length - 1) { //Using one Uniform condition as the lists will always be the same size

            if (index != image_desc_str.length) {
                ++index;
            }
            Label_Event_1.setText("<html>" + image_desc_str[index] + "</html>");
            Label_EventName_1.setText("<html>" + name_str[index] + "</html>");
            Label_Date.setText("<html>" + image_date_str[index] + "</html>");
            Label_Price.setText("<html>" + price_str[index] + "</html>");
        }
        //Only Testing Remove After
        System.out.println(index);
    }//GEN-LAST:event_Next_playActionPerformed

    private void previous_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous_playActionPerformed
        //Decrement list by one if back button is pressed

        if (index > 0) {
            index--;
            Label_Event_1.setText("<html>" + image_desc_str[index] + "</html>");
            Label_EventName_1.setText("<html>" + name_str[index] + "</html>");
            Label_Date.setText("<html>" + image_date_str[index] + "</html>");
            Label_Price.setText("<html>" + price_str[index] + "</html>");
        }
        //Only Testing Remove After
        System.out.println(index);
    }//GEN-LAST:event_previous_playActionPerformed

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
    private javax.swing.JLabel Label_8;
    private javax.swing.JLabel Label_Date;
    private javax.swing.JLabel Label_EventName_1;
    private javax.swing.JLabel Label_Event_1;
    private javax.swing.JLabel Label_Price;
    private javax.swing.JButton Next_play;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel label_Basket;
    private javax.swing.JLabel label_Name;
    private javax.swing.JButton previous_play;
    // End of variables declaration//GEN-END:variables
}
