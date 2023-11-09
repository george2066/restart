package org.example;

public class Main6 {
    public static void main(String[] args) {
        {
            for (int i = 0; i < 11; i++) {
                System.out.println(i);
            }
        }
        {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
        }
        {
            int i = 0;
            while(i < 17) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
        {
            for (int i = 10; i > -11; i--) {
                System.out.println(i);
            }
        }
        {
            short start = 1904;
            short stop = 2097;
            for (short i = start; i < stop; i++) {
                if (i / 400 == 0 && (i / 100 != 0) || i % 4 == 0) {
                    System.out.println(i);
                }
            }
        }
        {
            for (int i = 7; i < 100; i++) {
                if (i % 7 == 0) {
                    System.out.println(i);
                }
                ;
            }
        }
        {
            int i = 1;
            while (i < 600) {
                System.out.println(i);
                i = i + i;
            }
        }
        {
            int zp = 29000;
            for (int i = 1; i < 13; i++) {
                System.out.println(i + ": " + (zp));
                zp = (zp + 29000);
            }
        }
        {
            var salary = 29000;
            for (int i = 1; i < 13; i++) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + salary + " рублей");
                salary = salary + (salary / 100);
            }
        }
        {
            for (int i = 0; i < 11; i++) {
                System.out.println("2*" + i + "=" + (2 * i));
            }
        }
    }
}