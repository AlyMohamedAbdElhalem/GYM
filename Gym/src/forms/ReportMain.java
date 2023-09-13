
package forms;


import gym.Tools;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class ReportMain extends javax.swing.JFrame {


    public ReportMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnMainn = new javax.swing.JButton();
        btnClass = new controls.JMyButtonToolBar();
        btnMember = new controls.JMyButtonToolBar();
        btnMembership = new controls.JMyButtonToolBar();
        btnAccounting = new controls.JMyButtonToolBar();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jToolBar1.setRollover(true);

        btnMainn.setBackground(new java.awt.Color(255, 255, 255));
        btnMainn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMainn.setForeground(new java.awt.Color(0, 204, 51));
        btnMainn.setText("Main Form");
        btnMainn.setFocusable(false);
        btnMainn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMainn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMainn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainnActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMainn);

        btnClass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClass.setText("Class Report");
        btnClass.setFocusable(false);
        btnClass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClass.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassActionPerformed(evt);
            }
        });
        jToolBar1.add(btnClass);

        btnMember.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMember.setText("Member Report");
        btnMember.setFocusable(false);
        btnMember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMember.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMember);

        btnMembership.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMembership.setText("Membership Report");
        btnMembership.setFocusable(false);
        btnMembership.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMembership.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembershipActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMembership);

        btnAccounting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAccounting.setText("Accounting Report");
        btnAccounting.setFocusable(false);
        btnAccounting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccounting.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccounting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountingActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAccounting);

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 0, 0));
        btnLogout.setText("Logout");
        btnLogout.setFocusable(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogout);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(0, 0, 1020, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Main Reports ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 60, 280, 44);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(204, 255, 255));
        lblDate.setText("Date");
        jPanel1.add(lblDate);
        lblDate.setBounds(790, 410, 110, 17);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(204, 255, 255));
        lblTime.setText("Time");
        jPanel1.add(lblTime);
        lblTime.setBounds(913, 410, 90, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/reportBackground.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 30, 1020, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
                new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh-mm-ss a");
                lblTime.setText(s.format(d));
            }
        }).start();

        Date da = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyy-MM-dd");
        lblDate.setText(s.format(da));

    }//GEN-LAST:event_formWindowOpened

    private void btnClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassActionPerformed
    Tools.editForm(new ReportClass());
        this.dispose();
    }//GEN-LAST:event_btnClassActionPerformed

    private void btnMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembershipActionPerformed

        Tools.editForm(new ReportMembership());
        this.dispose();
    }//GEN-LAST:event_btnMembershipActionPerformed

    private void btnAccountingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountingActionPerformed
       Tools.editForm(new ReportAccounting());
        this.dispose();
    }//GEN-LAST:event_btnAccountingActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Tools.editForm(new frmLogin());
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnMainnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainnActionPerformed
        // TODO add your handling code here:
        Tools.editForm(new MainForm());
        this.dispose();
    }//GEN-LAST:event_btnMainnActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        Tools.editForm(new ReportMember());
        this.dispose();    }//GEN-LAST:event_btnMemberActionPerformed

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
            java.util.logging.Logger.getLogger(ReportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccounting;
    private javax.swing.JButton btnClass;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMainn;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnMembership;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
}
