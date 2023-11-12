package org.example;

import java.util.Arrays;

public class Main1_3_2 {
    public static void main(String[] args) {
        Integer[] value = new Integer[]{3, 4};
        changeValue(value);
        System.out.println("value = " + Arrays.toString(value));
    }

    private static void changeValue(Integer[] integers) {
        integers = new Integer[]{1,2};
    }
}
