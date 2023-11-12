package org.example;

import org.example.faculty.Griffendor;
import org.example.faculty.Kogtevran;
import org.example.faculty.Puffenduy;
import org.example.faculty.Slizerin;

import java.util.Random;

public class Main2_2 {

    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        HogwardsStudent student1 = generateGriffendor("Garry Potter");
        HogwardsStudent student2 = generateGriffendor("Germiyona Grange");
        HogwardsStudent student3 = generateGriffendor("Ron Withly");
        HogwardsStudent student4 = generateSlizerin("Draco Malphoy");
        HogwardsStudent student5 = generatePuffenduy("Nevil Dolgopups");
        HogwardsStudent student6 = generateKogtevran("Lesya Evstignrrva");
        HogwardsStudent student7 = generatePuffenduy("Joshua Yong");

        print(student1);
        print(student2);
        print(student3);
        print(student4);
        print(student5);
        print(student6);
        print(student7);


    }



    private static Griffendor generateGriffendor(String name) {
        return new Griffendor(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static Slizerin generateSlizerin(String name) {
        return new Slizerin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static Puffenduy generatePuffenduy(String name) {
        return new Puffenduy(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static Kogtevran generateKogtevran(String name) {
        return new Kogtevran(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static void print(HogwardsStudent student) {
        System.out.println(student);;
    }
}
