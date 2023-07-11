package showInputDialog;

import javax.swing.*;

public class Test2 {
    public static void main(String[] args) {


        // another part 2
        String Fname2 = JOptionPane.showInputDialog(null,"enter your fast name :","This is your title",JOptionPane.QUESTION_MESSAGE);

        String Fname3 = JOptionPane.showInputDialog("enter your last  name :");

        String Fname4 = Fname2 +" " +Fname3;

        JOptionPane.showMessageDialog(null, "your name is : "+Fname4);

        //fast part
        String Fname = JOptionPane.showInputDialog("enter your name :","NAIM");








    }
}
