package bilet_4;

import java.util.Arrays;

public class Bilet4 {
    public static void main(String[] args) {
        char[] chars = new char[]{'a','s','d','f','g','h','a','s','d','f','g','h'};
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    chars[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(chars));
    }
}
