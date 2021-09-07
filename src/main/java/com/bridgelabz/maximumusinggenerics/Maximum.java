package com.bridgelabz.maximumusinggenerics;

/**
 * Hello world!
 */
public class Maximum {
    public static Integer getMaximum(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num1 && num3 > num2) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Maximum Program Using Generics");
        Integer num1 = 10, num2 = 15, num3 = 12;
        System.out.println(getMaximum(10,12,15));
    }
}
