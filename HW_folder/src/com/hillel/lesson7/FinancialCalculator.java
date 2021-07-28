package com.hillel.lesson7;

public class FinancialCalculator extends  SimpleCalculator {
    //double k1 = 0.037;
    //double k2 = 26.9913;
    //double k3 = 0.032;
    //double k4 = 31.74;

    FinancialCalculator() {
        uahMoveToDoll(value1,value2);
        euroMoveToUah(value1,value2);
        dollMoveToUah(value1,value2);
        uahMoveToEuro(value1,value2);


    }

    public double uahMoveToDoll(double value1,double k1) {

        double result = Multiplng(value1,k1);

        return result;

    }

    public double dollMoveToUah(double value1, double k2) {

        double result = Multiplng(value1, k2);

        return result;
    }
    public double uahMoveToEuro(double value1, double k3) {

        double result = Multiplng(value1,k3);

        return result;

    }

    public double euroMoveToUah(double value1, double k4) {

        double result = Multiplng(value1,k4);

        return result;
    }

    @Override
    public double Multiplng(double value1, double value2) {
        return super.Multiplng(Math.abs(value1), value2);
    }
}