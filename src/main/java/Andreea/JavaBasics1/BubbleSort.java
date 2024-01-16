package Andreea.JavaBasics1;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arrayNum = {1, -20, 15, -10, 56};
        System.out.println(Arrays.toString(arrayNum));
        System.out.println(Arrays.toString(bubbleSort(arrayNum)));

    }


    public static int[] bubbleSort(int[] array) {

        int len = array.length;
        for (int i = 1; i <= len - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;

                }
            }
        }
        return array;

    }
}
