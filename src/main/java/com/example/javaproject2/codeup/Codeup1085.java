package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float s = sc.nextFloat();
        System.out.printf("%.1f MB",(h*b*s*c)/8/1024/1024);
    }
}
