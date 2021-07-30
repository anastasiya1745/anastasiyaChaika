package com.hillel.lesson7;

public class FinancialCalculator extends  SimpleCalculator {

    FinancialCalculator() {
        uahMoveToDoll(value1,value2);
        euroMoveToUah(value1,value2);
        dollMoveToUah(value1,value2);
        uahMoveToEuro(value1,value2);

    }

    public double uahMoveToDoll(double value1,double k1) {
        double result = multiplng(value1,k1);
        return result;

    }

    public double dollMoveToUah(double value1, double k2) {
        double result = multiplng(value1, k2);
        return result;
    }
    public double uahMoveToEuro(double value1, double k3) {
        double result = multiplng(value1,k3);
        return result;

    }

    public double euroMoveToUah(double value1, double k4) {
        double result = multiplng(value1,k4);
        return result;
    }

    @Override
    public double multiplng(double value1, double value2) {

        return super.multiplng(Math.abs(value1), value2);
    }
}