package frameDemo;

import javax.swing.*;

public class FrameDemo extends JFrame{
    public static void main(String[] args) {

      //  JFrame frame = new JFrame();
        FrameDemo frame = new FrameDemo();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        frame.setSize(400,300);

//       frame.setLocationRelativeTo(null);
//        frame.setLocation(200,200);


        frame.setBounds(200,300,400,300);


        frame.setTitle("title");

        frame.setResizable(false);
    }
}
