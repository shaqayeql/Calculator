package com.maktabkhoone;

import javax.swing.*;
import java.awt.*;

public class Calculator {

    JFrame frame;

    public void setupFrame(){
        frame = new JFrame("Calculator");
        frame.setSize(450,450);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }

    public void creatButton(String buttonName , int buttonX , int buttonY){
        JButton button = new JButton(buttonName);
        button.setBounds(buttonX, buttonY , 70 , 70 );
        frame.add(button);
    }
}
