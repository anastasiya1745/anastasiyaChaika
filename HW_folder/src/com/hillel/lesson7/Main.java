package com.hillel.lesson7;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        EngCalculator engCalculator = new EngCalculator();
        FinancialCalculator financialCalculator = new FinancialCalculator();
        double result1 =  simpleCalculator.Divide(4,1);
        double result2 = engCalculator.sinValue(engCalculator.moveDegreetoRadian(2));
        double result3 = financialCalculator.uahMoveToDoll(2400, 0.037);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);



    }
}
