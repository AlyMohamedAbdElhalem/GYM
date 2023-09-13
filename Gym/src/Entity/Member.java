package Entity;

import gym.Tools;
import javax.swing.JTable;

public class Member implements MainData {

    private int memberNo;
    private String memberName;
    private String address;
    private String gender;
    private String email;
    private String phone;
    private String whatsapp;
  //  private int classNo;
    private String query;
    boolean testQuery;

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }


    @Override
    public void test(boolean testQuery, String ifMsg) {
        if (testQuery) {
            Tools.MsgBox(ifMsg);
        } else {
      //      Tools.MsgBox("This procedure not successful");
        }
    }

    @Override
    public void add() {
        query = "insert into member values( " 
                + memberNo
                + "  , '" + memberName
                + "' , '" + address
                + "' , '"+ gender
                + "' , '" + email
                + "' , '"+ phone
                + "' , '"+ whatsapp +"');";
        testQuery = db.myDB.RunNonQuery(query);
        test(testQuery, "member Has been added");
    }

    @Override
    public void update() {
        query = "update member set   " 
                + "m_name = '" + memberName
                + "',address = '" + address
                + "',email = '" + email
                + "',phone = '" + phone
                + "',whatsapp = '" + whatsapp
                + "'  where m_no = "+memberNo;
        testQuery = db.myDB.RunNonQuery(query);
        test(testQuery, "member Has been updated");
    }

    @Override
    public void delete() {
        query = "delete from member where  m_no = " + memberNo;
        testQuery = db.myDB.RunNonQuery(query);
        if (testQuery) {
            test(testQuery, "member Has been deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        return db.myDB.getAutoNumberOfColumn("member", "m_no");
    }

    @Override
    public void getAllRows(JTable pTable) {
        db.myDB.FillTableData(" member ", pTable);
    }

    @Override
    public void getOneRow(JTable pTable) {
        query = "select * from member where m_no =" + memberNo;
        db.myDB.FillTableData(query, pTable);
    }

    @Override
    public void getCustomRows(String pSqlStatement, JTable pTable) {
        db.myDB.FillTableData(pSqlStatement, pTable);
    }

    @Override
    public String getValueByName(String pName) {
        query = "select m_no from member where m_name = '" + pName+"'";
        db.myDB.getTableData(query);
        String value = db.myDB.Valuee.toString();
        return value;
    }

    @Override
    public String getNameByVlaue(String pValue) {
        query = "select m_name from member where m_no = " + pValue;
        db.myDB.getTableData(query);
        String name = db.myDB.Valuee.toString();
        return name;
    }

}
