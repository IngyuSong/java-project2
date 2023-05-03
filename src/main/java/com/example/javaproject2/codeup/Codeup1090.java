package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int ratio = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((long) (start * Math.pow(ratio, n - 1)));

    }
}
