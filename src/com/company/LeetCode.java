package com.company;

import java.util.ArrayList;
import java.util.List;

public class LeetCode {

    public static int[] smallerNumbersThanCurrent_1365(int[] nums) {

        int[] result = new int[nums.length];
        int snum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    snum++;
                }
            }
            result[i] = snum;
            snum = 0;
        }

        return result;
    }

    public static int[] runningSum_1480(int[] nums) {
        int[] result = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = nums[i];
            } else {
                int sum = 0;
                for (int j = 0; j <= i; j++) {
                    sum += nums[j];
                }
                result[i] = sum;
            }

        }
        return result;
    }

    public static int[] runningSum_1480_linear(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }

    public static int mostWordsFound_2114(String[] sentences) {
        int words;
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            //words = (int)sentences[i].chars().filter(ch -> ch == ' ').count() + 1;
            words = sentences[i].split(" ").length;
            if (words > max) {
                max = words;
            }
        }
        return max;
    }

    public static char[] reverseString_344(String word) {
        char[] c = word.toCharArray();
        for (int i = 0; i < c.length / 2; i++) {
            char temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }
        return c;
    }

    public static List<String> fizzBuzz_412(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}