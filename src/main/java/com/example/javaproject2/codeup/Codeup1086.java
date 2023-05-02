package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float w = sc.nextFloat();
        float h = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.printf("%.2f MB", (w * h * b) / 8 / 1024 / 1024 );
    }
}
