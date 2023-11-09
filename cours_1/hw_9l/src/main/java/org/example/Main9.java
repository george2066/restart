package org.example;

public class Main9 {
    public static void main(String[] args) {
        {
            int[] array = generateRandomArray();
            int summa = 0;
            for (int element : array) {
                summa = summa + element;
            }
            System.out.println("Сумма трат за месяц составила " + summa + " рублей");
        }
        {
            int[] array = generateRandomArray();
            int max = 0;
            int min = array[0];
            for (int element : array) {
                if (element > max) {
                    max = element;
                } else if (min > element) {
                    min = element;
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + min + "  рублей. Максимальная сумма трат за день составила " + max + " рублей");
        }
        {
            int[] array = generateRandomArray();
            int summa = 0;
            double middle = 0;
            for (int element : array) {
                summa = summa + element;
            }
            middle = summa / array.length;
            System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей");
        }
        {
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            String name = "";
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                name += reverseFullName[i];
            }
            System.out.println(name);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}