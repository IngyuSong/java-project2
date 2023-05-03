package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(lcm(lcm(sc.nextInt(), sc.nextInt()), sc.nextInt()));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
