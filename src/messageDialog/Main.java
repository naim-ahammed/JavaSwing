package messageDialog;

import javax.swing.*;
import javax.swing.ImageIcon;


public class Main {
    public static void main(String[] args) {

        ImageIcon imageIcon = new ImageIcon("D:/code/JavaSwing/JavaSwing/src/messageDialog/images.png");
        JOptionPane.showMessageDialog(null, "wrong password \n PLAIN_MESSAGE","warning",JOptionPane.PLAIN_MESSAGE,imageIcon);

        JOptionPane.showMessageDialog(null, "wrong password \n null");

        JOptionPane.showMessageDialog(null, "wrong password \n ERROR_MESSAGE","warning",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, "wrong password \n QUESTION_MESSAGE","warning",JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "wrong password \n WARNING_MESSAGE","warning",JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "wrong password \n INFORMATION_MESSAGE","warning",JOptionPane.INFORMATION_MESSAGE);






    }
}