package com.hillel.lesson7;

public class EngCalculator extends SimpleCalculator {

    EngCalculator (){
        sinValue(value1);
        cosValue(value1);
        tanValue(value1);
        ctgValue(value1);
        moveDegreetoRadian(value1);
        moveRadianToDegree(value1);

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
        double result = divide(1.0,Math.tan(value1));
        return result;
    }
    public double moveDegreetoRadian(double value1){
       // 1° × π/180
        double result = multiplng(value1, divide(Math.PI,180));
        return result;
    }
    public double moveRadianToDegree(double value1){
        // 1rad × 180/π
        double result = multiplng(value1, divide(180,Math.PI));
        return result;
    }
}
