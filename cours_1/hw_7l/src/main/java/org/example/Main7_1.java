package org.example;

public class Main7_1 {
    public static void main(String[] args) {
        {
            var target = 2_459_000;
            var deposit = 15_000;
            var kop = 0;
            var i = 1;
            do {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + kop + " рублей");
                i++;
                kop = kop + deposit;
            } while (kop < target);
        }
        {
            for (int i = 0; i < 11; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 10; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
        {
            var popular = 12_000_000;
            var pregnet = 17;
            var death = 8;
            var statPregnet = popular / 1000 * pregnet;
            var statDeath = popular / 1000 * death;
            for (int i = 0; i < 11; i++) {
                popular = popular + (statPregnet - statDeath);
                System.out.println("Год " + i + ", численность населения составляет " + popular);
            }
        }
        {
            var salary = 15_000;
            var percent = 7;
            var stop = 12_000_000;
            var i = 1;
            do {
                System.out.println(i + " " + salary);
                i++;
                salary += (salary / 100 * percent);
            } while (salary < stop);
        }
        {
            System.out.println();
            var salary = 15_000;
            var percent = 7;
            var stop = 12_000_000;
            var i = 1;
            do {
                if (i % 6 == 0){
                    System.out.println(i + " " + salary);
                }
                i++;
                salary += (salary / 100 * percent);
            } while (salary < stop);
        }
        {
            System.out.println();
            var salary = 15_000;
            var percent = 7;
            var stop = 12_000_000;
            var i = 1;
            var years = 0;
            do {
                if (i % 6 == 0){
                    System.out.println(i + " " + salary);
                }
                i++;
                years++;
                salary += (salary / 100 * percent);
            } while (salary < stop && years < (9 * 12));
        }
        {
            System.out.println();
            var firstFruday = 3;
            var friday = firstFruday;
            for (int i = 0; i < 32; i++) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                friday += 7;
                if (friday > 31) {
                    break;
                }
            }
        }
        {
            var start = 1821;
            while (start < (2023 + 100)) {
                if (start % 79 == 0) {
                    System.out.println(start);
                    start += 79;
                }
                if (start % 79 != 0) {
                    start++;
                }
            }
        }
    }
}