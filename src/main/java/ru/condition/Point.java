package ru.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double distance = distance(0, 0, 2, 0);
        double distance2 = distance(1, 5, 4, 7);
        double distance3 = distance(2, 3, 6, 1);

        System.out.println("Vector2 (0, 0) to (2, 0) " + distance);
        System.out.println("Vector2 (1, 5) to (4, 7) " + distance2);
        System.out.println("Vector2 (2, 3) to (6, 1) " + distance3);
    }
}
