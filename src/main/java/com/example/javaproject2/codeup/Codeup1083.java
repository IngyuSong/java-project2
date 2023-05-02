package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iDec = sc.nextInt();
        for(int i = 1; i <= iDec; i++){
            switch (i % 3){
                case 0:
                    System.out.print("X");
                    break;
                default:
                    System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
