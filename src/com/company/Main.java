package com.company;

public class Main {

    public static void main(String[] args) {
        double[] number = new double[]{1.2, 5.18, 6.77, -7.11, -0.9, 27.1, 18.8, -9.1, 15.7, 9.19, 16.5, 6.2, -8.3, 7.15, 2.2};
        boolean isTrue = false;
        double sum = 0;
        int lenght = 0;
        double result = 0;

        for (double i : number) {

            {
                if (i < 0) {
                    isTrue = true;


                }
                if (isTrue) {
                    sum += i;
                    lenght++;
                }

            }

        }
        result = sum / lenght;
        System.out.println("Среднее арифметическое число" + result);
    }
}
