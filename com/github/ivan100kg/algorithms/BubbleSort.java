package com.github.ivan100kg.algorithms;

import java.util.Arrays;

public class BubbleSort {
    private int[] array;

    BubbleSort(int... array) {
        this.array = array;
    }

    void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
