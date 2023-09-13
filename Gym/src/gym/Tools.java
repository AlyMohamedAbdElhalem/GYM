package gym;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Tools {

    public static void MsgBox(String pMsg) {
        JOptionPane.showMessageDialog(null, pMsg);
    }

    public static void NewFolder(Object pFileName, String pPath) {
        File f = new File(pPath + "/" + pFileName);
        f.mkdir();
    }

    public static void NewFolder(String pFileName) {
        File f = new File(pFileName);
        f.mkdir();
    }

    public static void ClearText(Container pConntiner) {

        for (Component com : pConntiner.getComponents()) {
            if (com instanceof JTextField) {
                JTextField txt = (JTextField) com;
                txt.setText("");
            } else if (com instanceof Container) {
                Tools.ClearText((Container) com);
            }

        }

    }

    public static void editForm(JFrame pForm) {
        try {
            pForm.setLocationRelativeTo(null);
            pForm.setDefaultCloseOperation(2);
            Image Vimg = ImageIO.read(Tools.class.getResource("photo.jpg"));
            pForm.setIconImage(Vimg);
            //    pForm.setSize(1500  , 800);
            pForm.setBackground(Color.RED);
            //       pForm.setLayout(null);
            pForm.setVisible(true);
        } catch (Exception ex) {
            Tools.MsgBox("Error In Image Icon.");
        }

    }

    public static void BackGround(JFrame pForm) {

        try {
            pForm.setSize(450, 300);
            pForm.setLocationRelativeTo(null);
            pForm.setDefaultCloseOperation(2);
            Image Vimg = ImageIO.read(Tools.class.getResource("photo.jpg"));
            pForm.setIconImage(Vimg);
            pForm.setLayout(null);
            JButton jb = new JButton();
            jb.setBounds(175, 200, 100, 30);
            pForm.add(jb);
            JLabel jl = new JLabel(new ImageIcon("F:\\logo2.jpg"));
            jb.setBounds(0, 0, 450, 300);
            pForm.add(jl);
            pForm.setBackground(Color.RED);
            pForm.setVisible(true);
        } catch (Exception ex) {
            Tools.MsgBox("Error In Image Icon.");
        }
    }

    public static void CreateEmptyFile(String pFileName) {
        try {
            File f = new File(pFileName);
            f.createNewFile();
        } catch (IOException ex) {
            MsgBox(ex.getMessage());
        }
    }

    public static void CreateEmptyFiles(String[] pFileNames) {
        for (String name : pFileNames) {
            CreateEmptyFile(name);
        }
    }

    public static void CreateFile(String pFileName, Object pValues[]) {
        try {
            PrintWriter w = new PrintWriter(pFileName);
            for (Object obj : pValues) {
                w.println(obj);
            }
            w.close();
        } catch (FileNotFoundException ex) {
            Tools.MsgBox("Error in Print Writer");
        }
    }

    public static void CreateFiles(String pFileNames[], Object allData[][]) {
        for (int s = 0; s < pFileNames.length; s++) {
            CreateFile(pFileNames[s], allData[s]);
        }
    }

    public static Object InputBox(String pTitle) {
        Object inputValue = JOptionPane.showInputDialog(pTitle);
        return inputValue;
    }

    public static boolean ConfirmInputBox(String msg) {
        int msgC = JOptionPane.showConfirmDialog(null, msg);
        if (msgC == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    public static String GetNumbers(String text) {
        String textInt = "";
        for (char c : text.toCharArray()) {
            if (c == '0' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '1') {
                textInt += c;
            }
        }
        return textInt;
    }

    public static String RemoveNumbers(String pText) {
        String result = "";
        for (char c : pText.toCharArray()) {
            if (!(c == '0' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '1')) {
                result += c;
            }
        }
        return result;
    }

    public static void PrintScreenWithInput(JFrame pForm) {
        try {

            Object v = Tools.InputBox("Enter Your Image Name");
            pForm.setState(1);
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            Robot r = new Robot();
            BufferedImage img = r.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(v + ".jpg"));
            pForm.setState(0);

        } catch (Exception ex) {
            MsgBox("Error in PrintScreen");
        }

    }

    public static void PrintScreen(String pFileName, JFrame pForm) {
        try {
            pForm.setState(1);
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            Robot r = new Robot();
            BufferedImage img = r.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(pFileName + ".jpg"));
            pForm.setState(0);

        } catch (Exception ex) {
            MsgBox("Error in PrintScreen");
        }

    }

    public static class StringTools {

        private static String inverseText;

        public static void PrintCharByChar(String pText) {
            for (char c : pText.toCharArray()) {
                System.out.println(c);
            }
        }

        public static void PrintCharByCharInverse(String pText) {
            StringBuilder sb = new StringBuilder(pText);
            inverseText = sb.reverse().toString();
            for (char c : inverseText.toCharArray()) {
                System.out.println(c);
            }
        }
    }

    public static class MergeArray {

        public Object[] arry1;
        public Object[] arry2;

        public MergeArray(Object[] arry1, Object[] arry2) {
            this.arry1 = arry1;
            this.arry2 = arry2;
        }

        public Object[] MergeTowArray() {
            int lengthArray1 = arry1.length;
            int lengthArray2 = arry2.length;
            Object[] arryResult = new Object[lengthArray2 + lengthArray2];
            System.arraycopy(arry1, 0, arryResult, 0, lengthArray1);
            System.arraycopy(arry2, 0, arryResult, lengthArray1, lengthArray2);

            return arryResult;
        }

    }

    public static class Table {

        private static Object[][] Items;
        private static int Columns;

        public Table(int Columns) {
            this.Columns = Columns;
            this.Items = new Object[0][Columns];
        }

        public static void addNewRow(Object pRow[]) {
            Object TempItems[][] = Table.Items;
            Table.Items = new Object[Items.length + 1][Table.Columns];
            for (int x = 0; x < TempItems.length; x++) {
                Table.Items[x] = TempItems[x];
            }
            Table.Items[Table.Items.length - 1] = pRow;
        }

        public static void PrintItems() {

            for (Object objs[] : Table.Items) {
                System.out.print("(");
                for (Object obj : objs) {
                    System.out.println(obj + " ,");
                }
                System.out.println(")");
            }
        }

        public static void editRow(int pRowIndex, int pColumnsIndex, Object pNewROw) {
            Table.Items[pRowIndex][pColumnsIndex] = pNewROw;
        }

        public static void deleteRow(int pRowIndex) {
            Object TempItems[][] = Table.Items;
            Table.Items = new Object[Items.length - 1][Table.Columns];
            int y = 0;
            for (int x = 0; x < TempItems.length; x++) {

                if (x != pRowIndex) {
                    Table.Items[y] = TempItems[x];
                    y++;
                }
            }
        }

        public static Object getValueTable(int pRowIndex, int pColumnsIndex) {
            return Table.Items[pRowIndex][pColumnsIndex];
        }

        public static Object[] getValuesTable(int pRowIndex) {
            return Table.Items[pRowIndex];
        }

    }

    public static void SetJTableReports(JTable JTableName) {
        JTableName.getTableHeader().setBackground(new Color(20, 20, 160));
        JTableName.getTableHeader().setForeground(Color.WHITE);
    }

    public static void PrintReports(JTable JTableName, String NameOfReport) {
        try {
            MessageFormat header = new MessageFormat(NameOfReport + " Report");
            MessageFormat footer = new MessageFormat("page - {0}");
            JTableName.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception ex) {
            Tools.MsgBox(ex.getMessage());
        }
    }

    public static void DrawImage(JFrame form, String Path) {
        JPanel pl = new JPanel() {

            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                File imgFile = new File(Path);

                try {
                    Image img = ImageIO.read(imgFile);
                    g2.drawImage(img, form.getWidth(), form.getHeight(), form);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
        form.add(pl);
        pl.setBounds(0, 0, form.getWidth(), form.getHeight());

    }

}
