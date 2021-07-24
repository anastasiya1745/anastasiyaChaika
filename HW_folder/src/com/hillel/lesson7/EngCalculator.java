package com.hillel.lesson7;

public class EngCalculator extends SimpleCalculator {
    double value1;
    double value2;
    EngCalculator (){
        Divide(value1,value2);
        Addition(value1,value2);
        Substraction(value1,value2);
        Multiplng(value1,value2);



    }
    public double sinValue(double value1){
        double result = Math.sin(value1);
        return result;
    }
    public double cosValue(double value1){
        double result = Math.cos(value1);
        return result;
    }
    public double tanValue(double value1){
        double result = Math.tan(value1);
        return result;
    }
    public double ctgValue(double value1){
        double result = 1.0/Math.tan(value1);
        return result;
    }
}
