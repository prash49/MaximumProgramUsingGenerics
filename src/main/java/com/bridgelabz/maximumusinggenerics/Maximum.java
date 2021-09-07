package com.bridgelabz.maximumusinggenerics;

/**
 * Hello world!
 */
public class Maximum<E extends Comparable> {
    E value1, value2, value3;

    public Maximum(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public E getMaximum() {
        E maximum = getMaximum(value1, value2, value3);
        return maximum;
    }

    public static <E extends Comparable> E getMaximum(E value1, E value2, E value3) {
        E max = value1;
        if (value2.compareTo(value3) > 0 && value2.compareTo(value3) > 0) {
            max = value2;
        } else if (value3.compareTo(max) > 0) {
            max = value3;
        }
        toPrint(value1, value2, value3, max);
        return max;
    }
    private static  <E> void toPrint(E value1, E value2, E value3, E max){
        System.out.println("Max of "+value1+" ,"+value2+" ,"+value3+" is : "+max);
    }

    public static void main(String[] args) {
        Maximum.getMaximum(12,13,15);
        Maximum.getMaximum("String","string","STRING");
        Maximum.getMaximum(12.2,14.5,00.2);
    }
}