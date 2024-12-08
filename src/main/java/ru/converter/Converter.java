package ru.converter;

public class Converter {

    public static float convert(float amount, float exchangeValue) {
        return amount / exchangeValue;
    }

    public static void main(String[] args) {
        float in = 140f;
        float expected = 1.4f;
        float out = Converter.convert(in, 100);
        boolean passed = expected == out;
        System.out.println("140 rubles are 1.4. Test result : " + passed);
    }
}