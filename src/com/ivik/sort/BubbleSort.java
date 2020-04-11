package com.ivik.sort;

public class BubbleSort {
    private int[] sorted;

    private void swap(int x, int y) {
        int swapped = sorted[x];
        sorted[x] = sorted[y];
        sorted[y] = swapped;
    }

    public int[] sort(int[] unsorted) {
        sorted = unsorted.clone();
        boolean isSorted = false;
        int i = 0;
        int swaps = 0;
        while (!isSorted) {
            if (i == sorted.length - 1) {
                i = 0;
                if (swaps == 0) {
                    isSorted = true;
                    continue;
                }
                swaps = 0;

            }
            if (sorted[i] > sorted[i + 1]) {
                swap(i, i + 1);
                swaps++;
            }
            i++;
        }
        return sorted;
    }
}
