package com.example.javaproject2.week4.day3;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static String getRepeatedSymbol2(String symbol, int n) {
        String symbols = "";
        for (int i = 0; i < n; i++) {
            symbols += symbol;
        }
        return symbols;
    }

    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if (i <= pivot) {
                System.out.printf("%s%s\n", getRepeatedSymbol2(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                System.out.printf("%s%s\n", getRepeatedSymbol2(" ", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    }
}
