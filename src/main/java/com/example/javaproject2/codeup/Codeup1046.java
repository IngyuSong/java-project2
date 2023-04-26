package com.example.javaproject2.codeup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num1 = sc.nextLong();
        Long num2 = sc.nextLong();
        Long num3 = sc.nextLong();
        Long sum = num1 + num2 + num3;
        Double avg = (double) sum / 3;
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(sum);
        System.out.println(Double.parseDouble(df.format(avg)));
    }
}
