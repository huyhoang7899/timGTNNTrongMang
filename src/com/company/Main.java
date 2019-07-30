package com.company;

public class Main {
    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i + 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 6, 4, 85, 2, 86, 4};
        System.out.println("GTNN : " + minValue(arr));
    }
}
