package ru.calculator;

public class MathFunc {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        var result1 = MathFunc.func1(3);
        var result2 = MathFunc.func2(5);
        var result3 = MathFunc.func1(100);
        var total = result1 + result2;
        System.out.println("total = " + total);
        System.out.println("result3 = " + result3);
    }
}
