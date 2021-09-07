package com.bridgelabz.maximumusinggenerics;

/**
 * Hello world!
 */
public class Maximum {
    public static Float getMaximum(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num1 && num3 > num2) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Maximum Program Using Generics");
        Float num1 = 10f, num2 = 15f, num3 = 12f;
        System.out.println(getMaximum(num1, num2, num3));
    }
}
