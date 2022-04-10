package com.github.ivan100kg.algorithms;


public class MainApp {
    public static void main(String[] args) {
        final int SIZE = 100000;    // 100k
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = (int) ((Math.random() * (SIZE * 2 )) - SIZE);
        }

        // Bubble sort
        BubbleSort bubbleSort = new BubbleSort(array);
        long start = System.currentTimeMillis();
        bubbleSort.sort();
        System.out.println(array.getClass().getSimpleName() + " test 'Bubble sort' time: " + (System.currentTimeMillis() - start));

    }
}
