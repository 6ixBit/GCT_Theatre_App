
package Main;

import javax.swing.ImageIcon;


/**
 *
 * @author The Emperor
 */
public class SeatingPlan extends javax.swing.JFrame {

    /**
     * Creates new form SeatingPlan
     */
    public SeatingPlan() {
        initComponents();
        
        
        A1_Label.setIcon(new ImageIcon("images/blue_chair.png"));
        A2_Label.setIcon(new ImageIcon("images/blue_chair.png"));
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
        jSeparator1 = new javax.swing.JSeparator();
        Button_confirm_seat = new javax.swing.JButton();
        Seat_A1 = new javax.swing.JRadioButton();
        Seat_A2 = new javax.swing.JRadioButton();
        Seat_A3 = new javax.swing.JRadioButton();
        Seat_A4 = new javax.swing.JRadioButton();
        Seat_B1 = new javax.swing.JRadioButton();
        Seat_B2 = new javax.swing.JRadioButton();
        Seat_B3 = new javax.swing.JRadioButton();
        Seat_B4 = new javax.swing.JRadioButton();
        Seat_C1 = new javax.swing.JRadioButton();
        Seat_C2 = new javax.swing.JRadioButton();
        Seat_C3 = new javax.swing.JRadioButton();
        Seat_C4 = new javax.swing.JRadioButton();
        Seat_D1 = new javax.swing.JRadioButton();
        Seat_D2 = new javax.swing.JRadioButton();
        Seat_D3 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        A1_Label = new javax.swing.JLabel();
        A2_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel1.setText("Please Select a Seat:-");

        Button_confirm_seat.setText("Confirm");

        buttonGroup1.add(Seat_A1);
        Seat_A1.setText("A1");

        buttonGroup1.add(Seat_A2);
        Seat_A2.setText("A2");

        buttonGroup1.add(Seat_A3);
        Seat_A3.setText("A3");

        buttonGroup1.add(Seat_A4);
        Seat_A4.setText("A4");

        buttonGroup1.add(Seat_B1);
        Seat_B1.setText("B1");

        buttonGroup1.add(Seat_B2);
        Seat_B2.setText("B2");

        buttonGroup1.add(Seat_B3);
        Seat_B3.setText("B3");

        buttonGroup1.add(Seat_B4);
        Seat_B4.setText("B4");

        buttonGroup1.add(Seat_C1);
        Seat_C1.setText("C1");

        buttonGroup1.add(Seat_C2);
        Seat_C2.setText("C2");

        buttonGroup1.add(Seat_C3);
        Seat_C3.setText("C3");

        buttonGroup1.add(Seat_C4);
        Seat_C4.setText("C4");

        buttonGroup1.add(Seat_D1);
        Seat_D1.setText("D1");

        buttonGroup1.add(Seat_D2);
        Seat_D2.setText("D2");

        buttonGroup1.add(Seat_D3);
        Seat_D3.setText("D3");

        buttonGroup1.add(jRadioButton16);
        jRadioButton16.setText("D4");

        jLabel2.setText("A");

        jLabel3.setText("B");

        jLabel4.setText("C");

        jLabel5.setText("D");

        jLabel6.setText("1");

        jLabel7.setText("2");

        jLabel8.setText("3");

        jLabel9.setText("4");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Screen");

        jLabel11.setText("Event :");

        jLabel12.setText("jLabel12");

        A1_Label.setText("-");

        A2_Label.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(A1_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Seat_A1)
                                    .addComponent(Seat_B1)
                                    .addComponent(Seat_C1)
                                    .addComponent(Seat_D1))
                                .addGap(167, 167, 167)
                                .addComponent(A2_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(212, 212, 212)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Seat_B3)
                                        .addComponent(Seat_A4)
                                        .addComponent(Seat_C3)
                                        .addComponent(Seat_D3)))
                                .addGap(167, 167, 167))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(351, 351, 351)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Seat_B4)
                                    .addComponent(Seat_A3)
                                    .addComponent(Seat_C4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Seat_D2)
                                    .addComponent(Seat_B2)
                                    .addComponent(Seat_A2)
                                    .addComponent(Seat_C2))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton16)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button_confirm_seat)
                        .addGap(473, 473, 473))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Seat_A2)
                            .addComponent(Seat_A3)
                            .addComponent(Seat_A4)
                            .addComponent(Seat_A1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Seat_B1)
                                    .addComponent(Seat_B2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Seat_B3)
                                    .addComponent(Seat_B4))))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Seat_C2)
                            .addComponent(Seat_C1)
                            .addComponent(Seat_C3)
                            .addComponent(Seat_C4)
                            .addComponent(jLabel4))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Seat_D1)
                                    .addComponent(Seat_D2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton16)
                                    .addComponent(Seat_D3))))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A1_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A2_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Button_confirm_seat)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SeatingPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatingPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatingPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatingPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatingPlan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1_Label;
    private javax.swing.JLabel A2_Label;
    private javax.swing.JButton Button_confirm_seat;
    private javax.swing.JRadioButton Seat_A1;
    private javax.swing.JRadioButton Seat_A2;
    private javax.swing.JRadioButton Seat_A3;
    private javax.swing.JRadioButton Seat_A4;
    private javax.swing.JRadioButton Seat_B1;
    private javax.swing.JRadioButton Seat_B2;
    private javax.swing.JRadioButton Seat_B3;
    private javax.swing.JRadioButton Seat_B4;
    private javax.swing.JRadioButton Seat_C1;
    private javax.swing.JRadioButton Seat_C2;
    private javax.swing.JRadioButton Seat_C3;
    private javax.swing.JRadioButton Seat_C4;
    private javax.swing.JRadioButton Seat_D1;
    private javax.swing.JRadioButton Seat_D2;
    private javax.swing.JRadioButton Seat_D3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
