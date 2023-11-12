package org.example.main_1_6_2;

import org.example.main_1_5_2.Person;
import org.example.main_1_5_2.PersonService;

public class Main1_6_2 {
    public static void main(String[] args) {
        Person person = new Person("name", "surname");
        PersonService personService = new PersonService();
        personService.changePerson(person);
        System.out.println("person = " + person);
    }
}
