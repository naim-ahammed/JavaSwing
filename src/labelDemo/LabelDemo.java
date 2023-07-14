package labelDemo;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class LabelDemo extends JFrame{

    private Container container;
    private JLabel jLabel, passLable, imgLable;
    private ImageIcon imageIcon;

    private Font font;



    LabelDemo(){
        initComponent();
    }

    public void initComponent() {
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.orange);

        imageIcon = new ImageIcon(getClass().getResource("naim_web3.png"));

                //ImageIcon(getClass().getResource("naim_web3"));
        imgLable = new JLabel(imageIcon);
        imgLable.setBounds(50,20,imageIcon.getIconWidth(),imageIcon.getIconHeight());
        container.add(imgLable);

        font = new Font("Arial",Font.BOLD,14);


        jLabel = new JLabel();
        jLabel.setText("Enter your user name :");
        jLabel.setBounds(50,20,200,50);
        jLabel.setFont(font);//font class
        jLabel.setForeground(Color.RED);
        jLabel.setOpaque(true);
        jLabel.setBackground(Color.YELLOW);
        jLabel.setToolTipText("Tool Tip Text \n Enter your user name :");
        container.add(jLabel);

//        System.out.println(" "+jLabel.getText());
        String s = jLabel.getToolTipText();
        System.out.println(" "+s);


        passLable = new JLabel("Enter your password :");
        passLable.setBounds(50,80,200,50);
        passLable.setFont(font);//font lable
        passLable.setForeground(Color.BLUE);
        passLable.setOpaque(true);//setBackground to must be use setOpaque
        passLable.setBackground(Color.YELLOW);
        container.add(passLable);

    }


    public static void main(String[] args) {
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,800);

        frame.setTitle("LabelDemo ");

    }
}
