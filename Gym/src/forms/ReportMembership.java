/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Entity.Member;
import Entity.Membership;
import gym.Tools;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Aly weza
 */
public class ReportMembership extends javax.swing.JFrame {

    /**
     * Creates new form ReportMembership
     */
    public ReportMembership() {
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

        Group = new javax.swing.ButtonGroup();
        Group2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnMainn = new javax.swing.JButton();
        btnClass = new controls.JMyButtonToolBar();
        btnMember = new controls.JMyButtonToolBar();
        btnMember1 = new controls.JMyButtonToolBar();
        btnAccounting = new controls.JMyButtonToolBar();
        btnMainReport = new controls.JMyButtonToolBar();
        btnLogout = new javax.swing.JButton();
        rdbDays = new javax.swing.JRadioButton();
        rdbSDate = new javax.swing.JRadioButton();
        rdbEDate = new javax.swing.JRadioButton();
        txtSearch = new controls.JTextBox(15);
        rdbClassName = new javax.swing.JRadioButton();
        btnSearch = new controls.JMyButton();
        rdbMemberName = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMembership = new javax.swing.JTable();
        rdbStatus = new javax.swing.JRadioButton();
        btnPrint = new controls.JMyButton();
        rdbDesc = new javax.swing.JRadioButton();
        rdbAsc = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MuItemExit = new javax.swing.JMenuItem();
        MForms = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        MWorkingForms = new javax.swing.JMenu();
        MFacilityForm = new javax.swing.JMenuItem();
        MClassForm = new javax.swing.JMenuItem();
        MMemberForm = new javax.swing.JMenuItem();
        MMembershipForm = new javax.swing.JMenuItem();
        MAccounting = new javax.swing.JMenuItem();
        MReportingForms = new javax.swing.JMenu();
        MMemberReport = new javax.swing.JMenuItem();
        MClassReport = new javax.swing.JMenuItem();
        MMembershipReport = new javax.swing.JMenuItem();
        MAccountingReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
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

        btnMember1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMember1.setForeground(new java.awt.Color(102, 102, 102));
        btnMember1.setText("Membership Report");
        btnMember1.setFocusable(false);
        btnMember1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMember1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMember1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMember1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMember1);

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

        btnMainReport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMainReport.setForeground(new java.awt.Color(51, 51, 255));
        btnMainReport.setText("Main Report");
        btnMainReport.setFocusable(false);
        btnMainReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMainReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMainReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainReportActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMainReport);

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
        jToolBar1.setBounds(0, 0, 990, 30);

        rdbDays.setSelected(true);
        rdbDays.setText("Days");
        jPanel1.add(rdbDays);
        rdbDays.setBounds(380, 90, 60, 23);

        rdbSDate.setText("Start Date");
        jPanel1.add(rdbSDate);
        rdbSDate.setBounds(560, 90, 90, 23);

        rdbEDate.setText("End Date");
        jPanel1.add(rdbEDate);
        rdbEDate.setBounds(650, 90, 80, 23);
        jPanel1.add(txtSearch);
        txtSearch.setBounds(770, 120, 130, 20);

        rdbClassName.setText("Class Name");
        rdbClassName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbClassNameActionPerformed(evt);
            }
        });
        jPanel1.add(rdbClassName);
        rdbClassName.setBounds(800, 90, 100, 23);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/searchMenu.jpg"))); // NOI18N
        btnSearch.setToolTipText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(900, 110, 30, 30);

        rdbMemberName.setText("Member Name");
        jPanel1.add(rdbMemberName);
        rdbMemberName.setBounds(440, 90, 120, 23);

        tblMembership.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Start Date", "End Date", "Status", "Days Left", "Class Name", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMembership);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 160, 970, 310);

        rdbStatus.setText("Status");
        jPanel1.add(rdbStatus);
        rdbStatus.setBounds(730, 90, 70, 23);

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/print.png"))); // NOI18N
        btnPrint.setToolTipText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrint);
        btnPrint.setBounds(10, 480, 150, 40);

        rdbDesc.setText("Desc");
        jPanel1.add(rdbDesc);
        rdbDesc.setBounds(700, 120, 60, 23);

        rdbAsc.setSelected(true);
        rdbAsc.setText("Asc");
        rdbAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAscActionPerformed(evt);
            }
        });
        jPanel1.add(rdbAsc);
        rdbAsc.setBounds(640, 120, 60, 23);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Membership Report");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(330, 40, 330, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 90, 60, 17);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(204, 255, 255));
        lblTime.setText("Time");
        jPanel1.add(lblTime);
        lblTime.setBounds(880, 504, 100, 20);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(204, 255, 255));
        lblDate.setText("Date");
        jPanel1.add(lblDate);
        lblDate.setBounds(780, 504, 90, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/reportBackground.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 30, 1000, 500);

        MFile.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/refreshMenu.jpg"))); // NOI18N
        jMenuItem1.setText("Refresh");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MFile.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/screenshootMenu.jpg"))); // NOI18N
        jMenuItem3.setText("PrintScreen");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MFile.add(jMenuItem3);

        MuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/exitmenu.jpg"))); // NOI18N
        MuItemExit.setText("Exit");
        MuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuItemExitActionPerformed(evt);
            }
        });
        MFile.add(MuItemExit);

        jMenuBar1.add(MFile);

        MForms.setText("Forms");

        jRadioButtonMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Show/Hide MenuBar");
        MForms.add(jRadioButtonMenuItem2);

        MWorkingForms.setText("Working Forms");

        MFacilityForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        MFacilityForm.setText("Facility form");
        MWorkingForms.add(MFacilityForm);

        MClassForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        MClassForm.setText("Class form");
        MWorkingForms.add(MClassForm);

        MMemberForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        MMemberForm.setText("Member form");
        MWorkingForms.add(MMemberForm);

        MMembershipForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
        MMembershipForm.setText("Membership form");
        MWorkingForms.add(MMembershipForm);

        MAccounting.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_MASK));
        MAccounting.setText("Accounting form");
        MWorkingForms.add(MAccounting);

        MForms.add(MWorkingForms);

        MReportingForms.setText("Reporting Forms");

        MMemberReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MMemberReport.setText("Member report");
        MReportingForms.add(MMemberReport);

        MClassReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MClassReport.setText("Class report");
        MReportingForms.add(MClassReport);

        MMembershipReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MMembershipReport.setText("Membership report");
        MReportingForms.add(MMembershipReport);

        MAccountingReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MAccountingReport.setText("Accounting report");
        MReportingForms.add(MAccountingReport);

        MForms.add(MReportingForms);

        jMenuBar1.add(MForms);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        Tools.PrintReports(tblMembership, "membershipreport");
    }//GEN-LAST:event_btnPrintActionPerformed
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String StrQuery = "select * from membershipreport where ";
        String StrOrder = "";
        if(rdbDays.isSelected()){
            StrQuery += "dayleft ";
            StrOrder +="dayleft";
        }
        else if (rdbSDate.isSelected()){
            StrQuery += "Start_date ";
            StrOrder +="start_date";
        }
        else if (rdbEDate.isSelected()){
            StrQuery += "end_date ";
            StrOrder +="end_date ";
        }
                else if (rdbClassName.isSelected()){
            StrQuery += "name ";
            StrOrder +="name";
        }
                else if (rdbMemberName.isSelected()){
            StrQuery += "m_name ";
            StrOrder +="m_name ";
        }
                else if (rdbStatus.isSelected()){
            StrQuery += "Status ";
            StrOrder +="Status";
        }

        String StrDescAsc = "desc";
        if (rdbDesc.isSelected()) {
            StrDescAsc = "desc";
        } else if (rdbAsc.isSelected()) {
            StrDescAsc = "asc";
        }
        StrQuery += " like '%" + txtSearch.getText() + "%'" + "order by " + StrOrder + " " + StrDescAsc;

        ms.getCustomRows(StrQuery, tblMembership);
    }//GEN-LAST:event_btnSearchActionPerformed
Membership ms = new Membership();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Group.add(rdbClassName);
        Group.add(rdbDays);
        Group.add(rdbEDate);
        Group.add(rdbMemberName);
        Group.add(rdbSDate);
        Group.add(rdbStatus);
        Group2.add(rdbAsc);
        Group2.add(rdbDesc);
        Tools.SetJTableReports(tblMembership);
        ms.getAllRowsReport(tblMembership);
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
        updateStatusAutomatic(5);
    }//GEN-LAST:event_formWindowOpened
  Member m = new Member();
  
    public void updateStatusAutomatic(int coulmnNumber) {
        int rowCount = tblMembership.getRowCount();
        String DayLift ;
        String MSNo;
        
        for (int x = 0; x < rowCount; x++) {
            DayLift = tblMembership.getValueAt(x,coulmnNumber).toString();
            if (DayLift.equals(0)){
            MSNo = tblMembership.getValueAt(x,0).toString();
        String query = "update membership set Status = 'unavailable' where ms_id = "+MSNo; 
        db.myDB.RunNonQuery(query);
            }
        }
    }
    private void btnClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassActionPerformed
        Tools.editForm(new ReportClass());
        this.dispose();
    }//GEN-LAST:event_btnClassActionPerformed

    private void btnMember1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMember1ActionPerformed
        Tools.editForm(new ReportMembership());
        this.dispose();
    }//GEN-LAST:event_btnMember1ActionPerformed

    private void btnMainReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainReportActionPerformed

        Tools.editForm(new ReportMain());
        this.dispose();
    }//GEN-LAST:event_btnMainReportActionPerformed

    private void btnAccountingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountingActionPerformed
        Tools.editForm(new ReportAccounting());
        this.dispose();
    }//GEN-LAST:event_btnAccountingActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Tools.editForm(new frmLogin());
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void rdbAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbAscActionPerformed

    private void btnMainnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainnActionPerformed
        Tools.editForm(new MainForm());
        this.dispose();    }//GEN-LAST:event_btnMainnActionPerformed
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Tools.ClearText(this);
        ms.getAllRows(tblMembership);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Tools.PrintScreenWithInput(this);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void MuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuItemExitActionPerformed
        boolean test = Tools.ConfirmInputBox("Are you sure ?");
        if (test) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_MuItemExitActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        Tools.editForm(new ReportMember());
        this.dispose();
    }//GEN-LAST:event_btnMemberActionPerformed

    private void rdbClassNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbClassNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbClassNameActionPerformed

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
            java.util.logging.Logger.getLogger(ReportMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportMembership().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group;
    private javax.swing.ButtonGroup Group2;
    private javax.swing.JMenuItem MAccounting;
    private javax.swing.JMenuItem MAccountingReport;
    private javax.swing.JMenuItem MClassForm;
    private javax.swing.JMenuItem MClassReport;
    private javax.swing.JMenuItem MFacilityForm;
    private javax.swing.JMenu MFile;
    private javax.swing.JMenu MForms;
    private javax.swing.JMenuItem MMemberForm;
    private javax.swing.JMenuItem MMemberReport;
    private javax.swing.JMenuItem MMembershipForm;
    private javax.swing.JMenuItem MMembershipReport;
    private javax.swing.JMenu MReportingForms;
    private javax.swing.JMenu MWorkingForms;
    private javax.swing.JMenuItem MuItemExit;
    private javax.swing.JButton btnAccounting;
    private javax.swing.JButton btnClass;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMainReport;
    private javax.swing.JButton btnMainn;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnMember1;
    private controls.JMyButton btnPrint;
    private controls.JMyButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JRadioButton rdbAsc;
    private javax.swing.JRadioButton rdbClassName;
    private javax.swing.JRadioButton rdbDays;
    private javax.swing.JRadioButton rdbDesc;
    private javax.swing.JRadioButton rdbEDate;
    private javax.swing.JRadioButton rdbMemberName;
    private javax.swing.JRadioButton rdbSDate;
    private javax.swing.JRadioButton rdbStatus;
    private javax.swing.JTable tblMembership;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
