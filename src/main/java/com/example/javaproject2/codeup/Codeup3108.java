package com.example.javaproject2.codeup;

import java.util.*;

public class Codeup3108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        while (n-- > 0) {
            String code = sc.next();
            int num = sc.nextInt();
            String name = sc.next();
            if (!map.containsKey(num) && code.equals("I")) map.put(num, name);
            else map.remove(num);
        }
        map.forEach((key, value) -> list.add(key + " " + value));
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(sc.nextInt() - 1));
        }
    }
}
