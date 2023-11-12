package bilet_5;

import java.util.Arrays;

public class Bilet5 {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(increment(array)));
    }

    public static int[] increment(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                integers[i] = integers[i] + 1;
            }
        }
        return integers;
    }
}
