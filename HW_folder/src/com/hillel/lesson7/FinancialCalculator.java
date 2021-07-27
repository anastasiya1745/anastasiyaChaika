package com.hillel.lesson7;

public class FinancialCalculator extends  SimpleCalculator {
    double k1 = 0.037;
    double k2 = 26.9913;
    double k3 = 0.032;
    double k4 = 31.74;

    FinancialCalculator() {
        Addition(value1, value2);
        Divide(value1, value2);
        Substraction(value1, value2);
        Multiplng(value1, value2);
        uahMoveToDoll(value1);
        dollMoveToUah(value1);


    }

    public double uahMoveToDoll(double value1) {

        double result = value1 * k1;

        return result;

    }

    public double dollMoveToUah(double value1) {

        double result = value1 * k2;

        return result;
    }

}