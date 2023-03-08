package com.maktabkhoone;

public class Main {

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        calc.setupFrame();

        calc.creatButton("1" , 50 , 50);
        calc.creatButton("2" , 130 , 50);
        calc.creatButton("3" , 210 , 50);
        calc.creatButton("+" , 290 , 50);
        calc.creatButton("4" , 50 , 130);
        calc.creatButton("5" , 130 , 130);
        calc.creatButton("6" , 210 , 130);
        calc.creatButton("-" , 290 , 130);
        calc.creatButton("7" , 50 , 210);
        calc.creatButton("8" , 130 , 210);
        calc.creatButton("9" , 210 , 210);
        calc.creatButton("*" , 290 , 210);
    }
}
