package CreatingUpJFrame;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame{

    private ImageIcon imageIcon;
    private Container container;


    Test(){       //test => constractor
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50,100,400,500);
        setTitle("this is the title name: javaSwing display");

        initCompononents(); //initCompononents => mathod
    }

//change logo icon
    public void initCompononents() {

//setBackground in body
        container = this.getContentPane();
        container.setBackground(Color.RED);

//set imageIcon
        imageIcon = new ImageIcon(getClass().getResource("images1.png"));
        this.setIconImage(imageIcon.getImage());

    }



    public static void main(String[] args) {
//        JFrame frame = new JFrame();
        Test frame = new Test();

        frame.setVisible(true);

//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBounds(50,100,400,500);
//        frame.setTitle("this is the title");
    }

}
