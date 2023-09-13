
package Entity;

import javax.swing.JTable;


public interface MainData {
    public void test (boolean testQuery ,String ifMsg);
    public void add();
    public void update();
    public void delete();
    public String getAutoNumber();
    public void getAllRows(JTable pTable);
    public void getOneRow(JTable pTable);
    public void getCustomRows(String pSqlStatement, JTable pTable);
    public String getValueByName(String pName);
    public String getNameByVlaue(String pValue);  
        
}
