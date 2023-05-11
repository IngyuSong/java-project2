package com.example.javaproject2.week4.day3;

import java.io.IOException;

public class HelloPrinter {

    Printer2 printer2;

    public HelloPrinter(Printer2 printer2) {
        this.printer2 = printer2;
    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer2.print(message);
        }
    }
    public void fileMessage(String message) throws IOException {
        printer2.print(message);
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter2());
        HelloPrinter hp2 = new HelloPrinter(new FilePrinter2());
        hp.repeatMessage(5, "Hello");
        hp2.fileMessage("Hello");
    }
}
