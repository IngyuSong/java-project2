package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] strArr = time.split(":");
        System.out.println(strArr[0] + ":" + strArr[1]);
    }
}
