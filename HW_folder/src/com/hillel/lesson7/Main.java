package com.hillel.lesson7;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        EngCalculator engCalculator = new EngCalculator();
       double result1 =  simpleCalculator.Divide(4,1);
       double result2 = engCalculator.sinValue(26);
        System.out.println(result1);
        System.out.println(result2);



    }
}
