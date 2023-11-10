package org.example;

public class Main10 {
    public static void main(String[] args) {
        {
            String firstName = "Ivan";
            String middleName = "Ivanov";
            String lastName = "Ivanovich";
            String fullName = middleName + " " + firstName + " " + lastName;
            System.out.println("Ф. И. О. сотрудника — " + fullName);
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        }
        {
            String firstName = "Семён ";
            String middleName = "Иванов";
            String lastName = "Семёнович";
            String fullName = middleName + " " + firstName + " " + lastName;
            System.out.println("Ф. И. О. сотрудника — " + fullName);
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.replace("ё", "е"));
        }
    }
}