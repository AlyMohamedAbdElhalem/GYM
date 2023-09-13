
package Entity;

import gym.Tools;
import java.util.Date;
import javax.swing.JTable;


public class Account implements MainData {
    
    private int accountNo;
    private String accountDate;
    private int amount;
    private String amount_status;
    private int paiding_amount;
    private int pending_amount;
    private int disccount ;
    private String rison;
    
    private int ms_id;
    private String query;
    private boolean TestQery;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String AmountDate) {
        this.accountDate = AmountDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAmount_status() {
        return amount_status;
    }

    public void setAmount_status(String amount_status) {
        this.amount_status = amount_status;
    }

    public int getPaiding_amount() {
        return paiding_amount;
    }

    public void setPaiding_amount(int paiding_amount) {
        this.paiding_amount = paiding_amount;
    }

    public int getPending_amount() {
        return pending_amount;
    }

    public void setPending_amount(int pending_amount) {
        this.pending_amount = pending_amount;
    }

    public int getDisccount() {
        return disccount;
    }

    public void setDisccount(int disccount) {
        this.disccount = disccount;
    }

    public String getRison() {
        return rison;
    }

    public void setRison(String rison) {
        this.rison = rison;
    }

    public int getMs_id() {
        return ms_id;
    }

    public void setMs_id(int ms_id) {
        this.ms_id = ms_id;
    }

    @Override
    public void test(boolean testQuery, String ifMsg) {
        if(testQuery){
        Tools.MsgBox(ifMsg);
        }
        else{}
    }

    @Override
    public void add() {
        query= "insert into account values( "+accountNo+",'"+
                accountDate+"',"+
                amount+",'"+
                amount_status+"',"+
                paiding_amount+", "+
                pending_amount+","+
                disccount+",'"+
                rison+"',"+
                ms_id+")";
        TestQery = db.myDB.RunNonQuery(query);
        test(TestQery, "procedure has been completed");
    }

    @Override
    public void update() {
        query="UPDATE `account` SET `a_date` = '"+accountDate+
                "', `amount` = '"+amount+
                "', `paiding_amount` = '"+paiding_amount+
                "', `pending_amount` = '"+pending_amount+
		"',`discount` = '"+disccount+
                "', `rison` = '"+rison+
                "', `ms_id` = '"+ms_id+
                "',`amount_status` = '"+amount_status+
                "' WHERE `account`.`a_no` = "+accountNo;
		
        TestQery = db.myDB.RunNonQuery(query);
        test(TestQery, "Procedure updating has been completed");
        
    }

    @Override
    public void delete() {
    query = "delete from account where a_no = "+accountNo;
    TestQery = db.myDB.RunNonQuery(query);
        test(TestQery, "procedure deleting has been completed");
        
        String querySafe = "insert into account_safe values( "+accountNo+",'"+
                accountDate+"',"+
                amount+",'"+
                amount_status+"',"+
                paiding_amount+", "+
                paiding_amount+","+
                disccount+",'"+
                rison+"',"+
                ms_id+")";
        TestQery = db.myDB.RunNonQuery(querySafe);
    }

    @Override
    public String getAutoNumber() {
        return db.myDB.getAutoNumberOfColumn("account", "a_no");
    }

    @Override
    public void getAllRows(JTable pTable) {
        db.myDB.FillTableData("accountdata", pTable);

    }

    @Override
    public void getOneRow(JTable pTable) {
        query = "select * from accountdata where a_no = "+ accountNo;
        db.myDB.FillTableData(query, pTable);
    }

    @Override
    public void getCustomRows(String pSqlStatement, JTable pTable) {
        db.myDB.FillTableData(pSqlStatement, pTable);
    }

    @Override
    public String getValueByName(String pName) {
        return "this Method not used here"; 
    }

    @Override
    public String getNameByVlaue(String pValue) {
        return "this Method not used here";
    }
    

    
}
