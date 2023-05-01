package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ival1 = sc.nextInt();
        int ival2 = sc.nextInt();
        for(int i = 1; i <= ival1; i++){
            for(int j = 1; j <= ival2; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
