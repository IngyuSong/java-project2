package com.example.javaproject2.week1;

import com.example.javaproject2.PrintHello;

public class VariableEx {

    public static void main(String[] args) {
        int iVal;
        iVal = 0;

        PrintHello printHello;
        printHello = new PrintHello();

        System.out.println(iVal);
        printHello.print();
    }
}
