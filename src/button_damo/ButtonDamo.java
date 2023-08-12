package button_damo;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.JFrame;

public class ButtonDamo extends JFrame {

    private Container container;

    private JButton button1, button2;

    ButtonDamo(){
        initComponents();
    }
    public void initComponents(){

        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.orange);

        button1 = new JButton("Clear");
        button1.setBounds(100,50,100,50);
        container.add(button1);

        button2 = new JButton("Submit");
        button2.setBounds(210,50,100,50);
        container.add(button2);
    }

    public static void main(String[] args) {

        ButtonDamo buttonDamo = new ButtonDamo();

        buttonDamo.setVisible(true);
        buttonDamo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonDamo.setBounds(100, 50, 500, 400);
        buttonDamo.setTitle("Button Damo");
    }}





