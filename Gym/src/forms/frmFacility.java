
package forms;

import Entity.Facility;
import gym.Tools;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class frmFacility extends javax.swing.JFrame {


    public frmFacility() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group = new javax.swing.ButtonGroup();
        GroupBy = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNo = new controls.JTextBox(15);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new controls.JTextBox(15);
        txtDiscription = new controls.JTextBox(15);
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFacility = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        rdbDesc = new javax.swing.JRadioButton();
        txtSearch = new controls.JTextBox(10);
        rdbAsc = new javax.swing.JRadioButton();
        rdbNo = new javax.swing.JRadioButton();
        rdbDiscription = new javax.swing.JRadioButton();
        rdbName = new javax.swing.JRadioButton();
        btnSearch = new controls.JMyButton();
        btnAdd = new controls.JMyButton();
        btnUpdate = new controls.JMyButton();
        btnDelete = new controls.JMyButton();
        btnRefrish = new controls.JMyButton();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnMain = new controls.JMyButtonToolBar();
        btnFacility = new controls.JMyButtonToolBar();
        btnClass = new controls.JMyButtonToolBar();
        btnMember = new controls.JMyButtonToolBar();
        btnMembership = new controls.JMyButtonToolBar();
        btnAccounting = new controls.JMyButtonToolBar();
        btnReportMain = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Facility Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 40, 220, 42);

        txtNo.setEditable(false);
        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNo);
        txtNo.setBounds(130, 190, 120, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Facility No :");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 190, 79, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name :");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(69, 220, 50, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Description :");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 250, 90, 17);
        jPanel1.add(txtName);
        txtName.setBounds(130, 220, 120, 20);
        jPanel1.add(txtDiscription);
        txtDiscription.setBounds(130, 250, 120, 20);

        tblFacility.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblFacility.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Facility No", "Name", "Discription"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFacility.setToolTipText("Facility Data");
        tblFacility.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFacilityMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFacility);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(400, 178, 500, 180);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search :");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(520, 120, 56, 17);

        rdbDesc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbDesc.setForeground(new java.awt.Color(51, 51, 51));
        rdbDesc.setText("Desc");
        jPanel1.add(rdbDesc);
        rdbDesc.setBounds(680, 150, 60, 20);
        jPanel1.add(txtSearch);
        txtSearch.setBounds(740, 150, 100, 20);

        rdbAsc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbAsc.setForeground(new java.awt.Color(51, 51, 51));
        rdbAsc.setSelected(true);
        rdbAsc.setText("Asc");
        rdbAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAscActionPerformed(evt);
            }
        });
        jPanel1.add(rdbAsc);
        rdbAsc.setBounds(620, 150, 60, 20);

        rdbNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbNo.setForeground(new java.awt.Color(51, 51, 51));
        rdbNo.setSelected(true);
        rdbNo.setText("Facility No");
        jPanel1.add(rdbNo);
        rdbNo.setBounds(580, 120, 90, 23);

        rdbDiscription.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbDiscription.setForeground(new java.awt.Color(51, 51, 51));
        rdbDiscription.setText("Description");
        jPanel1.add(rdbDiscription);
        rdbDiscription.setBounds(740, 120, 100, 23);

        rdbName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbName.setForeground(new java.awt.Color(51, 51, 51));
        rdbName.setText("Name");
        jPanel1.add(rdbName);
        rdbName.setBounds(670, 120, 70, 23);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/searsh1.jpg"))); // NOI18N
        btnSearch.setToolTipText("Searsh");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(840, 120, 50, 50);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/add2.jpg"))); // NOI18N
        btnAdd.setToolTipText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);
        btnAdd.setBounds(80, 280, 40, 40);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/update1.jpg"))); // NOI18N
        btnUpdate.setToolTipText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(150, 280, 40, 40);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/delete1.jpg"))); // NOI18N
        btnDelete.setToolTipText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(220, 280, 40, 40);

        btnRefrish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/refresh1.jpg"))); // NOI18N
        btnRefrish.setToolTipText("Refresh");
        btnRefrish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrishActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefrish);
        btnRefrish.setBounds(290, 280, 40, 40);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(204, 255, 255));
        lblTime.setText("Time");
        lblTime.setToolTipText("");
        jPanel1.add(lblTime);
        lblTime.setBounds(810, 370, 90, 17);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(204, 255, 255));
        lblDate.setText("Date");
        lblDate.setToolTipText("");
        jPanel1.add(lblDate);
        lblDate.setBounds(690, 370, 100, 17);

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
        btnFacility.setForeground(new java.awt.Color(102, 102, 102));
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
        jToolBar1.setBounds(0, 0, 920, 30);

        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/background.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 30, 920, 370);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        Group.add(rdbNo);
        Group.add(rdbDiscription);
        Group.add(rdbName);
        GroupBy.add(rdbAsc);
        GroupBy.add(rdbDesc);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        db.myDB.FillTableData("facility", tblFacility);
        tblFacility.getTableHeader().setReorderingAllowed(false);
        txtNo.setText(fac.getAutoNumber());
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
       // this.setAlwaysOnTop(true);
       

    }//GEN-LAST:event_formWindowOpened
    Facility fac = new Facility();

    private void clearTexts() {
        Tools.ClearText(this);
        txtNo.setText(fac.getAutoNumber());
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        txtName.requestFocus();
        fac.getAllRows(tblFacility);
    }

    private void setTexts() {
        try {
            fac.setFasilityNo(Integer.parseInt(txtNo.getText()));
            fac.setType(txtName.getText().toLowerCase());
            fac.setDiscription(txtDiscription.getText().toLowerCase());
        } catch (Exception ex) {
            Tools.MsgBox(ex.getMessage());
        }
    }
    private void tblFacilityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacilityMouseClicked
        // TODO add your handling code here:
        int row = tblFacility.getSelectedRow();
        txtNo.setText(tblFacility.getValueAt(row, 0).toString());
        txtName.setText(tblFacility.getValueAt(row, 1).toString());
        txtDiscription.setText(tblFacility.getValueAt(row, 2).toString());
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tblFacilityMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        setTexts();
        fac.add();
        clearTexts();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        setTexts();
        fac.update();
        clearTexts();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        setTexts();
        fac.delete();
        clearTexts();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefrishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrishActionPerformed
        // TODO add your handling code here:
        clearTexts();
    }//GEN-LAST:event_btnRefrishActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String SelectQuery = "select * from facility where ";
        String OrderQuery = "";        
        String AscDesc =  "";
                if(rdbNo.isSelected()){
                SelectQuery += "f_no ";
                OrderQuery += "f_no";
                }
                else if (rdbName.isSelected()){
                SelectQuery += "f_type ";
                OrderQuery += "f_type ";
                }
                else if(rdbDiscription.isSelected()){
                SelectQuery += "f_discription ";
                OrderQuery += "f_discription ";
                }
                if (rdbAsc.isSelected()){
                AscDesc += "asc";
                }
                else if(rdbDesc.isSelected()){
                AscDesc += "desc";
                }
                SelectQuery += " like '%"+txtSearch.getText()+"%' order by "+OrderQuery+" "+AscDesc;
                fac.getCustomRows(SelectQuery, tblFacility);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rdbAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbAscActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

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
        Tools.editForm(new frmAccounting());
        this.dispose();
    }//GEN-LAST:event_btnAccountingActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Tools.editForm(new frmLogin());
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        Tools.editForm(new MainForm());
        this.dispose();
    }//GEN-LAST:event_btnMainActionPerformed

    private void btnReportMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportMainActionPerformed
        // TODO add your handling code here:
        Tools.editForm(new ReportMain());
        this.dispose();
    }//GEN-LAST:event_btnReportMainActionPerformed

    private void btnFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilityActionPerformed
        Tools.editForm(new frmFacility());
        this.dispose();
    }//GEN-LAST:event_btnFacilityActionPerformed

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
            java.util.logging.Logger.getLogger(frmFacility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFacility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFacility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFacility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFacility().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group;
    private javax.swing.ButtonGroup GroupBy;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JRadioButton rdbAsc;
    private javax.swing.JRadioButton rdbDesc;
    private javax.swing.JRadioButton rdbDiscription;
    private javax.swing.JRadioButton rdbName;
    private javax.swing.JRadioButton rdbNo;
    private javax.swing.JTable tblFacility;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
