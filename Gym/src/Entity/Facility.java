
package Entity;

import gym.Tools;
import javax.swing.JTable;


public class Facility implements MainData{
    private int fasilityNo;
    private String type;
    private String discription;
    private String query;
    private boolean testQuery;
    
    @Override
    public void test (boolean testQuery ,String ifMsg){
    if(testQuery){
    Tools.MsgBox(ifMsg);
    }
    else{
   // Tools.MsgBox("This procedure not successful");
    }
    }

    public int getFasilityNo() {
        return fasilityNo;
    }

    public void setFasilityNo(int fasilityNo) {
        this.fasilityNo = fasilityNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public void add() {
        query = "insert into facility values ( "+ fasilityNo+
                ",'"+type+"','"+discription+"')" ;
        testQuery = db.myDB.RunNonQuery(query);
        this.test(testQuery, "Facility has been added");

    }

    @Override
    public void update() {
        query = "update facility set  f_type = '"+type+
                "', f_discription = '"+discription+
                "' where f_no = "+fasilityNo;
        testQuery = db.myDB.RunNonQuery(query);
        this.test(testQuery, "Facility has been updated");

    }

    @Override
    public void delete() {
        query = "delete from facility where f_no = "+fasilityNo;
        testQuery = db.myDB.RunNonQuery(query);
        this.test(testQuery, "Facility has been deleted");

    }

    @Override
    public String getAutoNumber() {
        return db.myDB.getAutoNumberOfColumn("facility", "f_no");
   }

    @Override
    public void getAllRows(JTable pTable) {
        db.myDB.FillTableData("facility", pTable);
    }

    @Override
    public void getOneRow(JTable pTable) {
        query = "select * from facility where f_no ="+fasilityNo;
        db.myDB.FillTableData(query, pTable);
    }

    @Override
    public void getCustomRows(String pSqlStatement, JTable pTable) {
        db.myDB.FillTableData(pSqlStatement, pTable);
    }

    @Override
    public String getValueByName(String pName) {
        query = "select f_no from facility where f_type = '"+pName+"'";
        String valuse = db.myDB.getTableData(query).toString();
        String value = db.myDB.Valuee.toString();
        return value;
    }

    @Override
    public String getNameByVlaue(String pValue) {
        query = "select f_type from facility where f_no = "+pValue;
        db.myDB.getTableData(query);
        String name = db.myDB.Valuee.toString();
        return name;
    }
    
    
}
