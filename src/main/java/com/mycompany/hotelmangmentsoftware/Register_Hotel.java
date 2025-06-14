/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hotelmangmentsoftware;
import javax.swing.*;
import java.awt.event.ActionEvent;
import com.mycompany.hotelmangmentsoftware.Management;
/**
 *
 * @author SAM
 */
public class Register_Hotel extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Register_Hotel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        Hotel_Name_TextField = new javax.swing.JTextField();
        Hotel_Address_TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Hotel_Reg_As_Guest_Button = new javax.swing.JButton();
        Hotel_Register_Button = new javax.swing.JButton();
        Hotel_City_TextField = new javax.swing.JTextField();
        Hotel_Country_TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Hotel_Password_TextField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        Hotel_Password_Confirm_TextField = new javax.swing.JPasswordField();
        Hotel_LoginPage_Button = new javax.swing.JButton();
        Back_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 241, 254));

        kGradientPanel1.setkEndColor(new java.awt.Color(246, 241, 254));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 10, 128));

        Hotel_Name_TextField.setBackground(new java.awt.Color(246, 241, 254));
        Hotel_Name_TextField.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        Hotel_Name_TextField.setForeground(new java.awt.Color(20, 3, 43));
        Hotel_Name_TextField.setBorder(null);
        Hotel_Name_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hotel_Name_TextFieldActionPerformed(evt);
            }
        });

        Hotel_Address_TextField.setBackground(new java.awt.Color(246, 241, 254));
        Hotel_Address_TextField.setBorder(null);
        Hotel_Address_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hotel_Address_TextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        jLabel4.setText("City");

        jLabel3.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        jLabel3.setText("Address");

        jLabel2.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        jLabel2.setText("Name");

        jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 3, 43));
        jLabel1.setText("Register As A Hotel");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(43, 16));

        Hotel_Reg_As_Guest_Button.setText("Register As A Guest");
        Hotel_Reg_As_Guest_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hotel_Reg_As_Guest_ButtonActionPerformed(evt);
            }
        });

        Hotel_Register_Button.setText("Register");
        Hotel_Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hotel_Register_ButtonActionPerformed(evt);
            }
        });

        Hotel_City_TextField.setBackground(new java.awt.Color(246, 241, 254));
        Hotel_City_TextField.setBorder(null);
        Hotel_City_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hotel_City_TextFieldActionPerformed(evt);
            }
        });

        Hotel_Country_TextField.setBackground(new java.awt.Color(246, 241, 254));
        Hotel_Country_TextField.setBorder(null);
        Hotel_Country_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hotel_Country_TextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        jLabel5.setText("Country");

        jLabel6.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        jLabel6.setText("Password");

        Hotel_Password_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hotel_Password_TextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        jLabel7.setText("Confirm Password");

        Hotel_Password_Confirm_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hotel_Password_Confirm_TextFieldActionPerformed(evt);
            }
        });

        Hotel_LoginPage_Button.setText("Login");
        Hotel_LoginPage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hotel_LoginPage_ButtonActionPerformed(evt);
            }
        });

        Back_BTN.setText("Back");
        Back_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(Hotel_Register_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hotel_Reg_As_Guest_Button)
                .addGap(0, 256, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(Hotel_Country_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hotel_City_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hotel_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(Hotel_Address_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(Hotel_Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(Hotel_Password_Confirm_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(309, 309, 309))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(Hotel_LoginPage_Button)
                        .addGap(355, 355, 355))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Back_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back_BTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hotel_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hotel_Address_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hotel_City_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Hotel_Country_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hotel_Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hotel_Password_Confirm_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hotel_Register_Button)
                    .addComponent(Hotel_Reg_As_Guest_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hotel_LoginPage_Button)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Hotel_Reg_As_Guest_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hotel_Reg_As_Guest_ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false); // hide login form
        new Register_Guest().setVisible(true); // show register guest form
    }//GEN-LAST:event_Hotel_Reg_As_Guest_ButtonActionPerformed

    private void Hotel_LoginPage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hotel_LoginPage_ButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false); // hide login form
        new Login_Hotel().setVisible(true); // show register guest form
    }//GEN-LAST:event_Hotel_LoginPage_ButtonActionPerformed

    private void Hotel_Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hotel_Register_ButtonActionPerformed
        // TODO add your handling code here:
        String name = Hotel_Name_TextField.getText();
        String password = new String(Hotel_Password_TextField.getPassword());
        String address = Hotel_Address_TextField.getText();
        String city = Hotel_City_TextField.getText();
        String country = Hotel_Country_TextField.getText();
        String confirmPassword = new String(Hotel_Password_Confirm_TextField.getPassword());
        
        if (name.isEmpty() || password.isEmpty() || address.isEmpty() || city.isEmpty() || country.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled");
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Password and Confirm Password must match");
            return;
        }
        
        if (Management.registerHotel(address, city, country, name, password) != null) {
            // Successful registration
            JOptionPane.showMessageDialog(this, "Hotel Registration Successful");
            this.setVisible(false);
            new Login_Hotel().setVisible(true);
        } else {
            // Failed registration
            JOptionPane.showMessageDialog(this, "Username is taken, please choose another username!");
        }
        
    }//GEN-LAST:event_Hotel_Register_ButtonActionPerformed

    private void Hotel_Name_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hotel_Name_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hotel_Name_TextFieldActionPerformed

    private void Hotel_Address_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hotel_Address_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hotel_Address_TextFieldActionPerformed

    private void Hotel_Password_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hotel_Password_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hotel_Password_TextFieldActionPerformed

    private void Hotel_City_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hotel_City_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hotel_City_TextFieldActionPerformed

    private void Hotel_Country_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hotel_Country_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hotel_Country_TextFieldActionPerformed

    private void Hotel_Password_Confirm_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hotel_Password_Confirm_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hotel_Password_Confirm_TextFieldActionPerformed

    private void Back_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home_Page().setVisible(true);
    }//GEN-LAST:event_Back_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_BTN;
    private javax.swing.JTextField Hotel_Address_TextField;
    private javax.swing.JTextField Hotel_City_TextField;
    private javax.swing.JTextField Hotel_Country_TextField;
    private javax.swing.JButton Hotel_LoginPage_Button;
    private javax.swing.JTextField Hotel_Name_TextField;
    private javax.swing.JPasswordField Hotel_Password_Confirm_TextField;
    private javax.swing.JPasswordField Hotel_Password_TextField;
    private javax.swing.JButton Hotel_Reg_As_Guest_Button;
    private javax.swing.JButton Hotel_Register_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
