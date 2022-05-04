package com.company;

public class Main {
    public static int MaxArr(int[] arr) {
        int max = arr[0];

        if (arr.length <= 0) {
            throw new IllegalArgumentException("empty array!!");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int MinArr(int[] arr) {
        int min = Integer.MAX_VALUE;

        if (arr.length <= 0) {
            throw new IllegalArgumentException("empty array!!");
        }

        for (int i=0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

