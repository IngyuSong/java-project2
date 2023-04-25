package com.example.javaproject2.codeup;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("\\.");
        Date date = new Date(Integer.parseInt(array[0])-1900,Integer.parseInt(array[1])-1,Integer.parseInt(array[2]));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println(simpleDateFormat.format(date));
    }
}
