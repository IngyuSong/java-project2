package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int difference = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(start + (n - 1) * difference);

    }
}
