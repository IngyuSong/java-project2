package com.example.javaproject2.codeup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num1 = sc.nextLong();
        Long num2 = sc.nextLong();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format((double) num1 / num2));
    }
}
