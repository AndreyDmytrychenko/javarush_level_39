package com.javarush.task.task39.task3901;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/*
Уникальные подстроки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your string: ");
        String s = bufferedReader.readLine();

        System.out.println("The longest unique substring length is: \n" + lengthOfLongestUniqueSubstring(s));
    }

    public static int lengthOfLongestUniqueSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        char[] chars = s.toCharArray();

        List<Integer> list = new ArrayList<>();
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < chars.length;) {
            if (characters.contains(chars[i])) {
                list.add(characters.size());
                characters = new ArrayList<>();
                int index = s.indexOf(chars[i]);
                s = s.substring(index + 1);
                chars = s.toCharArray();
                i = 0;
            } else {
                characters.add(chars[i]);
                i++;
            }
        }
        list.add(characters.size());
        list.sort(Integer::compare);
        return list.get(list.size() - 1);
    }
}

