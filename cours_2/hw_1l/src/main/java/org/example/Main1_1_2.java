package org.example;

//5
class Main1_1_2 {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);
    }

    private static void changeValue(int integer) {
        integer = 22;
    }
}
