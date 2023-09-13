package Entity;

import gym.Tools;
import javax.swing.JTable;

public class Membership implements MainData {

    private int msID;
    private String startDate;
    private String endDate;
    private String status ; 
    private int memberNo;
    private int classNo;
    
    private String query;
    private boolean testQuery;

    public int getMsID() {
        return msID;
    }

    public void setMsID(int msID) {
        this.msID = msID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    @Override
    public void test(boolean testQuery, String ifMsg) {
        if (testQuery) {
            Tools.MsgBox(ifMsg);
        } else {
            //Tools.MsgBox("yooooh");
        }
    }

    @Override
    public void add() {
        query = "insert into membership  values(" + msID
                + ",'" + startDate
                + "','" + endDate
                + "','" + status
                + "'," + memberNo
                + "," + classNo + ")";
        testQuery = db.myDB.RunNonQuery(query);
        test(testQuery, "Enter the accounting data and Click On Done");
    }

    @Override
    public void update() {
        query = "update membership set start_date =  '" + startDate
                + "',end_date = '" + endDate
                + "',status = '" + status
                + "',m_no = " + memberNo
                + ",c_no = " + classNo
                + " where ms_id = " + msID;
        testQuery = db.myDB.RunNonQuery(query);
        test(testQuery, "Data has been updated");
    }

    @Override
    public void delete() {
        query = "delete from membership where ms_id = " + msID;
        testQuery = db.myDB.RunNonQuery(query);
        try {
            test(testQuery, "Membership has been delete");
        } catch (Exception ex) {
            Tools.MsgBox(ex.getMessage());
        }
    }

    @Override
    public String getAutoNumber() {
        return db.myDB.getAutoNumberOfColumn("membership", "ms_id");
    }

    @Override
    public void getAllRows(JTable pTable) {
       db.myDB.FillTableData("membershipdata", pTable);
      
    }
        public void getAllRowsReport(JTable pTable) {
       db.myDB.FillTableData("membershipreport", pTable);
      
    }

    @Override
    public void getOneRow(JTable pTable) {
        query = "select * from membershipdata where ms_id = "+msID;
        
            db.myDB.FillTableData(query, pTable);
    }

    @Override
    public void getCustomRows(String pSqlStatement, JTable pTable) {
        db.myDB.FillTableData(pSqlStatement, pTable);
    }

    @Override
    public String getValueByName(String pName) {
        query = "select c_no from clas where name  = "+pName ;
         db.myDB.getTableData(query);
        String Value = db.myDB.Valuee.toString();
        return Value;    }

    @Override
    public String getNameByVlaue(String pValue) {
        query = "select name from clas where c_no = "+pValue ;
         db.myDB.getTableData(query);
        String Value = db.myDB.Valuee.toString();
        return Value;    }

    public String getCostByValue(String pValue) {
        String cost = "select cost from clas where c_no = " + pValue;
        db.myDB.getTableData(cost);
        String x = db.myDB.Valuee.toString();
        return x;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
