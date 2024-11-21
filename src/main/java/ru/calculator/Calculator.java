package ru.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;

        int four = 4;
        int five = 5;
        int six = 6;

        int[] results = new int[]{
         six / two, // sixDivideTwo
         five - two, // fiveMinusTwo
         four * two, // fourMultiplyTwo
        };

        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        for(Integer result : results ){
            System.out.println(result);
        }
    }
}
