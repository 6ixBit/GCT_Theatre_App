package Main;

import javax.swing.ImageIcon;
import Database.Singleton; //Importing Class from separate package
import java.util.ArrayList;

import User_functions.*;
import javax.swing.JLabel;

import javax.swing.table.DefaultTableModel;

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

    //List of times of event
    ArrayList<Home> times = new ArrayList<>();
    String[] time_str = new String[times.size()];

    /////////* YOUR ORDERS TABLE *\\\\\\\\\\\\\\
    //List of ReceiptNos
    public ArrayList<String> receipt_nos = new ArrayList<>();
    public String[] receipt_nos_str = new String[receipt_nos.size()];

    //List of Receipt_date
    public ArrayList<String> receipt_dates = new ArrayList<>();
    public String[] receipt_dates_str = new String[receipt_dates.size()];

    //List of total_price
    public ArrayList<String> total_prices = new ArrayList<>();
    public String[] total_prices_str = new String[total_prices.size()];

    public App_main() {
        initComponents();
        this.setResizable(false);

        //Calling method to query DB for images
        Singleton.Event_Images(images, image_desc, image_date, name, prices, times);

        //Converts arrayList to array so it can be read
        image_desc_str = image_desc.toArray(image_desc_str);
        name_str = name.toArray(name_str);
        image_date_str = image_date.toArray(image_date_str);
        price_str = prices.toArray(price_str);
        time_str = times.toArray(time_str);

        //Converts objects from Your Orders table from ArrayList to Array - ERROR STILL SAYS THAT ARRAY IS BLANK EVEN THOUGH ITS BEING CONVERTED
        for (int i = 0; i < total_prices.size(); i++) {
            total_prices_str[i] = total_prices.get(i);
            System.out.println("Bingo " + total_prices_str[i]);
    
        }

        //Calls regex method to split date
        for (int i = 0; i < image_date_str.length; i++) {
            image_date_str[i] = split_date(image_date_str[i]);
        }

        //Calls regex method to split time - THIS IS CAUSING A PROBLEM FOR SOME REASON
        for (int i = 0; i < image_date_str.length; i++) {
            time_str[i] = split_time(time_str[i]);
        }

        //Calls regex method to split date
        for (int i = 0; i < receipt_dates_str.length; i++) {
            receipt_dates_str[i] = split_date(receipt_dates_str[i]);
        }

        //Images still need to be read from DB -- Still needs fix
        Event_1.setIcon(new ImageIcon("images/hamilton.jpg"));
        Label_Event_1.setText("<html>" + image_desc_str[index] + "</html>"); //Gets text from ArrayList and converts to String
        Label_EventName_1.setText("<html>" + name_str[index] + "</html>");
        Label_Date.setText("<html>" + image_date_str[index] + "</html>");
        Label_Price.setText("<html>" + price_str[index] + "</html>");

    }

    public JLabel get_Label_Name() {
        return label_Name;
    }

    public void Table_Fill(String location) {
        DefaultTableModel model_1 = (DefaultTableModel) table_Upcoming.getModel();
        DefaultTableModel model_2 = (DefaultTableModel) table_YourOrders.getModel();

        //Loops through arrays and take data from them and adds to table
        for (int i = 0; i < name_str.length; i++) {
            model_1.addRow(new Object[]{name_str[i], time_str[i], image_date_str[i]});
        }

        //Set every column (3) to the location specified in method call, I done this as I assume GCT is the primary location for events and it allows for flexiblity if need be to change 
        for (int j = 0; j < name_str.length; j++) {
            model_1.setValueAt(location, j, 3);
        }

        //Loops through arrays and adds them to table
        for (int h = 0; h < total_prices_str.length; h++) {
            model_2.addRow(new Object[]{receipt_dates_str[h], receipt_nos_str[h], total_prices_str[h]});
        }

        table_Upcoming.setModel(model_1);
        table_YourOrders.setModel(model_2);

        //Testing
        System.out.println("Test " + total_prices.get(0));
        System.out.println("Test " + receipt_dates.get(0));
        System.out.println(receipt_nos.get(0));

        //Testing Array
        System.out.println("We MOVE " + total_prices_str[0]);
    }

    //Method to split date string using regex
    public String split_date(String element) {
        String[] test = element.split("00");
        return test[0];
    }

    public String split_time(String element) {
        String[] test = element.split("1899-12-30");
        System.out.println(test[0]);

        String[] result = test[0].split(".");

        for (String x : result) {
            System.out.println(x);
        }
        return result[0];
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
        table_YourOrders = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Upcoming = new javax.swing.JTable();
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

        table_YourOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
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
        jScrollPane1.setViewportView(table_YourOrders);
        if (table_YourOrders.getColumnModel().getColumnCount() > 0) {
            table_YourOrders.getColumnModel().getColumn(0).setResizable(false);
            table_YourOrders.getColumnModel().getColumn(1).setResizable(false);
            table_YourOrders.getColumnModel().getColumn(2).setResizable(false);
        }

        table_Upcoming.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jScrollPane2.setViewportView(table_Upcoming);
        if (table_Upcoming.getColumnModel().getColumnCount() > 0) {
            table_Upcoming.getColumnModel().getColumn(0).setResizable(false);
            table_Upcoming.getColumnModel().getColumn(1).setResizable(false);
            table_Upcoming.getColumnModel().getColumn(2).setResizable(false);
            table_Upcoming.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Upcoming Events");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Your Orders");

        jLabel8.setText("£");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(previous_play)
                                .addGap(18, 18, 18)
                                .addComponent(Next_play)
                                .addGap(465, 465, 465))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(202, 202, 202))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(165, 165, 165))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(303, 303, 303)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(Label_EventName_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(Label_8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Label_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label_Name)
                                    .addGap(292, 292, 292)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(273, 273, 273)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label_Basket)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(2, 2, 2)
                                .addComponent(Label_Price))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(Label_Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                    .addComponent(Label_EventName_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Price)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_Event_1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Next_play)
                            .addComponent(previous_play)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
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
    private javax.swing.JLabel label_Basket;
    private javax.swing.JLabel label_Name;
    private javax.swing.JButton previous_play;
    private javax.swing.JTable table_Upcoming;
    private javax.swing.JTable table_YourOrders;
    // End of variables declaration//GEN-END:variables
}
