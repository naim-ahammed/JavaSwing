package showInputDialog;

import javax.swing.*;

public class Test3 {
    public static void main(String[] args) {


        int choice = JOptionPane.showConfirmDialog(null,"Do you went to quite?","Title",JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION){

            JOptionPane.showMessageDialog(null," thank you responce \n your click yes");

            System.exit(0);
        }else {
            System.out.println("you have no option");
            JOptionPane.showMessageDialog(null," thank you responce");

        }
    }
}
