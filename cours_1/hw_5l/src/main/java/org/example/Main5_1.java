package org.example;

public class Main5_1 {
    public static void main(String[] args) {
        {
            byte os1 = 1;
            byte os2 = 0;

            if (os1 == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (os2 == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        {
            byte os = 1;
            short years = 2015;

            if (years < 2015) {
                if (os == 1) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            } else {
                if (os == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            }
        }
        {
            short year = 2021;
            if (year / 4 == 0 && (year / 400 == 0 && (year / 100 != 0)) && year > 1584) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
        {
            byte delivery = 100;
            if (delivery < 20) {
                System.out.println("Доставка займёт сутки");
            } else if (delivery >= 20 && delivery < 60) {
                System.out.println("Доставка займёт двое суток");
            } else if (delivery >= 60 && delivery < 100) {
                System.out.println("Доставка займёт трое суток");
            } else {
                System.out.println("Доставки нет");
            }
        }
        {
            byte month = 2;
            switch (month) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    System.out.println("такого месяца не существует");
            }
        }
    }
}