package forms;

import Entity.*;
import gym.Tools;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class frmClas extends javax.swing.JFrame {

    public frmClas() {
        initComponents();
    }
    Clas cls = new Clas();
    Facility fac = new Facility();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group = new javax.swing.ButtonGroup();
        GroupAck = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNo = new controls.JTextBox(15);
        txtName = new controls.JTextBox(15);
        txtDay = new controls.JTextBox(15);
        jLabel7 = new javax.swing.JLabel();
        txtCost = new controls.JTextBox(15);
        cbFacility = new javax.swing.JComboBox<>();
        btnAdd = new controls.JMyButton();
        btnDelete = new controls.JMyButton();
        btnRefrish = new controls.JMyButton();
        btnUpdate = new controls.JMyButton();
        btnAddFacility = new controls.JMyButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClass = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdbDesc = new javax.swing.JRadioButton();
        txtSearch = new controls.JTextBox(10);
        rdbAsc = new javax.swing.JRadioButton();
        rdbNo = new javax.swing.JRadioButton();
        rdbDay = new javax.swing.JRadioButton();
        rdbName = new javax.swing.JRadioButton();
        rdbFacilityName = new javax.swing.JRadioButton();
        btnSearch = new controls.JMyButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnMain = new controls.JMyButtonToolBar();
        btnFacility = new controls.JMyButtonToolBar();
        btnClass = new controls.JMyButtonToolBar();
        btnMember = new controls.JMyButtonToolBar();
        btnMembership = new controls.JMyButtonToolBar();
        btnAccounting = new controls.JMyButtonToolBar();
        btnReportMain = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
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
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(204, 255, 255));
        lblTime.setText("Time");
        jPanel1.add(lblTime);
        lblTime.setBounds(830, 400, 90, 17);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(204, 255, 255));
        lblDate.setText("Date");
        jPanel1.add(lblDate);
        lblDate.setBounds(680, 400, 110, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Class No :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 120, 68, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subscription :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 150, 95, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Number Of Days :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 180, 122, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Facility Name :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 240, 99, 17);

        txtNo.setEditable(false);
        jPanel1.add(txtNo);
        txtNo.setBounds(130, 120, 100, 20);
        jPanel1.add(txtName);
        txtName.setBounds(130, 150, 100, 20);
        jPanel1.add(txtDay);
        txtDay.setBounds(130, 180, 100, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cost :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 210, 41, 17);
        jPanel1.add(txtCost);
        txtCost.setBounds(130, 210, 100, 20);

        cbFacility.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbFacility);
        cbFacility.setBounds(130, 240, 99, 20);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/add2.jpg"))); // NOI18N
        btnAdd.setToolTipText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);
        btnAdd.setBounds(40, 300, 40, 40);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/delete1.jpg"))); // NOI18N
        btnDelete.setToolTipText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(160, 300, 40, 40);

        btnRefrish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/refresh1.jpg"))); // NOI18N
        btnRefrish.setToolTipText("Refrsh");
        btnRefrish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrishActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefrish);
        btnRefrish.setBounds(220, 300, 40, 40);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/update1.jpg"))); // NOI18N
        btnUpdate.setToolTipText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(100, 300, 40, 40);

        btnAddFacility.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/add2.jpg"))); // NOI18N
        btnAddFacility.setToolTipText("Add Facility");
        btnAddFacility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFacilityActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddFacility);
        btnAddFacility.setBounds(230, 240, 50, 20);

        tblClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class No", "Subscription", "Days", "Cost", "Facility No", "Facility Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClassMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClass);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(330, 170, 590, 210);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Class Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 40, 200, 42);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 110, 56, 20);

        rdbDesc.setForeground(new java.awt.Color(51, 51, 51));
        rdbDesc.setSelected(true);
        rdbDesc.setText("Desc");
        jPanel1.add(rdbDesc);
        rdbDesc.setBounds(640, 140, 60, 23);

        txtSearch.setToolTipText("");
        jPanel1.add(txtSearch);
        txtSearch.setBounds(760, 140, 110, 20);

        rdbAsc.setForeground(new java.awt.Color(51, 51, 51));
        rdbAsc.setText("Asc");
        jPanel1.add(rdbAsc);
        rdbAsc.setBounds(700, 140, 50, 23);

        rdbNo.setForeground(new java.awt.Color(51, 51, 51));
        rdbNo.setSelected(true);
        rdbNo.setText("Class No");
        jPanel1.add(rdbNo);
        rdbNo.setBounds(510, 110, 80, 23);

        rdbDay.setForeground(new java.awt.Color(51, 51, 51));
        rdbDay.setText("Days");
        jPanel1.add(rdbDay);
        rdbDay.setBounds(700, 110, 60, 23);

        rdbName.setForeground(new java.awt.Color(51, 51, 51));
        rdbName.setText("Subscription");
        jPanel1.add(rdbName);
        rdbName.setBounds(590, 110, 110, 23);

        rdbFacilityName.setForeground(new java.awt.Color(51, 51, 51));
        rdbFacilityName.setText("Facility Name");
        jPanel1.add(rdbFacilityName);
        rdbFacilityName.setBounds(760, 110, 110, 23);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/searchMenu.jpg"))); // NOI18N
        btnSearch.setToolTipText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(870, 130, 30, 30);

        jToolBar1.setRollover(true);

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
        jToolBar1.add(btnMain);

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
        btnClass.setForeground(new java.awt.Color(102, 102, 102));
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
        jToolBar1.setBounds(0, 0, 930, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/background.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 30, 930, 400);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String SelectQuery = "select * from classdata where ";
        String OrderQuery = "";
        if (rdbNo.isSelected()) {
            SelectQuery += "c_no ";
            OrderQuery += "c_no";
        } else if (rdbName.isSelected()) {
            SelectQuery += "name";
            OrderQuery += "name ";
        } else if (rdbDay.isSelected()) {
            SelectQuery += "day ";
            OrderQuery += "day";
        } else if (rdbFacilityName.isSelected()) {
            SelectQuery += "f_type";
            OrderQuery += "f_type";
        }

        String AscDesc = "";
        if (rdbAsc.isSelected()) {
            AscDesc += "asc";
        } else if (rdbDesc.isSelected()) {
            AscDesc += "desc";
        }
        SelectQuery += " like '%" + txtSearch.getText() + "%' order by " + OrderQuery + " " + AscDesc;
        cls.getCustomRows(SelectQuery, tblClass);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void clearTexts() {
        Tools.ClearText(this);
        txtNo.setText(cls.getAutoNumber());

        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);

        txtName.requestFocus();
        cls.getAllRows(tblClass);
    }

    private void setTexts() {
        try {
            cls.setClassNo(Integer.parseInt(txtNo.getText()));
            cls.setSubscription(txtName.getText().toLowerCase());
            cls.setDayNo(Integer.parseInt(txtDay.getText()));
            cls.setCost(Integer.parseInt(txtCost.getText()));
            String facName = String.valueOf(cbFacility.getSelectedItem());
            String facNo = fac.getValueByName(facName);
            cls.setFasilityNo(Integer.parseInt(facNo));
        } catch (Exception ex) {
            Tools.MsgBox(ex.getMessage());
        }

    }


    private void tblClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClassMouseClicked
        // TODO add your handling code here:
        int row = tblClass.getSelectedRow();

        txtNo.setText(tblClass.getValueAt(row, 0).toString());
        txtName.setText(tblClass.getValueAt(row, 1).toString());
        txtDay.setText(tblClass.getValueAt(row, 2).toString());
        txtCost.setText(tblClass.getValueAt(row, 3).toString());
        cbFacility.setSelectedItem(tblClass.getValueAt(row, 5));

        btnAdd.setEnabled(false);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tblClassMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tblClass.getTableHeader().setReorderingAllowed(false);

        Group.add(rdbNo);
        Group.add(rdbDay);
        Group.add(rdbName);
        Group.add(rdbFacilityName);
        GroupAck.add(rdbAsc);
        GroupAck.add(rdbDesc);
        db.myDB.FillTableData("classdata", tblClass);
        db.myDB.FillComboBoxData("facility", "f_type", cbFacility);
        txtName.requestFocus();
        txtNo.setText(cls.getAutoNumber());

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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        setTexts();
        cls.add();
        clearTexts();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        setTexts();
        cls.update();
        clearTexts();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        setTexts();
        cls.delete();
        clearTexts();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefrishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrishActionPerformed
        // TODO add your handling code here:
        clearTexts();
    }//GEN-LAST:event_btnRefrishActionPerformed

    private void btnAddFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFacilityActionPerformed
        // TODO add your handling code here:
        fac.setFasilityNo(Integer.parseInt(fac.getAutoNumber()));
        fac.setType(Tools.InputBox("Enter Facility Name :").toString());
        fac.setDiscription(Tools.InputBox("Enter the discription :").toString());
        fac.add();
        db.myDB.FillComboBoxData("facility", "f_type", cbFacility);
        clearTexts();
    }//GEN-LAST:event_btnAddFacilityActionPerformed

    private void btnFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilityActionPerformed
        Tools.editForm(new frmFacility());
        this.dispose();
    }//GEN-LAST:event_btnFacilityActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        Tools.editForm(new MainForm());
        this.dispose();
    }//GEN-LAST:event_btnMainActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        Tools.editForm(new frmMember());
        this.dispose();
    }//GEN-LAST:event_btnMemberActionPerformed

    private void btnMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembershipActionPerformed

        Tools.editForm(new frmMembership());
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

    private void btnClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassActionPerformed
        Tools.editForm(new frmClas());
        this.dispose();
    }//GEN-LAST:event_btnClassActionPerformed

    private void btnReportMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportMainActionPerformed
        // TODO add your handling code here:
        Tools.editForm(new ReportMain());
        this.dispose();
    }//GEN-LAST:event_btnReportMainActionPerformed

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        clearTexts();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmClas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group;
    private javax.swing.ButtonGroup GroupAck;
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
    private controls.JMyButton btnAdd;
    private controls.JMyButton btnAddFacility;
    private javax.swing.JButton btnClass;
    private controls.JMyButton btnDelete;
    private javax.swing.JButton btnFacility;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnMembership;
    private controls.JMyButton btnRefrish;
    private javax.swing.JButton btnReportMain;
    private controls.JMyButton btnSearch;
    private controls.JMyButton btnUpdate;
    private javax.swing.JComboBox<String> cbFacility;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JRadioButton rdbAsc;
    private javax.swing.JRadioButton rdbDay;
    private javax.swing.JRadioButton rdbDesc;
    private javax.swing.JRadioButton rdbFacilityName;
    private javax.swing.JRadioButton rdbName;
    private javax.swing.JRadioButton rdbNo;
    private javax.swing.JTable tblClass;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
