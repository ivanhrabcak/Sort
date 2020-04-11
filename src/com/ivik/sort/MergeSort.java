package com.ivik.sort;

import java.util.Arrays;

public class MergeSort { // :(
    private int[] sorted;

    private void swap(int x, int y) {
        int swapped = sorted[x];
        sorted[x] = sorted[y];
        sorted[y] = sorted[x];
    }

    public int[] merge(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        if (array1.length == 1 && array2.length == 1) {
            if (array1[0] > array2[0]) {
                merged[0] = array2[0];
                merged[1] = array1[0];
            }
            else {
                merged[1] = array2[0];
                merged[0] = array1[0];
            }
        }
        else {
            for (int i = 0; i < array1.length + array2.length - 2; i++) {
                if (i <= array1.length) {
                    merged[i] = array1[i];
                }
                else {
                    merged[i] = array2[i - array1.length];
                }
            }
        } // ??????????????
        return merged;
    }

    public int[] mergeSort(int[] array, int start, int end) {
        int length = end - start;
        if (length != 1) {
            System.out.println(Arrays.toString(array));
            int middle = length / 2;
            int[] firstArray = mergeSort(array, start, middle);
            int[] secondArray = mergeSort(array, middle + 1, end);
            return merge(firstArray, secondArray);
        }
        else {
            return new int[] {array[start]};
        }
    }

    public int[] sort(int[] unsorted, int start, int end) {
        sorted = unsorted.clone();
        if (end > start) {
            int middle = (end - start) / 2;
            System.out.println(middle);
            int[] firstHalf = mergeSort(sorted, start, middle);
            int[] secondHalf = mergeSort(sorted, start, middle  + 1);
            sorted = merge(firstHalf, secondHalf);
        }
        return sorted;
    }
}
