package forms;

import Entity.Account;
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
public class ReportAccounting extends javax.swing.JFrame {

    /**
     * Creates new form ReportAccounting
     */
    public ReportAccounting() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group = new javax.swing.ButtonGroup();
        Group2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rdbNumber = new javax.swing.JRadioButton();
        rdbName = new javax.swing.JRadioButton();
        rdbDate = new javax.swing.JRadioButton();
        rdbStatus = new javax.swing.JRadioButton();
        rdbAmount = new javax.swing.JRadioButton();
        rdbPaiding = new javax.swing.JRadioButton();
        rdbPending = new javax.swing.JRadioButton();
        rdbDiscount = new javax.swing.JRadioButton();
        rdbMembershipId = new javax.swing.JRadioButton();
        ToolBar = new javax.swing.JToolBar();
        btnMain = new javax.swing.JButton();
        btnClass = new controls.JMyButtonToolBar();
        btnMember = new controls.JMyButtonToolBar();
        btnMembership = new controls.JMyButtonToolBar();
        btnMember1 = new controls.JMyButtonToolBar();
        btnAccounting = new controls.JMyButtonToolBar();
        btnLogout = new javax.swing.JButton();
        rdbMemberNo = new javax.swing.JRadioButton();
        btnSearch = new controls.JMyButton();
        txtSearch = new controls.JTextBox(15);
        rdbDesc = new javax.swing.JRadioButton();
        rdbAsc = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAccounting = new javax.swing.JTable();
        btnPrint = new controls.JMyButton();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalAmount = new controls.JTextBox(7);
        txtTotalPaiding = new controls.JTextBox(7);
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTotalPending = new controls.JTextBox(7);
        txtTotalDiscount = new controls.JTextBox(7);
        jLabel17 = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        btnSearchDate = new javax.swing.JButton();
        JDateFrom = new com.toedter.calendar.JDateChooser();
        JDateTo = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MuItemExit = new javax.swing.JMenuItem();
        MuFind = new javax.swing.JMenu();
        MenuSearchDate = new javax.swing.JMenuItem();
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Accounting Report");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 40, 330, 42);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Search :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(160, 120, 51, 17);

        rdbNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbNumber.setSelected(true);
        rdbNumber.setText("Number");
        jPanel1.add(rdbNumber);
        rdbNumber.setBounds(220, 120, 70, 23);

        rdbName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbName.setText("Name");
        jPanel1.add(rdbName);
        rdbName.setBounds(290, 120, 70, 23);

        rdbDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbDate.setText("Date");
        jPanel1.add(rdbDate);
        rdbDate.setBounds(360, 120, 60, 23);

        rdbStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbStatus.setText("Status");
        jPanel1.add(rdbStatus);
        rdbStatus.setBounds(420, 120, 70, 23);

        rdbAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbAmount.setText("Amount");
        jPanel1.add(rdbAmount);
        rdbAmount.setBounds(493, 120, 70, 23);

        rdbPaiding.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbPaiding.setText("Paiding");
        jPanel1.add(rdbPaiding);
        rdbPaiding.setBounds(560, 120, 70, 23);

        rdbPending.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbPending.setText("Pending");
        jPanel1.add(rdbPending);
        rdbPending.setBounds(630, 120, 80, 23);

        rdbDiscount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbDiscount.setText("Discount");
        jPanel1.add(rdbDiscount);
        rdbDiscount.setBounds(710, 120, 80, 23);

        rdbMembershipId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbMembershipId.setText("Membership ID");
        jPanel1.add(rdbMembershipId);
        rdbMembershipId.setBounds(790, 120, 120, 23);

        ToolBar.setRollover(true);

        btnMain.setBackground(new java.awt.Color(255, 255, 255));
        btnMain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMain.setForeground(new java.awt.Color(0, 204, 51));
        btnMain.setText("Main Form");
        btnMain.setFocusable(false);
        btnMain.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMain.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        ToolBar.add(btnMain);

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
        ToolBar.add(btnClass);

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
        ToolBar.add(btnMember);

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
        ToolBar.add(btnMembership);

        btnMember1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMember1.setForeground(new java.awt.Color(102, 102, 102));
        btnMember1.setText("Accounting Report");
        btnMember1.setFocusable(false);
        btnMember1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMember1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMember1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMember1ActionPerformed(evt);
            }
        });
        ToolBar.add(btnMember1);

        btnAccounting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAccounting.setForeground(new java.awt.Color(0, 0, 255));
        btnAccounting.setText("Main Report");
        btnAccounting.setFocusable(false);
        btnAccounting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccounting.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccounting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountingActionPerformed(evt);
            }
        });
        ToolBar.add(btnAccounting);

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
        ToolBar.add(btnLogout);

        jPanel1.add(ToolBar);
        ToolBar.setBounds(0, 0, 1120, 30);

        rdbMemberNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbMemberNo.setText("Member No");
        jPanel1.add(rdbMemberNo);
        rdbMemberNo.setBounds(920, 120, 100, 23);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/searchMenu.jpg"))); // NOI18N
        btnSearch.setToolTipText("Searsh");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(1020, 140, 30, 30);
        jPanel1.add(txtSearch);
        txtSearch.setBounds(900, 150, 120, 20);

        rdbDesc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbDesc.setText("Desc");
        jPanel1.add(rdbDesc);
        rdbDesc.setBounds(820, 150, 70, 23);

        rdbAsc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbAsc.setSelected(true);
        rdbAsc.setText("Asc");
        jPanel1.add(rdbAsc);
        rdbAsc.setBounds(770, 150, 50, 23);

        tblAccounting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        tblAccounting.setToolTipText("");
        tblAccounting.setAutoscrolls(false);
        jScrollPane2.setViewportView(tblAccounting);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 190, 1100, 330);

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/print.png"))); // NOI18N
        btnPrint.setToolTipText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrint);
        btnPrint.setBounds(10, 530, 150, 40);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(204, 255, 255));
        lblDate.setText("jLabel3");
        jPanel1.add(lblDate);
        lblDate.setBounds(870, 550, 110, 17);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(204, 255, 255));
        lblTime.setText("p");
        jPanel1.add(lblTime);
        lblTime.setBounds(1010, 550, 100, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total Amount :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(310, 530, 104, 17);

        txtTotalAmount.setEditable(false);
        jPanel1.add(txtTotalAmount);
        txtTotalAmount.setBounds(310, 560, 90, 20);

        txtTotalPaiding.setEditable(false);
        jPanel1.add(txtTotalPaiding);
        txtTotalPaiding.setBounds(430, 560, 90, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total Paiding :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(430, 530, 98, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total Pending :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(550, 530, 104, 17);

        txtTotalPending.setEditable(false);
        jPanel1.add(txtTotalPending);
        txtTotalPending.setBounds(550, 560, 90, 20);

        txtTotalDiscount.setEditable(false);
        jPanel1.add(txtTotalDiscount);
        txtTotalDiscount.setBounds(670, 560, 90, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total Discount :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(670, 530, 110, 17);

        lblTo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTo.setForeground(new java.awt.Color(204, 255, 255));
        lblTo.setText("TO :");
        jPanel1.add(lblTo);
        lblTo.setBounds(190, 40, 30, 14);

        lblFrom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFrom.setForeground(new java.awt.Color(204, 255, 255));
        lblFrom.setText("From :");
        jPanel1.add(lblFrom);
        lblFrom.setBounds(10, 40, 40, 15);

        btnSearchDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/searchMenu.jpg"))); // NOI18N
        btnSearchDate.setToolTipText("Search Date");
        btnSearchDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDateActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchDate);
        btnSearchDate.setBounds(340, 30, 30, 30);
        jPanel1.add(JDateFrom);
        JDateFrom.setBounds(60, 40, 110, 20);
        jPanel1.add(JDateTo);
        JDateTo.setBounds(220, 40, 110, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/reportBackground.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 30, 1120, 570);

        MenuFile.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/refreshMenu.jpg"))); // NOI18N
        jMenuItem1.setText("Refresh");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuFile.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/screenshootMenu.jpg"))); // NOI18N
        jMenuItem3.setText("PrintScreen");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuFile.add(jMenuItem3);

        MuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/exitmenu.jpg"))); // NOI18N
        MuItemExit.setText("Exit");
        MuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuItemExitActionPerformed(evt);
            }
        });
        MenuFile.add(MuItemExit);

        jMenuBar1.add(MenuFile);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Tools.ClearText(this);
        calcCoulmn();
    }//GEN-LAST:event_btnSearchActionPerformed
    public String strQuery;

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
    Account a = new Account();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Group.add(rdbDate);
        Group.add(rdbPending);
        Group.add(rdbName);
        Group.add(rdbNumber);
        Group.add(rdbStatus);
        Group.add(rdbAmount);
        Group.add(rdbPaiding);
        Group.add(rdbMembershipId);
        Group.add(rdbMemberNo);
        Group.add(rdbDiscount);
        Group2.add(rdbDesc);
        Group2.add(rdbAsc);
        Tools.SetJTableReports(tblAccounting);
        db.myDB.FillTableData("accountdata", tblAccounting);
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
        setSearchDate(false);
        calcCoulmn();

    }//GEN-LAST:event_formWindowOpened

    private void btnClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassActionPerformed
        Tools.editForm(new ReportClass());
        this.dispose();
    }//GEN-LAST:event_btnClassActionPerformed

    private void btnMember1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMember1ActionPerformed
        Tools.editForm(new ReportAccounting());
        this.dispose();
    }//GEN-LAST:event_btnMember1ActionPerformed

    private void btnMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembershipActionPerformed

        Tools.editForm(new ReportMembership());
        this.dispose();
    }//GEN-LAST:event_btnMembershipActionPerformed

    private void btnAccountingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountingActionPerformed
        Tools.editForm(new ReportMain());
        this.dispose();
    }//GEN-LAST:event_btnAccountingActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Tools.editForm(new frmLogin());
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        // TODO add your handling code here:
        Tools.editForm(new MainForm());
        this.dispose();
    }//GEN-LAST:event_btnMainActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        Tools.PrintReports(tblAccounting, "Accounting");

    }//GEN-LAST:event_btnPrintActionPerformed

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
    public void setSearchDate(boolean Visable) {
        lblFrom.setVisible(Visable);
        lblTo.setVisible(Visable);
        JDateTo.setVisible(Visable);
        JDateFrom.setVisible(Visable);
        btnSearchDate.setVisible(Visable);
    }
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

    private void MenuSearchDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSearchDateActionPerformed
        setSearchDate(true);
        calcCoulmn();
    }//GEN-LAST:event_MenuSearchDateActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        db.myDB.FillTableData("accountdata", tblAccounting);

        Tools.ClearText(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        Tools.editForm(new ReportMember());
        this.dispose();
    }//GEN-LAST:event_btnMemberActionPerformed

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
            java.util.logging.Logger.getLogger(ReportAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportAccounting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group;
    private javax.swing.ButtonGroup Group2;
    private com.toedter.calendar.JDateChooser JDateFrom;
    private com.toedter.calendar.JDateChooser JDateTo;
    private javax.swing.JMenuItem MAccounting;
    private javax.swing.JMenuItem MAccountingReport;
    private javax.swing.JMenuItem MClassForm;
    private javax.swing.JMenuItem MClassReport;
    private javax.swing.JMenuItem MFacilityForm;
    private javax.swing.JMenu MForms;
    private javax.swing.JMenuItem MMemberForm;
    private javax.swing.JMenuItem MMemberReport;
    private javax.swing.JMenuItem MMembershipForm;
    private javax.swing.JMenuItem MMembershipReport;
    private javax.swing.JMenu MReportingForms;
    private javax.swing.JMenu MWorkingForms;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenuItem MenuSearchDate;
    private javax.swing.JMenu MuFind;
    private javax.swing.JMenuItem MuItemExit;
    private javax.swing.JToolBar ToolBar;
    private javax.swing.JButton btnAccounting;
    private javax.swing.JButton btnClass;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnMember1;
    private javax.swing.JButton btnMembership;
    private controls.JMyButton btnPrint;
    private controls.JMyButton btnSearch;
    private javax.swing.JButton btnSearchDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTo;
    private javax.swing.JRadioButton rdbAmount;
    private javax.swing.JRadioButton rdbAsc;
    private javax.swing.JRadioButton rdbDate;
    private javax.swing.JRadioButton rdbDesc;
    private javax.swing.JRadioButton rdbDiscount;
    private javax.swing.JRadioButton rdbMemberNo;
    private javax.swing.JRadioButton rdbMembershipId;
    private javax.swing.JRadioButton rdbName;
    private javax.swing.JRadioButton rdbNumber;
    private javax.swing.JRadioButton rdbPaiding;
    private javax.swing.JRadioButton rdbPending;
    private javax.swing.JRadioButton rdbStatus;
    private javax.swing.JTable tblAccounting;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtTotalDiscount;
    private javax.swing.JTextField txtTotalPaiding;
    private javax.swing.JTextField txtTotalPending;
    // End of variables declaration//GEN-END:variables
}
