package ru.converter;

public class Converter {

    public static float convert(float amount, float exchangeValue) {
        return amount / exchangeValue;
    }

    public static void main(String[] args) {
        float rubToEuro = Converter.convert(140, 100);
        float rubToDollar = Converter.convert(140, 90);

        System.out.println("140 rubles are " + rubToEuro + " euro.");
        System.out.println("140 rubles are " + rubToDollar + " dollar.");
    }
}
