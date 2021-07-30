package com.hillel.lesson7;


import static jdk.nashorn.internal.objects.Global.Infinity;

public class SimpleCalculator {
        double value1;
        double value2;

        SimpleCalculator() {
            addition(value1,value2);
            substraction(value1,value2);
            multiplng(value1, value2);
            divide(value1,value2);

        }
        public double addition(double value1, double value2){
            double result = value1+value2;

            return result;
        }
        public  double substraction(double value1, double value2) {
            double result = value1-value2;
            return result;
        }
        public double divide(double value1, double value2) {

                if(value1/value2==Infinity) {
                    return 0;
            }
                else {
                    double result = value1 / value2;
                   return result;
                }
            }

        public  double multiplng(double value1, double value2) {
            double result = (value1)*(value2);
            return result;
        }
    }