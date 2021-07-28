package com.hillel.lesson7;

public class EngCalculator extends SimpleCalculator {
    double value1;
    double value2;
    EngCalculator (){
        sinValue(value1);
        cosValue(value1);
        tanValue(value1);
        ctgValue(value1);

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
        double result = Divide(1.0,Math.tan(value1));
        return result;
    }
}
