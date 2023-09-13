package forms;

import Entity.*;
import gym.Tools;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javafx.print.Collation;
import javax.swing.JTable;
import javax.swing.Timer;

public class frmAccounting extends javax.swing.JFrame {

    public frmAccounting() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group = new javax.swing.ButtonGroup();
        GroupOrder = new javax.swing.ButtonGroup();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalAmount = new controls.JTextBox(7);
        txtTotalPaiding = new controls.JTextBox(7);
        txtTotalPending = new controls.JTextBox(7);
        txtTotalDiscount = new controls.JTextBox(7);
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAccounting = new javax.swing.JTable();
        btnDelete = new controls.JMyButton();
        btnRefresh = new controls.JMyButton();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new controls.JMyButton();
        cbStatus = new javax.swing.JComboBox<>();
        txtAccountNo = new controls.JTextBox(5);
        btnAdd = new controls.JMyButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rdbNumber = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdbName = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rdbDate = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdbStatus = new javax.swing.JRadioButton();
        rdbAsc = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rdbDesc = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtSearch = new controls.JTextBox(15);
        jLabel10 = new javax.swing.JLabel();
        btnSearch = new controls.JMyButton();
        txtAmount = new controls.JTextBox(15);
        txtPaid = new controls.JTextBox(15);
        txtPend = new controls.JTextBox(15);
        txtDiscount = new controls.JTextBox(15);
        txtRison = new controls.JTextBox(15);
        txtMsNo = new controls.JTextBox(15);
        jToolBar1 = new javax.swing.JToolBar();
        btnAccounting = new controls.JMyButtonToolBar();
        btnFacility = new controls.JMyButtonToolBar();
        btnClass = new controls.JMyButtonToolBar();
        btnMember = new controls.JMyButtonToolBar();
        btnMembership = new controls.JMyButtonToolBar();
        btnAccounting1 = new controls.JMyButtonToolBar();
        btnReportMain = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblFrom = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        btnSearchDate = new javax.swing.JButton();
        jtxtDate = new com.toedter.calendar.JDateChooser();
        JDateFrom = new com.toedter.calendar.JDateChooser();
        JDateTo = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MuItemExit = new javax.swing.JMenuItem();
        MuFind = new javax.swing.JMenu();
        MenuSearchDate = new javax.swing.JMenuItem();
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

        jPanel1.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(null);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(204, 255, 255));
        lblTime.setText("Time");
        jPanel1.add(lblTime);
        lblTime.setBounds(920, 490, 100, 20);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(204, 255, 255));
        lblDate.setText("Date");
        jPanel1.add(lblDate);
        lblDate.setBounds(800, 490, 100, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total Discount :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(650, 440, 110, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total Pending :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(530, 440, 104, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total Paiding :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(410, 440, 98, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total Amount :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(290, 440, 104, 17);

        txtTotalAmount.setEditable(false);
        jPanel1.add(txtTotalAmount);
        txtTotalAmount.setBounds(290, 470, 90, 20);

        txtTotalPaiding.setEditable(false);
        jPanel1.add(txtTotalPaiding);
        txtTotalPaiding.setBounds(410, 470, 90, 20);

        txtTotalPending.setEditable(false);
        jPanel1.add(txtTotalPending);
        txtTotalPending.setBounds(530, 470, 90, 20);

        txtTotalDiscount.setEditable(false);
        jPanel1.add(txtTotalDiscount);
        txtTotalDiscount.setBounds(650, 470, 90, 20);

        tblAccounting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Date", "Name", "Amount", "Status", "Paid", "Pend", "Discount", "Rison", "ID", "Memmber No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAccounting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccountingMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAccounting);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(290, 160, 738, 270);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/delete1.jpg"))); // NOI18N
        btnDelete.setToolTipText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(170, 410, 40, 40);

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/refresh1.jpg"))); // NOI18N
        btnRefresh.setToolTipText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh);
        btnRefresh.setBounds(230, 410, 40, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Account management");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 40, 340, 28);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/update1.jpg"))); // NOI18N
        btnUpdate.setToolTipText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(110, 410, 40, 40);

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbStatus);
        cbStatus.setBounds(140, 220, 100, 20);

        txtAccountNo.setEditable(false);
        jPanel1.add(txtAccountNo);
        txtAccountNo.setBounds(140, 130, 120, 20);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/add2.jpg"))); // NOI18N
        btnAdd.setToolTipText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);
        btnAdd.setBounds(50, 410, 40, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Account No :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 130, 100, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Search :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(570, 100, 70, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Membership No :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 117, 17);

        rdbNumber.setForeground(new java.awt.Color(255, 255, 255));
        rdbNumber.setSelected(true);
        rdbNumber.setText("Number");
        jPanel1.add(rdbNumber);
        rdbNumber.setBounds(640, 100, 80, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Discount :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 310, 70, 17);

        rdbName.setForeground(new java.awt.Color(255, 255, 255));
        rdbName.setText("Name");
        jPanel1.add(rdbName);
        rdbName.setBounds(720, 100, 70, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Amount :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 190, 110, 17);

        rdbDate.setForeground(new java.awt.Color(255, 255, 255));
        rdbDate.setText("Date");
        jPanel1.add(rdbDate);
        rdbDate.setBounds(790, 100, 60, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pending Amount :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 280, 130, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Paiding Amount :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 250, 120, 17);

        rdbStatus.setForeground(new java.awt.Color(255, 255, 255));
        rdbStatus.setText("Status");
        jPanel1.add(rdbStatus);
        rdbStatus.setBounds(850, 100, 70, 23);

        rdbAsc.setForeground(new java.awt.Color(255, 255, 255));
        rdbAsc.setSelected(true);
        rdbAsc.setText("Asc");
        jPanel1.add(rdbAsc);
        rdbAsc.setBounds(710, 130, 50, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 220, 60, 17);

        rdbDesc.setForeground(new java.awt.Color(255, 255, 255));
        rdbDesc.setText("Desc");
        jPanel1.add(rdbDesc);
        rdbDesc.setBounds(760, 130, 60, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rison :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 340, 50, 17);
        jPanel1.add(txtSearch);
        txtSearch.setBounds(830, 130, 90, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 370, 50, 17);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/searchMenu.jpg"))); // NOI18N
        btnSearch.setToolTipText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(920, 120, 30, 30);
        jPanel1.add(txtAmount);
        txtAmount.setBounds(140, 190, 120, 20);
        jPanel1.add(txtPaid);
        txtPaid.setBounds(140, 250, 120, 20);

        txtPend.setEditable(false);
        jPanel1.add(txtPend);
        txtPend.setBounds(140, 280, 120, 20);
        jPanel1.add(txtDiscount);
        txtDiscount.setBounds(140, 310, 120, 20);
        jPanel1.add(txtRison);
        txtRison.setBounds(140, 340, 120, 20);
        jPanel1.add(txtMsNo);
        txtMsNo.setBounds(140, 160, 120, 20);

        jToolBar1.setRollover(true);

        btnAccounting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAccounting.setForeground(new java.awt.Color(0, 204, 51));
        btnAccounting.setText("Main Form");
        btnAccounting.setFocusable(false);
        btnAccounting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccounting.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccounting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountingActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAccounting);

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

        btnMembership.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMembership.setText("Membership Form");
        btnMembership.setFocusable(false);
        btnMembership.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMembership.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembershipActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMembership);

        btnAccounting1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAccounting1.setForeground(new java.awt.Color(102, 102, 102));
        btnAccounting1.setText("Accounting Form");
        btnAccounting1.setFocusable(false);
        btnAccounting1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccounting1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccounting1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccounting1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAccounting1);

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
        jToolBar1.setBounds(0, 0, 1020, 30);

        lblFrom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFrom.setForeground(new java.awt.Color(204, 255, 255));
        lblFrom.setText("From :");
        jPanel1.add(lblFrom);
        lblFrom.setBounds(10, 40, 40, 15);

        lblTo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTo.setForeground(new java.awt.Color(204, 255, 255));
        lblTo.setText("TO :");
        jPanel1.add(lblTo);
        lblTo.setBounds(190, 40, 30, 14);

        btnSearchDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/searchMenu.jpg"))); // NOI18N
        btnSearchDate.setToolTipText("Search Date");
        btnSearchDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDateActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchDate);
        btnSearchDate.setBounds(340, 30, 30, 30);
        jPanel1.add(jtxtDate);
        jtxtDate.setBounds(140, 370, 120, 20);
        jPanel1.add(JDateFrom);
        JDateFrom.setBounds(60, 40, 110, 20);
        jPanel1.add(JDateTo);
        JDateTo.setBounds(220, 40, 110, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/background.jpg"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, -20, 1060, 600);

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

        MuFind.setText("Search");

        MenuSearchDate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        MenuSearchDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/searchMenu.jpg"))); // NOI18N
        MenuSearchDate.setText("From Date To Date");
        MenuSearchDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSearchDateActionPerformed(evt);
            }
        });
        MuFind.add(MenuSearchDate);

        jMenuBar1.add(MuFind);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String StrQuery = "select * from accountdata where ";
        String StrOrder = "";
        if (rdbNumber.isSelected()) {
            StrQuery += " a_no ";
            StrOrder += " a_no ";
        } else if (rdbName.isSelected()) {
            StrQuery += " m_name ";
            StrOrder += " m_name";
        } else if (rdbStatus.isSelected()) {
            StrQuery += " amount_status ";
            StrOrder += " amount_status ";

        } else if (rdbDate.isSelected()) {
            StrQuery += " a_date ";
            StrOrder += " a_date ";

        }
        String StrDescAsc = "desc";
        if (rdbDesc.isSelected()) {
            StrDescAsc = " desc ";
        } else if (rdbAsc.isSelected()) {
            StrDescAsc = " asc ";
        }
        StrQuery += " like '%" + txtSearch.getText() + "%'" + "order by " + StrOrder + " " + StrDescAsc;
        strQuery = StrQuery;
        a.getCustomRows(StrQuery, tblAccounting);
        calcCoulmn();
    }//GEN-LAST:event_btnSearchActionPerformed

    Account a = new Account();
    Member mem = new Member();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Group.add(rdbDate);
        Group.add(rdbName);
        Group.add(rdbNumber);
        Group.add(rdbStatus);
        GroupOrder.add(rdbAsc);
        GroupOrder.add(rdbDesc);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        setSearchDate(false);
        clearTexts();
        calcCoulmn();
    }//GEN-LAST:event_formWindowOpened
    private String Memberno = "";
    private void tblAccountingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountingMouseClicked
        // TODO add your handling code here:
        try {
            int row = tblAccounting.getSelectedRow();
            txtAccountNo.setText((tblAccounting.getValueAt(row, 0).toString()));

            SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-DD");
            Date date = f.parse(tblAccounting.getValueAt(row, 1).toString());
            jtxtDate.setDate(date);
            txtAmount.setText(tblAccounting.getValueAt(row, 3).toString());
            cbStatus.setSelectedItem(tblAccounting.getValueAt(row, 4).toString());
            txtPaid.setText(tblAccounting.getValueAt(row, 5).toString());
            txtPend.setText(tblAccounting.getValueAt(row, 6).toString());
            txtDiscount.setText(tblAccounting.getValueAt(row, 7).toString());
            txtRison.setText(tblAccounting.getValueAt(row, 8).toString());
            txtMsNo.setText(tblAccounting.getValueAt(row, 9).toString());
            Memberno = tblAccounting.getValueAt(row, 10).toString();
            setValues();
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            jtxtDate.setEnabled(false);
        } catch (Exception ex) {
            Tools.MsgBox(ex.getMessage());
        }
    }//GEN-LAST:event_tblAccountingMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        clearTexts();
        calcCoulmn();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        setValues();
        a.add();
        clearTexts();
        calcCoulmn();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        setValues();
        a.update();
        clearTexts();
        calcCoulmn();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        setValues();
        a.delete();
        clearTexts();
        calcCoulmn();
    }//GEN-LAST:event_btnDeleteActionPerformed

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

        Tools.editForm(new frmMembership());
        this.dispose();
    }//GEN-LAST:event_btnMembershipActionPerformed

    private void btnAccountingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountingActionPerformed
        Tools.editForm(new MainForm());
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

    private void btnAccounting1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccounting1ActionPerformed
        Tools.editForm(new frmAccounting());
        this.dispose();
    }//GEN-LAST:event_btnAccounting1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        clearTexts();
        calcCoulmn();
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

    private void MenuSearchDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSearchDateActionPerformed
        setSearchDate(true);
        calcCoulmn();
    }//GEN-LAST:event_MenuSearchDateActionPerformed
    public void setSearchDate(boolean Visable) {
        lblFrom.setVisible(Visable);
        lblTo.setVisible(Visable);
        JDateTo.setVisible(Visable);
        JDateFrom.setVisible(Visable);
        btnSearchDate.setVisible(Visable);
    }
    public String strQuery;
    private void btnSearchDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDateActionPerformed
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String From = s.format(JDateFrom.getDate());
        String To = s.format(JDateTo.getDate());
        String querytest = "";
        querytest = strQuery.substring(0, 7).toLowerCase();
        String Query = "";
        if ("select ".equals(querytest)) {
            Query = "select * from (" + strQuery + ") as firstSelect where a_date between '" + From + "' and '" + To + "' ;";
        } else {
            Query = "select * from accountdata where a_date between '" + From + "' and '" + To + "' ;";
        }

        a.getCustomRows(Query, tblAccounting);
        Tools.ClearText(this);
        setSearchDate(false);
        calcCoulmn();
    }//GEN-LAST:event_btnSearchDateActionPerformed

    private void rdbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbStatusActionPerformed
    public int getSumCoulmn(int coulmnNumber) {
        int rowCount = tblAccounting.getRowCount();
        int sum = 0;

        for (int x = 0; x < rowCount; x++) {
            sum = sum + Integer.parseInt(tblAccounting.getValueAt(x, coulmnNumber).toString());
        }
        return sum;
    }

    public void calcCoulmn() {
        txtTotalAmount.setText(String.valueOf(getSumCoulmn(3)));
        txtTotalDiscount.setText(String.valueOf(getSumCoulmn(7)));
        txtTotalPaiding.setText(String.valueOf(getSumCoulmn(5)));
        txtTotalPending.setText(String.valueOf(getSumCoulmn(6)));
    }

    public void clearTexts() {
        Tools.ClearText(this);
        txtAccountNo.setText(a.getAutoNumber());
        txtMsNo.requestFocus();
        txtDiscount.setText("0");
        txtRison.setText("No Discount");
        tblAccounting.getTableHeader().setReorderingAllowed(false);

        db.myDB.FillComboBoxData("account", "amount_status", cbStatus);

        a.getAllRows(tblAccounting);
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        jtxtDate.setEnabled(true);

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
    }

    public void setValues() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        a.setMs_id(Integer.parseInt(txtMsNo.getText()));
        a.setAccountNo(Integer.parseInt(txtAccountNo.getText()));
        String date = String.valueOf(sdf.format(jtxtDate.getDate()));
        a.setAccountDate(date);

        a.setAmount(Integer.parseInt(txtAmount.getText()));
        a.setPaiding_amount(Integer.parseInt(txtPaid.getText()));
        a.setDisccount(Integer.parseInt(txtDiscount.getText()));
        int Mains = (Integer.parseInt(txtDiscount.getText()) + Integer.parseInt(txtPaid.getText()));
        int pending = Integer.parseInt(txtAmount.getText()) - Mains;
        a.setPending_amount(Integer.parseInt(String.valueOf(pending)));
        a.setAmount_status(cbStatus.getSelectedItem().toString().toLowerCase());
        a.setRison(txtRison.getText().toLowerCase());
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
            java.util.logging.Logger.getLogger(frmAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAccounting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group;
    private javax.swing.ButtonGroup GroupOrder;
    private com.toedter.calendar.JDateChooser JDateFrom;
    private com.toedter.calendar.JDateChooser JDateTo;
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
    private javax.swing.JMenuItem MenuSearchDate;
    private javax.swing.JMenu MuFind;
    private javax.swing.JMenuItem MuItemExit;
    private javax.swing.JButton btnAccounting;
    private javax.swing.JButton btnAccounting1;
    private controls.JMyButton btnAdd;
    private javax.swing.JButton btnClass;
    private controls.JMyButton btnDelete;
    private javax.swing.JButton btnFacility;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnMembership;
    private controls.JMyButton btnRefresh;
    private javax.swing.JButton btnReportMain;
    private controls.JMyButton btnSearch;
    private javax.swing.JButton btnSearchDate;
    private controls.JMyButton btnUpdate;
    private javax.swing.JComboBox<String> cbStatus;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private com.toedter.calendar.JDateChooser jtxtDate;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTo;
    private javax.swing.JRadioButton rdbAsc;
    private javax.swing.JRadioButton rdbDate;
    private javax.swing.JRadioButton rdbDesc;
    private javax.swing.JRadioButton rdbName;
    private javax.swing.JRadioButton rdbNumber;
    private javax.swing.JRadioButton rdbStatus;
    private javax.swing.JTable tblAccounting;
    private javax.swing.JTextField txtAccountNo;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtMsNo;
    private javax.swing.JTextField txtPaid;
    private javax.swing.JTextField txtPend;
    private javax.swing.JTextField txtRison;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtTotalDiscount;
    private javax.swing.JTextField txtTotalPaiding;
    private javax.swing.JTextField txtTotalPending;
    // End of variables declaration//GEN-END:variables
}
