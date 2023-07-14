package textFieldDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

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
//        jTextField2.setText("your name");
        jTextField2.setBounds(50,110,200,50);
        jTextField2.setFont(font);
        container.add(jTextField2);


//        jTextField.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String getText = jTextField.getText();
//                if (getText.isEmpty()){
//                    JOptionPane.showMessageDialog(null,"You didn't enter anything");
//                }else {
//                    JOptionPane.showMessageDialog(null,"jTextField = "+getText);
//                }
//
//            }
//        });

//        jTextField2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String getText = jTextField2.getText();
//                if (getText.isEmpty()){
//                    JOptionPane.showMessageDialog(null,"You didn't enter anything");
//                }else {
//                    JOptionPane.showMessageDialog(null,"jTextField = "+getText);
//                }
//
//            }
//        });

        Handler handler = new Handler();
        jTextField.addActionListener(handler);
        jTextField2.addActionListener(handler);
    }

    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==jTextField) {
                String getText = jTextField.getText();
                if (getText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didn't enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "jTextField = " + getText);
                }}
                else {
                    String getText = jTextField2.getText();
                if (getText.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You didn't enter anything");
                }else {
                    JOptionPane.showMessageDialog(null,"jTextField2 = " + getText);
                }
                }
        }
    }



    public static void main(String[] args) {
        TextFieldDemo textFieldDemo=  new TextFieldDemo();

        textFieldDemo.setVisible(true);
        textFieldDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldDemo.setBounds(100,50,500,400);
        textFieldDemo.setTitle("JTest Field Demo");



    }
}
