package org.example;

public class Main1_2_2 {
    public static void main(String[] args) {
        Integer value = 33;
        changeValue(value);
        System.out.println("value = " + value);
    }

    private static void changeValue(Integer integer) {
        integer = 22;
    }
}
