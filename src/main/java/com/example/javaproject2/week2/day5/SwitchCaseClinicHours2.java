package com.example.javaproject2.week2.day5;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        String day = "토";
        String time = "휴진";
        switch (day) {
            case "월", "화", "수", "목", "금": time = "08:30-18:00"; break;
            case "토": time = "08:30-12:30"; break;
            case "일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
