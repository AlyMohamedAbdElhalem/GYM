
package Entity;

import gym.Tools;
import javax.swing.JTable;


public class Clas implements MainData {
    private int classNo;
    private String subscription;
    private int dayNo ;
    private int cost; 
    private int fasilityNo;
    private String query;
    private boolean testQuery;

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public int getDayNo() {
        return dayNo;
    }

    public void setDayNo(int dayNo) {
        this.dayNo = dayNo;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFasilityNo() {
        return fasilityNo;
    }

    public void setFasilityNo(int fasilityNo) {
        this.fasilityNo = fasilityNo;
    }

    @Override
    public void test(boolean testQuery, String ifMsg) {
        if(testQuery){
        Tools.MsgBox(ifMsg);
        }
        else{
    //    Tools.MsgBox("This procedure not successful");
        }       
    }

    @Override
    public void add() {  
        
        query = "insert into clas values ( "+ classNo +
                ",'"+subscription+
                "',"+dayNo+","+cost+","+fasilityNo+")";
        testQuery = db.myDB.RunNonQuery(query);
        test(testQuery, "class has been added");
    }

    @Override
    public void update() {
        String QQuery = "update clas set name = '"+subscription+"',day = "+dayNo+
                " , cost = " +cost+
                " , f_no = "+fasilityNo+
                " where c_no = "+ classNo;
        testQuery = db.myDB.RunNonQuery(QQuery);
        test(testQuery, "class has been updated");
    }

    @Override
    public void delete() {
        query = "delete from clas where c_no = "+classNo;
        testQuery = db.myDB.RunNonQuery(query);
        test(testQuery, "class has been deleted");
    }

    @Override
    public String getAutoNumber() {
        return db.myDB.getAutoNumberOfColumn("clas", "c_no");
    }

    @Override
    public void getAllRows(JTable pTable) {
        db.myDB.FillTableData("select * from classdata", pTable);
    }

    @Override
    public void getOneRow(JTable pTable) {
        query = "select * from classdata where c_no = " + classNo;
        db.myDB.FillTableData(query, pTable);
    }

    @Override
    public void getCustomRows(String pSqlStatement, JTable pTable) {
        db.myDB.FillTableData(pSqlStatement, pTable);
    }

    @Override
    public String getValueByName(String pName) {
        query = "select c_no from clas where name = '"+pName+"'";
         db.myDB.getTableData(query);
        String Value = db.myDB.Valuee.toString();
        return Value;               
    }
        
    @Override
    public String getNameByVlaue(String pValue) {
        query = "select name from clas where c_no = "+pValue ;
         db.myDB.getTableData(query);
        String Value = db.myDB.Valuee.toString();
        return Value;
    }

     
}
