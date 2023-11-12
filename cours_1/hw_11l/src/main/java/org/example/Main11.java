package org.example;

import java.time.LocalDate;

public class Main11 {
    public static void main(String[] args) {
        System.out.println(isLeapBoneYear(2024));
        System.out.println(isOldTelephone(1, 2020));
        System.out.println(howMuchToWait(60));
    }

    private static String isLeapBoneYear(int year) {
        if (year % 4 == 0) {
            return "Год является високосным";
        } else {
            return "Год не является високосным";
        }
    }

    private static String isOldTelephone(int os, int year) {
        if (year < LocalDate.now().getYear()) {
            if (os == 1) {
                return "Установите облегченную версию приложения для Android по ссылке";
            } else {
                return "Установите облегченную версию приложения для iOS по ссылке";
            }
        } else {
            if (os == 1) {
                return "Установите версию приложения для Android по ссылке";
            } else {
                return "Установите версию приложения для iOS по ссылке";
            }
        }
    }

    private static String howMuchToWait(int distance) {
        if (distance < 20) {
            return "Доставка займёт сутки";
        } else if (distance >= 20 && distance < 60) {
            return "Доставка займёт двое суток";
        } else if (distance >= 60 && distance < 100) {
            return "Доставка займёт трое суток";
        } else {
            return "Доставки нет";
        }
    }
}