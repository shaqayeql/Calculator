package com.maktabkhoone;

public class Main {

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        calc.setupFrame();

        calc.createButton("1" , 50 , 50 , 70 , 70);
        calc.createButton("2" , 130 , 50 , 70 , 70);
        calc.createButton("3" , 210 , 50 , 70 , 70);
        calc.createButton("+" , 290 , 50 , 70 , 70);
        calc.createButton("4" , 50 , 130 , 70 , 70);
        calc.createButton("5" , 130 , 130 , 70 , 70);
        calc.createButton("6" , 210 , 130 , 70 , 70);
        calc.createButton("*" , 290 , 130 , 70 , 70);
        calc.createButton("7" , 50 , 210 , 70 , 70);
        calc.createButton("8" , 130 , 210 , 70 , 70);
        calc.createButton("9" , 210 , 210 , 70 , 70);
        calc.createButton("/" , 290 , 210 , 70 , 70);
        calc.createButton("." , 50 , 290 , 70 , 70);
        calc.createButton("0" , 130 , 290 , 70 , 70);
        calc.createButton("=" , 210 , 290 , 70 , 70);
        calc.createButton("-" , 290 , 290 , 70 , 70);
        calc.createButton("Delete" , 50 , 370 , 140 , 35);
        calc.createButton("Clear" , 220 , 370 , 140 , 35);

        calc.createTextBox(50 , 10 , 310 , 30);
    }
}
