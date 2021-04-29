package com.company;

public class Main {

    static int a = 4;
    static int b = 5;
    static int cForEx6 = 5;

    public static void main(String[] args) {
        variable();
        System.out.println("a * (b + (c / d) = " + calc(3, 5, 2, 6));
        System.out.println("Сумма чисел " + a + " + " + b + " лежит в диапозоне от 10 до 20: " + isIncluded(a, b));
        isPositiveEx5(10);
        System.out.println("Число " + cForEx6 + " положительное? " + isPositiveEx6(cForEx6));
        showName("Putin");
        leapYear(2020);
    }

    private static void variable() {
        byte a1 = 127;
        short a2 = 4;
        int a3 = 500;
        long a4 = 1000;
        float a5 = 15f;
        double a6 = 16d;
        boolean a7 = true;
        char a8 = 'a';
        // String a9 = "Ссылочная h";
        System.out.println("Типы примитивных данных:\n byte а = " + a1 + "\n short a2 = " + a2 +
                "\n int a3 = " + a3 + "\n long a4 = " + a4 + "\n float a5 = " + a5 +
                "\n double a6 = " + a6 + "\n boolean a7 = " + a7 + "\n char a8 = " + a8 + "\n");
    }

    private static float calc(float a, float b, float c, float d) {
        float calc = a * (b + (c / d));
        return calc;
    }

    private static boolean isIncluded(int a, int b) {
        boolean c = (a + b) >= 10 && (a + b) <= 20;
        return c;
    }

    private static void isPositiveEx5(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else System.out.println("Число " + a + " отрицательное");
    }

    private static boolean isPositiveEx6(int a) {
        boolean c = a >= 0;
        return c;
    }

    private static void showName(String name) {
        System.out.println("Привет, " + name);
    }

    private static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный");
        } else System.out.println(year + " не високосный");
    }
}