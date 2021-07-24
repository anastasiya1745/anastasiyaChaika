package com.hillel.lesson7;


    public class SimpleCalculator {
        double value1;
        double value2;
        SimpleCalculator() {
            Addition(value1,value2);
            Substraction(value1,value2);
            Multiplng(value1, value2);
            Divide(value1,value2);

        }
        public double Addition(double value1, double value2){
            double result = value1+value2;

            return result;
        }
        public  double Substraction(double value1, double value2) {
            double result = value1-value2;
            return result;
        }
        public  double Divide(double value1,double value2){
            double result = value1/value2;
            return result;
        }
        public  double Multiplng(double value1, double value2) {
            double result = (value1)*(value2);
            return result;
        }

    }
