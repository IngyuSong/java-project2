package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        for(int i = 1; i < 16; i++){
            String result = Integer.toHexString(Integer.parseInt(hex, 16) * Integer.parseInt(Integer.toHexString(i), 16));
            System.out.println(hex + "*" + Integer.toHexString(i).toUpperCase() + "=" + result.toUpperCase());
        }
    }
}
