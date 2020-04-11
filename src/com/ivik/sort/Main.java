package com.ivik.sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, 6, 0, 9, 10, 2, 4, 3, 8, 7};
        MergeSort mergeSort = new MergeSort();
        try {
            System.out.println(Arrays.toString(mergeSort.sort(array, 0, array.length - 1)));
        }
        catch (StackOverflowError e) {
            System.err.println("Stack Overflow");
        }
    }
}
