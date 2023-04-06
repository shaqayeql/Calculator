package com.maktabkhoone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

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
        button.addActionListener(this);
        button.setName(buttonName);
        frame.add(button);
    }

    public void createTextBox(int textX , int textY , int textWidth , int textHeight){
        JTextField text = new JTextField();
        text.setBounds(textX , textY , textWidth , textHeight);
        frame.add(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if(button.getName() == "1"){
            System.out.println("1");
        }
        if(button.getName() == "2"){
            System.out.println("2");
        }
        if(button.getName() == "3"){
            System.out.println("3");
        }
        if(button.getName() == "4"){
            System.out.println("4");
        }
        if(button.getName() == "5"){
            System.out.println("5");
        }
        if(button.getName() == "6"){
            System.out.println("6");
        }
        if(button.getName() == "7"){
            System.out.println("7");
        }
        if(button.getName() == "8"){
            System.out.println("8");
        }
        if(button.getName() == "9"){
            System.out.println("9");
        }
        if(button.getName() == "+"){
            System.out.println("+");
        }
        if(button.getName() == "-"){
            System.out.println("-");
        }
        if(button.getName() == "*"){
            System.out.println("*");
        }
        if(button.getName() == "/"){
            System.out.println("/");
        }
        if(button.getName() == "0"){
            System.out.println("0");
        }
        if(button.getName() == "."){
            System.out.println(".");
        }
        if(button.getName() == "="){
            System.out.println("=");
        }
        if(button.getName() == "Delete"){
            System.out.println("Delete");
        }
        if(button.getName() == "Clear"){
            System.out.println("Clear");
        }

    }
}
