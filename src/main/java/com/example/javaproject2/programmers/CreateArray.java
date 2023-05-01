package com.example.javaproject2.programmers;

import java.util.ArrayList;

public class CreateArray {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            int num = i;
            boolean flag = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit != 0 && digit != 5) {
                    flag = false;
                    break;
                }
                num /= 10;
            }
            if (flag) {
                list.add(i);
            }
        }
        if (list.isEmpty()) list.add(-1);
        return list;
    }
}
