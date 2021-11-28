package com.javarush.task.task39.task3904;


/*
Лестница
*/

public class Solution {
    private static int n = 3;

    public static void main(String[] args) {
        System.out.println("The number of possible ascents for " + n + " steps is: " + numberOfPossibleAscents(n));
    }

    public static long numberOfPossibleAscents(int n) {

        if (n < 0) return 1;
        else if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 2;

        long a = 1;
        long b = 1;
        long c = 2;
        long d = 0;
        while (n-- > 2) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }
}


