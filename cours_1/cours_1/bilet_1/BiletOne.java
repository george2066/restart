package bilet_1;

import java.util.Arrays;

public class BiletOne {
    public static void main(String[] args) {
        int integer = 68;
        increment(integer);
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9};
        array = reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void increment(int integer) {
        System.out.println(integer + 1);
    }

    public static int[] reverse(int[] array) {
        int[] massive = new int[array.length];
        int j = array.length - 1;
        for(int integer : array) {
            massive[j] = integer;
            j--;
        }
        return massive;
    }
}
