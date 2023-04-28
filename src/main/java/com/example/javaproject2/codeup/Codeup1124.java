package com.example.javaproject2.codeup;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Pattern p = Pattern.compile("(?<=[C,H])[0-9]+");
        Matcher m = p.matcher(str);
        System.out.println((m.find() ? Integer.parseInt(m.group()) * 12 : 0) + (m.find() ? Integer.parseInt(m.group()) : 0));
    }
}
