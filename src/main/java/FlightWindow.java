
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;



public class FlightWindow extends javax.swing.JFrame {


    public FlightWindow() {
        initComponents();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        FlightId = new javax.swing.JTextField();
        FlightID = new javax.swing.JLabel();
        FlightName = new javax.swing.JLabel();
        From = new javax.swing.JComboBox<>();
        FromLabel = new javax.swing.JLabel();
        ToLabel = new javax.swing.JLabel();
        To = new javax.swing.JComboBox<>();
        DepartureLabel = new javax.swing.JLabel();
        departure = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        Charge = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        FlightModel = new javax.swing.JComboBox<>();
        cancelButtton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Add Flight");
        Title.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 990, 90));

        FlightId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FlightId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightIdActionPerformed(evt);
            }
        });
        getContentPane().add(FlightId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 230, 40));

        FlightID.setForeground(new java.awt.Color(0, 0, 0));
        FlightID.setText("Flight ID :");
        FlightID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FlightID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 150, 40));

        FlightName.setForeground(new java.awt.Color(0, 0, 0));
        FlightName.setText("Flight Model :");
        FlightName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FlightName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 140, 40));

        From.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Sylhet", "Chittagong" }));
        From.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(From, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 170, 40));

        FromLabel.setForeground(new java.awt.Color(0, 0, 0));
        FromLabel.setText("From :");
        FromLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FromLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 140, 40));

        ToLabel.setForeground(new java.awt.Color(0, 0, 0));
        ToLabel.setText("To:");
        ToLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ToLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 140, 40));

        To.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Sylhet", "Chittagong" }));
        To.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 170, 40));

        DepartureLabel.setForeground(new java.awt.Color(0, 0, 0));
        DepartureLabel.setText("Departure Time :");
        DepartureLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(DepartureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 150, 40));

        departure.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1672516800000L), new java.util.Date(1924891200000L), java.util.Calendar.HOUR_OF_DAY));
        departure.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 230, 40));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Flight Charges :");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 150, 40));

        Charge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Charge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChargeActionPerformed(evt);
            }
        });
        getContentPane().add(Charge, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 230, 40));

        Add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(51, 153, 255));
        Add.setText("ADD");
        Add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 100, 40));

        FlightModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dornier 328", "Embraer 135", "Bombardier Dash 8 Q400" }));
        FlightModel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FlightModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightModelActionPerformed(evt);
            }
        });
        getContentPane().add(FlightModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 170, 40));

        cancelButtton.setBackground(new java.awt.Color(0, 51, 255));
        cancelButtton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelButtton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButtton.setText("Cancel");
        cancelButtton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButttonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FlightIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightIdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FlightIdActionPerformed

    private void ChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ChargeActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:  
        Flight f = new Flight();
        try {
            // Validate input fields are not blank
            if (FlightId.getText().isEmpty()|| Charge.getText().isEmpty()) {
                throw new IllegalArgumentException("Fields cannot be blank");
            }

            // Set various attributes of the Flight object
            f.setId(Integer.parseInt(FlightId.getText()));
            f.setModel(FlightModel.getSelectedItem().toString());
            f.setPrice(Integer.parseInt(Charge.getText()));
            //update flight capacity
            f.setCapacity();
            //text field's output for capacity
            // Check From and To destinations are different
            String from = From.getSelectedItem().toString();
            String to = To.getSelectedItem().toString();
            if (from.equals(to)) {
                throw new IllegalArgumentException("From and To destinations cannot be the same");
            }
            f.setFrom(from);
            f.setTo(to);

            // Set the departure time from the spinner
            Date date = (Date) departure.getValue();
            Instant instant = date.toInstant();
            LocalDateTime selectedDepartureTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
            f.setDeparture(selectedDepartureTime);

            // Set the arrival time based on the departure time
            f.setArrival(selectedDepartureTime);
        } catch (NumberFormatException ex) {
            // Display error message for number format exception
            JOptionPane.showMessageDialog(null, "Invalid number format. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            Charge.setText("");
        } catch (IllegalArgumentException ex) {
            // Display error message for illegal argument exception
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            FlightId.setText("");
            Charge.setText("");
            FlightId.setText("");
        } catch (NullPointerException ex) {
            // Display error message for null pointer exception
            JOptionPane.showMessageDialog(null, "Null value detected", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // Or perform appropriate error handling
        }
        
        f.appendInfo();
        JOptionPane.showMessageDialog(null, "Flight added to files", "Success", JOptionPane.PLAIN_MESSAGE);
        
        
    }//GEN-LAST:event_AddActionPerformed

    private void FlightModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightModelActionPerformed

    }//GEN-LAST:event_FlightModelActionPerformed

    private void cancelButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Welcome();
    }//GEN-LAST:event_cancelButttonActionPerformed

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
            java.util.logging.Logger.getLogger(FlightWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Charge;
    private javax.swing.JLabel DepartureLabel;
    private javax.swing.JLabel FlightID;
    private javax.swing.JTextField FlightId;
    private javax.swing.JComboBox<String> FlightModel;
    private javax.swing.JLabel FlightName;
    private javax.swing.JComboBox<String> From;
    private javax.swing.JLabel FromLabel;
    private javax.swing.JLabel Title;
    private javax.swing.JComboBox<String> To;
    private javax.swing.JLabel ToLabel;
    private javax.swing.JButton cancelButtton;
    private javax.swing.JSpinner departure;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
