package com.maktabkhoone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField text;
    String operator = "";
    double input1;
    double input2;

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
        text = new JTextField();
        text.setBounds(textX , textY , textWidth , textHeight);
        frame.add(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if(button.getName() == "1"){
            text.setText(text.getText().concat("1"));
        }
        if(button.getName() == "2"){
            text.setText(text.getText().concat("2"));
        }
        if(button.getName() == "3"){
            text.setText(text.getText().concat("3"));
        }
        if(button.getName() == "4"){
            text.setText(text.getText().concat("4"));
        }
        if(button.getName() == "5"){
            text.setText(text.getText().concat("5"));
        }
        if(button.getName() == "6"){
            text.setText(text.getText().concat("6"));
        }
        if(button.getName() == "7"){
            text.setText(text.getText().concat("7"));
        }
        if(button.getName() == "8"){
            text.setText(text.getText().concat("8"));
        }
        if(button.getName() == "9"){
            text.setText(text.getText().concat("9"));
        }
        if(button.getName() == "+"){
            input1 = Double.parseDouble(text.getText());
            operator = "+";
            text.setText("");
        }
        if(button.getName() == "-"){
            input1 = Double.parseDouble(text.getText());
            operator = "-";
            text.setText("");
        }
        if(button.getName() == "*"){
            input1 = Double.parseDouble(text.getText());
            operator = "*";
            text.setText("");
        }
        if(button.getName() == "/"){
            input1 = Double.parseDouble(text.getText());
            operator = "/";
            text.setText("");
        }
        if(button.getName() == "0"){
            text.setText(text.getText().concat("0"));
        }
        if(button.getName() == "."){
            text.setText(text.getText().concat("."));
        }
        if(button.getName() == "="){
            input2 = Double.parseDouble(text.getText());
            double result = 0;
            if (operator == "+"){
                result = input1 + input2;
                text.setText(result + "");
            }
            if (operator == "-"){
                result = input1 - input2;
                text.setText(result + "");
            }
            if (operator == "/"){
                result = input1 / input2;
                text.setText(result + "");
            }
            if (operator == "*"){
                result = input1 * input2;
                text.setText(result + "");
            }
        }
        if(button.getName() == "Delete"){
            String content = text.getText();
            text.setText("");
            for (int i = 0; i < content.length() - 1; i++) {
                text.setText(text.getText()+content.charAt(i));
            }

        }
        if(button.getName() == "Clear"){
            text.setText("");
            operator = "";
        }

    }
}
