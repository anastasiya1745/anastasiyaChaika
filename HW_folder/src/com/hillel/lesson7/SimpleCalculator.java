package com.hillel.lesson7;


    public class SimpleCalculator {

        SimpleCalculator(double value1, double value2) {
            Plus(value1,value2);
            Minus(value1,value2);
            multiple(value1, value2);
            Divide(value1,value2);

        }
        public double Plus(double value1, double value2){
            double result = value1+value2;

            return result;
        }
        public  double Minus(double value1, double value2) {
            double result = value1-value2;
            return result;
        }
        public  double Divide(double value1,double value2){
            double result = value1/value2;
            return result;
        }
        public  double multiple(double value1, double value2) {
            double result = (value1)*(value2);
            return result;
        }

    }
