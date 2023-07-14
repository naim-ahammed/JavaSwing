package textFieldDemo;

import javax.swing.*;
import java.awt.*;

public class TextFieldDemo extends JFrame {

    private Container container;
    private JTextField jTextField, jTextField2;
    private Font font;


    TextFieldDemo() {
        initComponents();
    }

    public void initComponents() {
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.pink);

        font = new Font("Arial",Font.BOLD + Font.ITALIC,18);

        jTextField = new JTextField();
//        jTextField.setText("your name");
        jTextField.setBounds(50,50,200,50);
        jTextField.setFont(font);
        jTextField.setForeground(Color.yellow);
        jTextField.setBackground(Color.gray);
        jTextField.setHorizontalAlignment(JTextField.CENTER);
        container.add(jTextField);

        jTextField2 = new JTextField();
        jTextField2.setText("your name");
        jTextField2.setFont(font);
        jTextField2.setBounds(50,110,200,50);
        container.add(jTextField2);

    }

    public static void main(String[] args) {
        TextFieldDemo textFieldDemo=  new TextFieldDemo();

        textFieldDemo.setVisible(true);
        textFieldDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldDemo.setBounds(100,50,500,400);
        textFieldDemo.setTitle("JTest Field Demo");



    }
}
