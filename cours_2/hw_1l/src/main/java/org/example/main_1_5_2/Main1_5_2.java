package org.example.main_1_5_2;

import java.util.Arrays;

public class Main1_5_2 {
    public static void main(String[] args) {
        Person person = new Person("name", "surname");
        PersonService personService = new PersonService();
        personService.changePerson(person);
        System.out.println("person = " + person);
    }

    private static void changeValue(Integer[] integers) {

    }
}
