package com.example.javaproject2.week4.day3;

public class DrawDiamond2 {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    } // symbol을 repeat()을 사용하여 n번 반복하여 반환

    public static String getRepeatedSymbol2(String symbol, int n) {
        String symbols = "";
        for (int i = 0; i < n; i++) {
            symbols += symbol;
        }
        return symbols;
    } // symbol을 repeat()을 사용하지 않고 n번 반복하여 반환(반복문 사용)

    public static String makeALine(int h, int i) {
        int pivot = h / 2; //중간 지점을 저장할 변수 pivot을 선언하고 h를 2로 나눈 몫으로 초기화
        if (i <= pivot) { // 피라미드 부분을 출력하는 조건문
            // i가 0일 때는 공백 없이 별 1개를 출력해야 하므로 초항이 3이 되어야 함
            // 피라미드 부분의 별 개수는 2씩 증가하고, 공백 개수는 1씩 감소함
            return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
        } else { // 역피라미드 부분을 출력하는 조건문
            // 역피라미드 부분의 별 개수는 2씩 감소하고, 공백 개수는 1씩 증가함
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        int h = 5; // 다이아몬드의 높이를 저장할 변수 h를 선언하고 값을 5로 초기화(짝수에서는 모양이 이상하게 나옴)
        for (int i = 0; i < h; i++) { // 다이아몬드의 높이만큼 반복하여 각 줄을 만들어 출력합니다.
            System.out.print(makeALine(h, i));
        }
    }
}
