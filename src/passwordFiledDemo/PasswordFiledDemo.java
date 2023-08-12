package passwordFiledDemo;

import textFieldDemo.TextFieldDemo;

import javax.swing.*;
import javax.swing.JPasswordField;
import java.awt.*;

public class PasswordFiledDemo extends JFrame {

    private Container c;
    private JPasswordField pf;

    private Font f;

    PasswordFiledDemo(){
        initComponents();
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        f = new Font("Arial",Font.BOLD,29);

        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setForeground(Color.blue);
        pf.setBackground(Color.gray);
        pf.setFont(f);
        pf.setBounds(50,20,150,50);
        c.add(pf);
    }

    public static void main(String[] args) {
        PasswordFiledDemo textFieldDemo = new PasswordFiledDemo();

        textFieldDemo.setVisible(true);
        textFieldDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldDemo.setBounds(100, 50, 500, 400);
        textFieldDemo.setTitle("Password Filed Demo");
    }

}