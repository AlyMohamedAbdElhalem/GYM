/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Entity.Account;
import Entity.Clas;
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
public class frmMembership extends javax.swing.JFrame {

    public frmMembership() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group = new javax.swing.ButtonGroup();
        GroupPaid = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmembershipNo = new controls.JTextBox(15);
        txtMemberNo = new controls.JTextBox(15);
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rdbAvailable = new javax.swing.JRadioButton();
        rdbUnAvailable = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cbClass = new javax.swing.JComboBox<>();
        btnUpdate = new controls.JMyButton();
        btnAddMembership = new controls.JMyButton();
        btnAddAccount = new controls.JMyButton();
        jLabel6 = new javax.swing.JLabel();
        txtpend = new controls.JTextBox(15);
        rdbPaid = new javax.swing.JRadioButton();
        rdbBalance = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPaid = new controls.JTextBox(15);
        txtAmount = new controls.JTextBox(15);
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDiscount = new controls.JTextBox(15);
        jLabel14 = new javax.swing.JLabel();
        txtRison = new controls.JTextBox(15);
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMembership = new javax.swing.JTable();
        btnGetMemberName = new controls.JMyButton();
        btnRefresh = new controls.JMyButton();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnMembership = new controls.JMyButtonToolBar();
        btnFacility = new controls.JMyButtonToolBar();
        btnClass = new controls.JMyButtonToolBar();
        btnMember = new controls.JMyButtonToolBar();
        btnMembership1 = new controls.JMyButtonToolBar();
        btnAccounting = new controls.JMyButtonToolBar();
        btnReportMain = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnUpdateDate = new controls.JMyButton();
        btnAddAccountUpdate = new controls.JMyButton();
        jtxtStartDate = new com.toedter.calendar.JDateChooser();
        jtxtEndDate = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MuItemExit = new javax.swing.JMenuItem();
        MForms = new javax.swing.JMenu();
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

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Membership Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 50, 193, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Membership Info");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 100, 118, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Membership No :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 130, 120, 17);

        txtmembershipNo.setEditable(false);
        jPanel1.add(txtmembershipNo);
        txtmembershipNo.setBounds(150, 130, 120, 20);
        jPanel1.add(txtMemberNo);
        txtMemberNo.setBounds(150, 160, 120, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Member No :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 160, 89, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Start Date :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 190, 80, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("End Date :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 220, 72, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Status :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(86, 250, 54, 17);

        rdbAvailable.setForeground(new java.awt.Color(51, 51, 51));
        rdbAvailable.setSelected(true);
        rdbAvailable.setText("Available");
        jPanel1.add(rdbAvailable);
        rdbAvailable.setBounds(140, 250, 90, 23);

        rdbUnAvailable.setForeground(new java.awt.Color(51, 51, 51));
        rdbUnAvailable.setText("Unavailable");
        jPanel1.add(rdbUnAvailable);
        rdbUnAvailable.setBounds(230, 250, 100, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Class Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 280, 88, 17);

        cbClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClassActionPerformed(evt);
            }
        });
        jPanel1.add(cbClass);
        cbClass.setBounds(160, 280, 110, 20);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/update1.jpg"))); // NOI18N
        btnUpdate.setToolTipText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(130, 310, 40, 40);

        btnAddMembership.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/add2.jpg"))); // NOI18N
        btnAddMembership.setToolTipText("Add");
        btnAddMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMembershipActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddMembership);
        btnAddMembership.setBounds(80, 310, 40, 40);

        btnAddAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/done1.jpg"))); // NOI18N
        btnAddAccount.setToolTipText("Done");
        btnAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddAccount);
        btnAddAccount.setBounds(630, 310, 40, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pending Amount :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(510, 280, 130, 17);

        txtpend.setEditable(false);
        txtpend.setEnabled(false);
        jPanel1.add(txtpend);
        txtpend.setBounds(650, 280, 90, 20);

        rdbPaid.setForeground(new java.awt.Color(51, 51, 51));
        rdbPaid.setSelected(true);
        rdbPaid.setText("Paid");
        jPanel1.add(rdbPaid);
        rdbPaid.setBounds(640, 250, 60, 23);

        rdbBalance.setForeground(new java.awt.Color(51, 51, 51));
        rdbBalance.setText("Balance");
        rdbBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbBalanceActionPerformed(evt);
            }
        });
        jPanel1.add(rdbBalance);
        rdbBalance.setBounds(700, 250, 70, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Amount Status :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(520, 250, 120, 22);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("paiding amount: ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(520, 220, 120, 14);
        jPanel1.add(txtPaid);
        txtPaid.setBounds(650, 220, 90, 20);

        txtAmount.setEnabled(false);
        jPanel1.add(txtAmount);
        txtAmount.setBounds(650, 130, 90, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Amount :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(530, 130, 110, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rison :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(580, 190, 60, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Discount :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(560, 160, 80, 17);
        jPanel1.add(txtDiscount);
        txtDiscount.setBounds(650, 160, 90, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Account info");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(550, 100, 148, 17);
        jPanel1.add(txtRison);
        txtRison.setBounds(650, 190, 90, 20);

        tblMembership.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Name", "Start Date", "End Date", "Status", "Class Name", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMembership.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMembershipMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMembership);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 410, 820, 150);

        btnGetMemberName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/find1.jpg"))); // NOI18N
        btnGetMemberName.setToolTipText("Get member name by number");
        btnGetMemberName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetMemberNameActionPerformed(evt);
            }
        });
        jPanel1.add(btnGetMemberName);
        btnGetMemberName.setBounds(230, 310, 40, 40);

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/refresh1.jpg"))); // NOI18N
        btnRefresh.setToolTipText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh);
        btnRefresh.setBounds(180, 310, 40, 40);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDate.setForeground(new java.awt.Color(204, 255, 255));
        lblDate.setText("Date");
        jPanel1.add(lblDate);
        lblDate.setBounds(620, 390, 90, 15);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(204, 255, 255));
        lblTime.setText("Time");
        jPanel1.add(lblTime);
        lblTime.setBounds(720, 390, 90, 15);

        jToolBar1.setRollover(true);

        btnMembership.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMembership.setForeground(new java.awt.Color(0, 204, 51));
        btnMembership.setText("Main Form");
        btnMembership.setFocusable(false);
        btnMembership.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMembership.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembershipActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMembership);

        btnFacility.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFacility.setText("Facility Form");
        btnFacility.setFocusable(false);
        btnFacility.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFacility.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFacility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacilityActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFacility);

        btnClass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClass.setText("Class Form");
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
        btnMember.setText("Members Form");
        btnMember.setFocusable(false);
        btnMember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMember.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMember);

        btnMembership1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMembership1.setForeground(new java.awt.Color(102, 102, 102));
        btnMembership1.setText("Membership Form ");
        btnMembership1.setFocusable(false);
        btnMembership1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMembership1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMembership1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembership1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMembership1);

        btnAccounting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAccounting.setText("Accounting Form");
        btnAccounting.setFocusable(false);
        btnAccounting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccounting.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccounting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountingActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAccounting);

        btnReportMain.setBackground(new java.awt.Color(255, 255, 255));
        btnReportMain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReportMain.setForeground(new java.awt.Color(51, 51, 255));
        btnReportMain.setText("Main Reports");
        btnReportMain.setFocusable(false);
        btnReportMain.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportMain.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReportMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportMainActionPerformed(evt);
            }
        });
        jToolBar1.add(btnReportMain);

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
        jToolBar1.setBounds(0, 0, 700, 30);

        btnUpdateDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/done1.jpg"))); // NOI18N
        btnUpdateDate.setToolTipText("Done");
        btnUpdateDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateDate);
        btnUpdateDate.setBounds(280, 190, 30, 50);

        btnAddAccountUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/done1.jpg"))); // NOI18N
        btnAddAccountUpdate.setToolTipText("renovation");
        btnAddAccountUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccountUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddAccountUpdate);
        btnAddAccountUpdate.setBounds(630, 310, 40, 40);
        jPanel1.add(jtxtStartDate);
        jtxtStartDate.setBounds(150, 190, 120, 20);
        jPanel1.add(jtxtEndDate);
        jtxtEndDate.setBounds(150, 220, 120, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/background.jpg"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 30, 820, 380);

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

        MWorkingForms.setText("Working Forms");

        MFacilityForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        MFacilityForm.setText("Facility form");
        MFacilityForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MFacilityFormActionPerformed(evt);
            }
        });
        MWorkingForms.add(MFacilityForm);

        MClassForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        MClassForm.setText("Class form");
        MClassForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MClassFormActionPerformed(evt);
            }
        });
        MWorkingForms.add(MClassForm);

        MMemberForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        MMemberForm.setText("Member form");
        MMemberForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMemberFormActionPerformed(evt);
            }
        });
        MWorkingForms.add(MMemberForm);

        MMembershipForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
        MMembershipForm.setText("Membership form");
        MMembershipForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMembershipFormActionPerformed(evt);
            }
        });
        MWorkingForms.add(MMembershipForm);

        MAccounting.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_MASK));
        MAccounting.setText("Accounting form");
        MAccounting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAccountingActionPerformed(evt);
            }
        });
        MWorkingForms.add(MAccounting);

        MForms.add(MWorkingForms);

        MReportingForms.setText("Reporting Forms");

        MMemberReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MMemberReport.setText("Member report");
        MMemberReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMemberReportActionPerformed(evt);
            }
        });
        MReportingForms.add(MMemberReport);

        MClassReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MClassReport.setText("Class report");
        MClassReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MClassReportActionPerformed(evt);
            }
        });
        MReportingForms.add(MClassReport);

        MMembershipReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MMembershipReport.setText("Membership report");
        MMembershipReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMembershipReportActionPerformed(evt);
            }
        });
        MReportingForms.add(MMembershipReport);

        MAccountingReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MAccountingReport.setText("Accounting report");
        MAccountingReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAccountingReportActionPerformed(evt);
            }
        });
        MReportingForms.add(MAccountingReport);

        MForms.add(MReportingForms);

        jMenuBar1.add(MForms);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Membership ms = new Membership();
    Clas cls = new Clas();
    Account ac = new Account();
    Member mem = new Member();
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

        clearTexts();
        db.myDB.FillTableData("membershipdata", tblMembership);
        db.myDB.FillComboBoxData("clas", "name", cbClass);
        txtDiscount.setText("0");
        txtRison.setText("No iscount");
        setTextsAfterAdd(false, true);
        btnUpdate.setEnabled(false);
        Group.add(rdbAvailable);
        Group.add(rdbUnAvailable);
        GroupPaid.add(rdbPaid);
        GroupPaid.add(rdbBalance);
        btnUpdateDate.setVisible(false);
        btnAddAccountUpdate.setVisible(false);

        tblMembership.getTableHeader().setReorderingAllowed(false);

    }//GEN-LAST:event_formWindowOpened

    private void btnAddMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMembershipActionPerformed
        // TODO add your handling code here:
        try {
            setMembershipValues();
            ms.add();
            setTextsAfterAdd(true, false);
            txtDiscount.requestFocus();
        } catch (Exception ex) {
            Tools.MsgBox("Make sure you fill all of the texts or member number not exist");
            txtMemberNo.requestFocus();
        }
    }//GEN-LAST:event_btnAddMembershipActionPerformed
    public void setTextsAfterAdd(boolean MS, boolean Acc) {
        txtDiscount.setEnabled(MS);
        txtRison.setEnabled(MS);
        txtPaid.setEnabled(MS);
        rdbPaid.setEnabled(MS);
        rdbBalance.setEnabled(MS);
        btnAddAccount.setVisible(MS);

        txtMemberNo.setEnabled(Acc);
        jtxtEndDate.setEnabled(Acc);
        jtxtStartDate.setEnabled(Acc);
        cbClass.setEnabled(Acc);
        btnAddMembership.setVisible(Acc);

    }
    private void btnAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccountActionPerformed
        // TODO add your handling code here:
        setAccountValues();
        ac.add();
        setTextsAfterAdd(false, true);
        String name = mem.getNameByVlaue(txtMemberNo.getText());
        Tools.MsgBox("Welcome " + name);
        clearTexts();

    }//GEN-LAST:event_btnAddAccountActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        setTextsAfterAdd(false, true);
        btnAddAccountUpdate.setVisible(false);
        rdbUnAvailable.setEnabled(true);
        rdbAvailable.setEnabled(true);
        clearTexts();
        txtDiscount.setText("0");
        txtRison.setText("No iscount");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnGetMemberNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetMemberNameActionPerformed

        String Number = Tools.InputBox("Enter member number : ").toString();
        Tools.MsgBox("Member name is : " + mem.getNameByVlaue(Number));
    }//GEN-LAST:event_btnGetMemberNameActionPerformed

    private void tblMembershipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMembershipMouseClicked
        // TODO add your handling code here:
        try {
            int row = tblMembership.getSelectedRow();
            txtmembershipNo.setText((tblMembership.getValueAt(row, 0).toString()));
            String name = tblMembership.getValueAt(row, 1).toString();
            String value = mem.getValueByName(name);
            txtMemberNo.setText(String.valueOf(value));

            SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-DD");
            Date sdate = f.parse(tblMembership.getValueAt(row, 2).toString());
            jtxtStartDate.setDate(sdate);
            Date edate = f.parse(tblMembership.getValueAt(row, 3).toString());
            jtxtEndDate.setDate(edate);
            String Stat = tblMembership.getValueAt(row, 4).toString();
            if (Stat.equals("available")) {
                rdbAvailable.setSelected(true);
            } else {
                rdbUnAvailable.setSelected(true);
            }
            cbClass.setSelectedItem(tblMembership.getValueAt(row, 5).toString());
            btnAddMembership.setEnabled(false);
            btnUpdate.setEnabled(true);
            jtxtStartDate.setEnabled(false);
            jtxtEndDate.setEnabled(false);
            txtMemberNo.setEnabled(false);

        } catch (Exception ex) {
            Tools.MsgBox(ex.getMessage());
        }
    }//GEN-LAST:event_tblMembershipMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            setMembershipValues();
            ms.update();
            setTextsAfterAdd(true, false);
            btnUpdate.setEnabled(false);
            txtDiscount.requestFocus();
            btnAddAccount.setVisible(false);
            rdbUnAvailable.setEnabled(false);
            rdbAvailable.setEnabled(false);
            btnAddAccountUpdate.setVisible(true);
                    txtDiscount.setText("0");
        txtRison.setText("No iscount");
        } catch (Exception ex) {
            Tools.MsgBox("Make sure you fill all of the texts or member number not exist");
            txtMemberNo.requestFocus();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cbClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClassActionPerformed

    private void btnFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilityActionPerformed
        Tools.editForm(new frmFacility());
        this.dispose();
    }//GEN-LAST:event_btnFacilityActionPerformed

    private void btnClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassActionPerformed
        Tools.editForm(new frmClas());
        this.dispose();
    }//GEN-LAST:event_btnClassActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        Tools.editForm(new frmMember());
        this.dispose();
    }//GEN-LAST:event_btnMemberActionPerformed

    private void btnMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembershipActionPerformed

        Tools.editForm(new MainForm());
        this.dispose();
    }//GEN-LAST:event_btnMembershipActionPerformed

    private void btnAccountingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountingActionPerformed
        Tools.editForm(new frmAccounting());
        this.dispose();
    }//GEN-LAST:event_btnAccountingActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Tools.editForm(new frmLogin());
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnReportMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportMainActionPerformed
        // TODO add your handling code here:
        Tools.editForm(new ReportMain());
        this.dispose();
    }//GEN-LAST:event_btnReportMainActionPerformed

    private void btnMembership1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembership1ActionPerformed

        Tools.editForm(new frmMembership());
        this.dispose();
    }//GEN-LAST:event_btnMembership1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        clearTexts();
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

    private void MFacilityFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MFacilityFormActionPerformed
        Tools.editForm(new frmFacility());
        this.dispose();
    }//GEN-LAST:event_MFacilityFormActionPerformed

    private void MClassFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MClassFormActionPerformed
        Tools.editForm(new frmClas());
        this.dispose();
    }//GEN-LAST:event_MClassFormActionPerformed

    private void MMemberFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMemberFormActionPerformed
        Tools.editForm(new frmMember());
        this.dispose();
    }//GEN-LAST:event_MMemberFormActionPerformed

    private void MMembershipFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMembershipFormActionPerformed
        Tools.editForm(new frmMembership());
        this.dispose();
    }//GEN-LAST:event_MMembershipFormActionPerformed

    private void MAccountingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAccountingActionPerformed
        Tools.editForm(new frmAccounting());
        this.dispose();
    }//GEN-LAST:event_MAccountingActionPerformed

    private void MMemberReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMemberReportActionPerformed
        Tools.editForm(new ReportMember());
        this.dispose();
    }//GEN-LAST:event_MMemberReportActionPerformed

    private void MClassReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MClassReportActionPerformed

        Tools.editForm(new ReportClass());
        this.dispose();
    }//GEN-LAST:event_MClassReportActionPerformed

    private void MMembershipReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMembershipReportActionPerformed
        // TODO add your handling code here:

        Tools.editForm(new ReportMembership());
        this.dispose();
    }//GEN-LAST:event_MMembershipReportActionPerformed

    private void MAccountingReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAccountingReportActionPerformed
        Tools.editForm(new ReportAccounting());
        this.dispose();
    }//GEN-LAST:event_MAccountingReportActionPerformed

    private void btnUpdateDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDateActionPerformed
        setMembershipValues();
        ms.update();
        clearTexts();
        setTextsAfterAdd(false, true);
        btnUpdateDate.setVisible(false);

    }//GEN-LAST:event_btnUpdateDateActionPerformed

    private void btnAddAccountUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccountUpdateActionPerformed
        setAccountValues();
        ac.add();
        setTextsAfterAdd(false, false);
        jtxtEndDate.setEnabled(true);
        jtxtStartDate.setEnabled(true);
        btnUpdateDate.setVisible(true);
        String name = mem.getNameByVlaue(txtMemberNo.getText());
        Tools.MsgBox("Welcome back " + name);
        btnAddAccountUpdate.setVisible(false);
    }//GEN-LAST:event_btnAddAccountUpdateActionPerformed

    private void rdbBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbBalanceActionPerformed

    public void clearTexts() {
        Tools.ClearText(this);
        txtmembershipNo.setText(ms.getAutoNumber());
        txtMemberNo.requestFocus();
        db.myDB.FillTableData("membershipdata", tblMembership);
        btnAddMembership.setEnabled(true);
        btnUpdate.setEnabled(false);

    }

    public void setMembershipValues() {
        ms.setMsID(Integer.parseInt(txtmembershipNo.getText()));
        ms.setMemberNo(Integer.parseInt(txtMemberNo.getText()));
        String ClassName = cbClass.getSelectedItem().toString();
        ms.setClassNo(Integer.parseInt(cls.getValueByName(ClassName)));
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        ms.setStartDate(String.valueOf(s.format(jtxtStartDate.getDate())));
        ms.setEndDate(String.valueOf(s.format(jtxtEndDate.getDate())));
        rdbAvailable.setActionCommand("available");
        rdbUnAvailable.setActionCommand("unavailable");
        ms.setStatus(Group.getSelection().getActionCommand());
        String cost = ms.getCostByValue(String.valueOf(Integer.parseInt(cls.getValueByName(ClassName))));
        txtAmount.setText(cost);
    }

    public void ClearAccount() {
        Tools.ClearText(this);
    }

    public void setAccountValues() {
        ac.setAccountNo(Integer.parseInt(ac.getAutoNumber()));
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        ac.setAccountDate(s.format(d));
        ac.setAmount(Integer.parseInt(txtAmount.getText()));
        rdbPaid.setActionCommand("paid");
        rdbBalance.setActionCommand("balance");
        ac.setAmount_status(GroupPaid.getSelection().getActionCommand());
        ac.setPaiding_amount(Integer.parseInt(txtPaid.getText()));
        ac.setDisccount(Integer.parseInt(txtDiscount.getText()));
        int Mains = Integer.parseInt(txtDiscount.getText()) + Integer.parseInt(txtPaid.getText());
        int pending = Integer.parseInt(txtAmount.getText()) - Mains;
        ac.setPending_amount(Integer.parseInt(String.valueOf(pending)));
        ac.setRison(txtRison.getText());
        ac.setMs_id(Integer.parseInt(txtmembershipNo.getText()));
    }

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
            java.util.logging.Logger.getLogger(frmMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMembership().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group;
    private javax.swing.ButtonGroup GroupPaid;
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
    private controls.JMyButton btnAddAccount;
    private controls.JMyButton btnAddAccountUpdate;
    private controls.JMyButton btnAddMembership;
    private javax.swing.JButton btnClass;
    private javax.swing.JButton btnFacility;
    private controls.JMyButton btnGetMemberName;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnMembership;
    private javax.swing.JButton btnMembership1;
    private controls.JMyButton btnRefresh;
    private javax.swing.JButton btnReportMain;
    private controls.JMyButton btnUpdate;
    private controls.JMyButton btnUpdateDate;
    private javax.swing.JComboBox<String> cbClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private com.toedter.calendar.JDateChooser jtxtEndDate;
    private com.toedter.calendar.JDateChooser jtxtStartDate;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JRadioButton rdbAvailable;
    private javax.swing.JRadioButton rdbBalance;
    private javax.swing.JRadioButton rdbPaid;
    private javax.swing.JRadioButton rdbUnAvailable;
    private javax.swing.JTable tblMembership;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtMemberNo;
    private javax.swing.JTextField txtPaid;
    private javax.swing.JTextField txtRison;
    private javax.swing.JTextField txtmembershipNo;
    private javax.swing.JTextField txtpend;
    // End of variables declaration//GEN-END:variables
}
