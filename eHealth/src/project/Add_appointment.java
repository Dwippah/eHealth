/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
package Email;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author shawol
 */
public class Add_appointment extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement stmt = null;
    
    /**
     *
     */
    public Add_appointment() {
        initComponents();
    
    }
    public String email_address() throws ClassNotFoundException, SQLException
    {
            String url = "jdbc:mysql://127.0.0.1:3306/Appointment";
            String uname = "root";
            String pwd = "hHw01cherry";
            //Register Driver Class
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url,uname,pwd);          
            PreparedStatement stmt2;
            String query2 = "SELECT email from register;";

            stmt2 = (PreparedStatement) conn.prepareStatement(query2);
            ResultSet rs = stmt2.executeQuery(query2);
            rs.next();
            String column = "email";
            String email = rs.getString(column);
            System.out.println(email);
            return email;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1_time = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1_reminder = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add an Appointment");

        jTextField1_time.setText("HH:MM:SS");
        jTextField1_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_timeActionPerformed(evt);
            }
        });

        jButton1.setText("Add an appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1_reminder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 week", "3 days", "1 hour", "10 minutes" }));
        jComboBox1_reminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_reminderActionPerformed(evt);
            }
        });

        jLabel2.setText("Reminder");

        jLabel3.setText("Time");

        jLabel4.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1_reminder, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE))
                            .addComponent(jTextField1_time, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1_reminder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/Appointment";
            String uname = "root";
            String pwd = "hHw01cherry";
            //Register Driver Class
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query;
            query = "INSERT INTO app VALUES (?,?,?);";
            //Connection to the database
            //Url,name,pwd
            conn = (Connection) DriverManager.getConnection(url,uname,pwd);          
            stmt = conn.prepareStatement(query);
            
            //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            //String date = (String) sdf.format(jDateChooser1.getDate());
                      
            Date datum = jDateChooser1.getDate();
            String date = new SimpleDateFormat("dd-MM-yyyy").format(datum);
            //java.util.Calender calender = new GregorianCalender();
            //calender.setTime(datum);
            String reminder = jComboBox1_reminder.getSelectedItem().toString();
            String time = jTextField1_time.getText();
            Date startdata;
            
            startdata = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(date+" "+time);

            long time2 = startdata.getTime();
            System.out.println(time2);
            stmt.setString(1,date);
            stmt.setString(2,time);
            stmt.setString(3,reminder);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Added an Appointment");
        
            int remindertype = 0;
            switch(reminder)
            {
                case "1 week"-> 
                    {
                        remindertype = 1;
                        time2 = time2-(7 * 24 * 60 * 60 * 1000);
                    }
                case "3 days"->
                {
                    remindertype = 2;
                    time2 = time2-(3 * 24 * 60 * 60 * 1000);

                }
                case "1 hour"->
                {
                    remindertype = 3;
                    time2 = time2-(60 * 60 * 1000);

                }
                case "10 minutes"->
                {
                    remindertype = 4;
                    time2 = time2-(10 * 60 * 1000);

                }
                    
            }
            //Time that when a appointment is added
            DateFormat confirm = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            Date date2 = new Date();
            confirm.format(date2);
            String date3 = new SimpleDateFormat("dd-MM-yyy HH:mm:ss").format(date2);
            Date remindert = new Date(time2);
            String reminders = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(remindert);
            System.out.println("Confirmation:"+date2);
            System.out.println("Reminder:"+reminders);
            
            String mail;
            mail= email_address();
            String[] receiverList = mail.split(" ");
            
            //Reminder mail
            Email mail_ = new Email(reminders,receiverList);
            System.out.println(mail_);
            mail_.reminder_funktion(remindertype,remindert);
            
            //Confirmation mail
            Email_confirm confirm2 = new Email_confirm(date3,receiverList);
            confirm2.confirmation(date2);
      
        try {  
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Add_appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Add_appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Add_appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Add_appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
            PopUp_pdf pdf = new PopUp_pdf();
            pdf.setVisible(true);
            setVisible(false);
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_timeActionPerformed

    private void jComboBox1_reminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_reminderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_reminderActionPerformed

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
            java.util.logging.Logger.getLogger(Add_appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Add_appointment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1_reminder;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1_time;
    // End of variables declaration//GEN-END:variables
}
