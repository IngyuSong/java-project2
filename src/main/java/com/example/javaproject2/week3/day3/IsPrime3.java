package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class IsPrime3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String isPrime = "prime";
        for (int i = 2; i <= num / 2; i++) { // num/2 까지 찾기
            if (num % i == 0) isPrime = "not prime";
        }
        System.out.println(isPrime);
    }
}
