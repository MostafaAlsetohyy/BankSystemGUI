/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.AdminMenu;
import bank.Admin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MMOX
 */
public class Transactions extends javax.swing.JFrame {

    /**
     * Creates new form Transactions
     */
    public Transactions() {
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

        ByAccNumber = new javax.swing.JFrame();
        Email1 = new javax.swing.JTextField();
        Back1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SearchByAcc = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        OutPut1 = new java.awt.TextArea();
        ByEmail = new javax.swing.JFrame();
        Email2 = new javax.swing.JTextField();
        Search1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Back2 = new javax.swing.JButton();
        OutPut = new java.awt.TextArea();
        clear = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        SerchByAccNumber1 = new javax.swing.JButton();
        BackToAdmin1 = new javax.swing.JButton();
        SearchByEmail1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        Email1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email1ActionPerformed(evt);
            }
        });

        Back1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("Search By Account Number");

        SearchByAcc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SearchByAcc.setText("Search");
        SearchByAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByAccActionPerformed(evt);
            }
        });

        clear1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clear1.setText("clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        OutPut1.setEditable(false);
        OutPut1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout ByAccNumberLayout = new javax.swing.GroupLayout(ByAccNumber.getContentPane());
        ByAccNumber.getContentPane().setLayout(ByAccNumberLayout);
        ByAccNumberLayout.setHorizontalGroup(
            ByAccNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ByAccNumberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ByAccNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ByAccNumberLayout.createSequentialGroup()
                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ByAccNumberLayout.createSequentialGroup()
                        .addComponent(Email1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchByAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(OutPut1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(ByAccNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ByAccNumberLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel2)
                    .addContainerGap(282, Short.MAX_VALUE)))
        );
        ByAccNumberLayout.setVerticalGroup(
            ByAccNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ByAccNumberLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(ByAccNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchByAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Email1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OutPut1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ByAccNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Back1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(clear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ByAccNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ByAccNumberLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(297, Short.MAX_VALUE)))
        );

        ByEmail.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Email2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Email2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email2ActionPerformed(evt);
            }
        });

        Search1.setText("Search");
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Search By Email");

        Back2.setText("Back");
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });

        OutPut.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ByEmailLayout = new javax.swing.GroupLayout(ByEmail.getContentPane());
        ByEmail.getContentPane().setLayout(ByEmailLayout);
        ByEmailLayout.setHorizontalGroup(
            ByEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ByEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ByEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ByEmailLayout.createSequentialGroup()
                        .addComponent(Email2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(OutPut, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ByEmailLayout.createSequentialGroup()
                        .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear)
                        .addGap(12, 12, 12)))
                .addGap(9, 9, 9))
        );
        ByEmailLayout.setVerticalGroup(
            ByEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ByEmailLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addGroup(ByEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OutPut, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ByEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Back2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SerchByAccNumber1.setText("Account Number");
        SerchByAccNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerchByAccNumber1ActionPerformed(evt);
            }
        });

        BackToAdmin1.setText("Back");
        BackToAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToAdmin1ActionPerformed(evt);
            }
        });

        SearchByEmail1.setText("Email");
        SearchByEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByEmail1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Search BY:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(BackToAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchByEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SerchByAccNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SerchByAccNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchByEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BackToAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        // TODO add your handling code here:
        ByAccNumber.setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_Back1ActionPerformed

    private void BackToAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToAdmin1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminMenu().setVisible(true);
    }//GEN-LAST:event_BackToAdmin1ActionPerformed

    private void SearchByEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByEmail1ActionPerformed
        // TODO add your handling code here:
        ByEmail.setBounds(0, 0, 400, 400);
        ByEmail.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_SearchByEmail1ActionPerformed

    private void SerchByAccNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerchByAccNumber1ActionPerformed
        // TODO add your handling code here:
        ByAccNumber.setBounds(0, 0, 500, 400);

        ByAccNumber.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_SerchByAccNumber1ActionPerformed

    private void Email2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email2ActionPerformed


    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed

        try {
            // TODO add your handling code here:
            String Email = Email2.getText().toString();
            Admin p = new Admin();
            if (p.EmailExist(Email).equals("Not Found")) {
                JOptionPane.showMessageDialog(null, "Make Sure U Entered A valid Email");

            } else {

                try {
                    int AccNum = p.getAccNum(Email);
                    String email = String.valueOf(AccNum);
                    FileReader file = new FileReader("C:/Users/MMOX/Desktop/BankSyS-master/Data/" + email + ".txt");
                    BufferedReader br = new BufferedReader(file);
                    String Line;
                    while ((Line = br.readLine()) != null) {
                        OutPut.setText(OutPut.getText() + "\n" + Line);
                    }

                    br.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Unable to open file " + Email);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Transactions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Transactions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Search1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        OutPut.setText("");
        Email2.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        // TODO add your handling code here:
        ByEmail.setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_Back2ActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        // TODO add your handling code here:
        OutPut1.setText("");
        Email1.setText("");
    }//GEN-LAST:event_clear1ActionPerformed

    private void SearchByAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByAccActionPerformed

        // TODO add your handling code here:
        String email = Email1.getText().toString();

        try {

            FileReader file = new FileReader("C:/Users/MMOX/Desktop/BankSyS-master/Data/" + email + ".txt");
            BufferedReader br = new BufferedReader(file);
            String Line;
            while ((Line = br.readLine()) != null) {
                OutPut1.setText(OutPut1.getText() + "\n" + Line);

            }

            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unable to open file " + email);
        }


    }//GEN-LAST:event_SearchByAccActionPerformed

    private void Email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email1ActionPerformed

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
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transactions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton Back2;
    private javax.swing.JButton BackToAdmin1;
    private javax.swing.JFrame ByAccNumber;
    private javax.swing.JFrame ByEmail;
    private javax.swing.JTextField Email1;
    private javax.swing.JTextField Email2;
    private java.awt.TextArea OutPut;
    private java.awt.TextArea OutPut1;
    private javax.swing.JButton Search1;
    private javax.swing.JButton SearchByAcc;
    private javax.swing.JButton SearchByEmail1;
    private javax.swing.JButton SerchByAccNumber1;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
