package db;

import gym.Tools;
import gym.Tools.Table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class myDB {

    private static String url = "";
    private static Connection con;

    private static void setURL(String pCompanyName) {
        url = "jdbc:mysql://localhost:3306/" + pCompanyName
                + "?useUnicode=true&characterEncoding=UTF-8";
    }
    
    private static void setConnection() {
        try {
            setURL("gym");
            con = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            Tools.MsgBox(ex.getMessage());
        }
    }
    //بيأكد علي وجود اليوزر و كلمه السر 

    public static boolean CheackUserAndPass(String pUserName, String pPassword) {
        try {
            setConnection();
            Statement stm = con.createStatement();
            String sel = "Select * from users where username = '" + pUserName + "' and pass = '" + pPassword + "'";
            stm.executeQuery(sel);
            while (stm.getResultSet().next()) {
                con.close();
                return true;
            }
            con.close();
        } catch (SQLException ex) {
            Tools.MsgBox(ex.getMessage());
        }
        return false;
    }
// بيشغل الكويري الانا عايزه اذا كانت تعديل اضافه حذف و ترجه ترو او فولس 

    public static boolean RunNonQuery(String pSqlStatement) {
        try {
            setConnection();
            Statement stat = con.createStatement();
            stat.execute(pSqlStatement);
            con.close();
            return true;
        } catch (SQLException ex) {
            Tools.MsgBox(ex.getMessage());
            return false;
        }

    }
// سيكونس بيجيب اخر رقم و يزود واحد 

    public static String getAutoNumberOfColumn(String pTableName, String pCoulmnName) {
        try {
            setConnection();
            Statement stat = con.createStatement();
            String selectStat = "select max(" + pCoulmnName + ")+1 as autonum from " + pTableName;
            stat.executeQuery(selectStat);
            String num = "";
            while (stat.getResultSet().next()) {
                num = stat.getResultSet().getString("autonum");
            }
            con.close();
            if (num == null || "".equals(num)) {
                return "1";
            } else {
                return num;
            }
        } catch (SQLException ex) {
            Tools.MsgBox(ex.getMessage());
            return "0";
        }

    }
// بيجيب الداتا لجمله السيليكت داخل  تابول 

    public static Table getTableData(String pSqlQuery) {
        Tools t = new Tools();

        try {
            setConnection();
            Statement stat = con.createStatement();
            ResultSet rs;
            rs = stat.executeQuery(pSqlQuery);
            ResultSetMetaData rsmd = rs.getMetaData();
            int x = rsmd.getColumnCount();
            Object row[] = new Object[x];
            Table tabl = new Table(x);

            while (rs.next()) {
                //     row = new Object[x];
                for (int i = 0; i < x; i++) {
                    row[i] = rs.getString(i + 1);
                }

                Tools.Table.addNewRow(row);
            }
            Valuee = row[0];
            con.close();
            return tabl;
        } catch (SQLException ex) {
            Tools.MsgBox(ex.getMessage());
            return new Table(0);
        }
    }
    //هذا المتغير بيشيل اول قيمه في الرو    METhod (GetTableData)
    public static Object Valuee;
//بيمائ ال كومبو بوكس ب بيانات الكولم 

    public static void FillComboBoxData(String pTableName, String pCoulmnName, JComboBox combo) {
        try {
            setConnection();
            Statement stat = con.createStatement();
            ResultSet rs;
            String selectStat = "select Distinct " + pCoulmnName + " from " + pTableName;
            rs = stat.executeQuery(selectStat);
            rs.last();
            int x = rs.getRow();
            rs.beforeFirst();
            String values[] = new String[x];
            int i = 0;
            while (rs.next()) {
                values[i] = rs.getString(1);
                i++;

            }
            con.close();
            combo.setModel(new DefaultComboBoxModel(values));
        } catch (SQLException ex) {
            Tools.MsgBox(ex.getMessage());

        }
    }
//بيملئ التابول ب الداتا الانا بدهاله 

    public static void FillTableData(String SelectStatementOrTableName, JTable pTable) {
        try {
            setConnection();
            Statement stat = con.createStatement();
            ResultSet rs;
            String str = SelectStatementOrTableName.substring(0, 7).toLowerCase();
            String StrSelect;
            if ("select ".equals(str)) {
                StrSelect = SelectStatementOrTableName;

            } else {
                StrSelect = "select * from " + SelectStatementOrTableName;
            }
            rs = stat.executeQuery(StrSelect);
            ResultSetMetaData rsmd = rs.getMetaData();

            int c = rsmd.getColumnCount();
            DefaultTableModel DTM = (DefaultTableModel) pTable.getModel();
            DTM.setRowCount(0);
            Vector row = new Vector();
            if (pTable.getColumnCount() == c) {
                while (rs.next()) {
                    row = new Vector(c);
                    for (int x = 1; x <= c; x++) {
                        row.add(rs.getString(x));
                    }
                    DTM.addRow(row);
                }
            } else {
                Tools.MsgBox("Number of columns JTable ( " + pTable + " ) = " + pTable.getColumnCount() + "/n Not equal number of columns of data equal (" + DTM.getColumnCount() + ")");
            }
            con.close();

        } catch (SQLException ex) {
            Tools.MsgBox(ex.getMessage());
        }

    }

    public static void orderByData(String pSQLStatement, String pTableName, String pColumnName, String pAscOrDesc) {
        try {
            setConnection();
            Statement stat = con.createStatement();
            ResultSet rs;
            String StrQuery = "select * from " + pTableName + " order by " + pColumnName + " " + pAscOrDesc;
            rs = stat.executeQuery(StrQuery);

        } catch (SQLException ex) {
            Tools.MsgBox(ex.getMessage());
        }
    }
}
