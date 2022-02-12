package com.company;

public class BubbleSorter {
    public static int[] sorter(int[] array) {
        //int[] array = {1,3,4,7,8};
        int rMargin;
        int n = array.length;
        for(rMargin = n - 1; rMargin >= 1; rMargin--) {
            for(int i = 0; i < rMargin; i++) {
                if (array[i] > array[i+1]) {
                  int temp = array[i];
                  array[i] = array[i+1];
                  array[i+1] = temp;
                }
            }
        }
        return array;
    }
}
