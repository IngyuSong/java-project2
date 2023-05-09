package com.example.javaproject2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Codeup1412 {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 'a'; i <= 'z'; i++) {
            map.put((char) i, 0);
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
        }
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
