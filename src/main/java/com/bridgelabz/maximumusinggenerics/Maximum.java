package com.bridgelabz.maximumusinggenerics;

/**
 * Hello world!
 */
public class Maximum {
    public static String getMaximum(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0) {
            max = str2;
        } else if (str3.compareTo(str1) > 0 && str3.compareTo(str2) > 0) {
            max = str3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Maximum Program Using Generics");
        String str1 = "Aa", str2 = "Bb", str3 = "Cc";
        System.out.println(getMaximum(str1, str2, str3));
    }
}
