package ru.calculate;

public class Greeting {
    public static void main(String[] args) {
        var space = ' ';
        var idea = "I like Java!";
        var year = 2024;
        System.out.println(idea);

        idea += space + "But i`am a newbie";
        idea += space;
        idea += year;
        System.out.println(idea);
    }
}
