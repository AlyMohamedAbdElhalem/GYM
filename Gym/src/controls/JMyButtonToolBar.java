package controls;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class JMyButtonToolBar extends JButton {
    public JMyButtonToolBar(){
    setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.white);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    @Override
    protected void paintComponent(Graphics g){
   g.setColor(Color.DARK_GRAY);
   g.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
   super.paintComponent(g);
    }
    @Override
    protected void paintBorder(Graphics g ){
   g.setColor(Color.LIGHT_GRAY);
   g.drawRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
    
    }
    
}
