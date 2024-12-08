package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second) + divide(first, second);
    }

    public static double doAllOperations(double first, double second) {
        return sumAndMultiply(first, second) + subtractAndDivide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("sum and multiply: " + sumAndMultiply(10, 20));
        System.out.println("subtract and divide: " + subtractAndDivide(10, 20));
        System.out.println("four operations: " + doAllOperations(10, 20));
    }
}
