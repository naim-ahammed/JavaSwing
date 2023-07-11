package showInputDialog;

import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name :");
        JOptionPane.showMessageDialog(null,name + " \nwelcome to swing");
    }
}
