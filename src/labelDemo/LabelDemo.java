package labelDemo;

import javax.swing.*;
import java.awt.*;

public class LabelDemo extends JFrame{

    private Container container;
    private JLabel jLabel, passLable;



    LabelDemo(){
        initComponent();
    }

    public void initComponent() {
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.orange);

        jLabel =new JLabel();
        jLabel.setText("enter your user name :");
        jLabel.setBounds(50,20,150,50);

        container.add(jLabel);

        passLable =new JLabel("enter your password :");
        passLable.setBounds(50,80,150,50);
        container.add(passLable);

    }


    public static void main(String[] args) {
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);

        frame.setTitle("LabelDemo ");

    }



}
