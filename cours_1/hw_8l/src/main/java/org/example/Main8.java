package org.example;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        {
            int [] weight = new int [12];
            weight[0] = 1;
            weight[1] = 2;
            weight[2] = 3;
            weight[3] = 4;
            weight[4] = 5;
            weight[5] = 6;
            weight[6] = 7;
            weight[7] = 8;
            weight[8] = 9;
            weight[9] = 10;
            weight[10] = 11;
            weight[11] = 12;

            double[] height = {1.57, 7.654, 9.986};
            int[] integers = new int[]{56, 37, 29};

            System.out.println(Arrays.toString(weight));
            System.out.println(Arrays.toString(height));
            System.out.println(Arrays.toString(integers));

            for (int i = weight.length - 1; i >= 0; i--) {
                System.out.print(weight[i] + " ");
            }
            System.out.println();
            for (int i = height.length - 1; i >= 0; i--) {
                System.out.print(height[i] + " ");
            }
            System.out.println();
            for (int i = integers.length - 1; i >= 0; i--) {
                System.out.print(integers[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < weight.length; i++) {
                if (weight[i] % 2 == 1) {
                    weight[i] = weight[i] + 1;
                }
            }
            System.out.println(Arrays.toString(weight));
        }
    }
}