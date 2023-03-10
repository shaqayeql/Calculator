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

    public void createButton(String buttonName , int buttonX , int buttonY , int buttonWidth , int buttonHeight){
        JButton button = new JButton(buttonName);
        button.setBounds(buttonX, buttonY , buttonWidth , buttonHeight );
        frame.add(button);
    }

    public void createTextBox(int textX , int textY , int textWidth , int textHeight){
        JTextField text = new JTextField();
        text.setBounds(textX , textY , textWidth , textHeight);
        frame.add(text);
    }
}
