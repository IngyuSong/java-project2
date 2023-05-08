package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class RockScissorsPaper {
    public static String[] rockScissorsPaper = {"가위", "바위", "보"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[35m"+"이길 때까지 하는 가위바위보 게임"+"\u001B[0m");
        boolean flag = true;
        while (flag){
            System.out.println("\u001B[36m"+"가위 바위 보 중에 하나를 입력하세요."+"\u001B[0m");
            System.out.print("나: ");
            String user = sc.next();
            String com = computer();
            System.out.println("컴퓨터: " + com);
            String result = play(changeNum(user), changeNum(com));
            System.out.println(result);
            if(result == "\u001B[34m" + "\u001B[7m" + "이겼습니다." + "\u001B[0m") flag = false;
        }
    }

    public static String computer(){
        return rockScissorsPaper[(int) (Math.random() * 3)];
    }

    public static int changeNum(String inputStr){
        switch (inputStr){
            case "바위": return 0;
            case "가위": return 1;
            case "보": return 2;
            default: return 999;
        }
    }

    public static String play(int user, int com) {
        int result = user - com;
        switch (result) {
            case 0:
                return "\u001B[32m" + "\u001B[7m" + "비겼습니다." + "\u001B[0m";
            case 1:
            case -2:
                return "\u001B[33m" + "\u001B[7m" + "졌습니다." + "\u001B[0m";
            case 2:
            case -1: return "\u001B[34m" + "\u001B[7m" + "이겼습니다." + "\u001B[0m";
            default:
                return "\u001B[31m" + "\u001B[4m" + "가위, 바위, 보 만 입력하세요!" + "\u001B[0m";
        }
    }
}
