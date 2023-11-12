package org.example;

public class Main3_1 {
    public static void main(String[] args) {
        {
            var age1 = 29;
            var age2 = 14;
            if (age1 > 18) {
                System.out.println("он совершеннолетний");
            } else {
                System.out.println("он не совершеннолетний");
            }
            if (age2 > 18) {
                System.out.println("он совершеннолетний");
            } else {
                System.out.println("он не совершеннолетний");
            }
        }
        {
            var temperature1 = -5;
            var temperature2 = 5;
            if (temperature1 < 5) {
                System.out.println("холодно");
            } else {
                System.out.println("тепло");
            }
            if (temperature2 < 5) {
                System.out.println("холодно");
            } else {
                System.out.println("тепло");
            }
        }
        {
            var speed1 = 100;
            var speed2 = 50;
            if (speed1 > 60) {
                System.out.println("превышение скорости");
            } else {
                System.out.println("скорость нормализованна");
            }
            if (speed2 > 60) {
                System.out.println("превышение скорости");
            } else {
                System.out.println("скорость нормализованна");
            }
        }
        {
            var age1 = 4;
            var age2 = 14;
            var age3 = 19;
            {
                if (age1 > 2 && age1 <= 6) {
                    System.out.println("Детский сад");
                } else if (age1 >= 7 && age1 <= 17) {
                    System.out.println("школа");
                } else {
                    System.out.println("work");
                }
            }
            {
                if (age2 > 2 && age2 <= 6) {
                    System.out.println("Детский сад");
                } else if (age2 >= 7 && age2 <= 17) {
                    System.out.println("школа");
                } else {
                    System.out.println("work");
                }
            }
            {
                if (age2 > 2 && age2 <= 6) {
                    System.out.println("Детский сад");
                } else if (age2 >= 7 && age2 <= 17) {
                    System.out.println("школа");
                } else {
                    System.out.println("work");
                }
            }
        }
        {
            var age1 = 4;
            var age2 = 7;
            var age3 = 15;
            boolean rod1 = false;
            boolean rod2 = true;
            {
                if (age1 < 5) {
                    System.out.println("non");
                } else if (age1 >= 5 && age1 < 14 && rod1) {
                    System.out.println("yes");
                } else if (!rod1) {
                    System.out.println("non");
                } else {
                    System.out.println("yes");
                }
                if (age2 < 5) {
                    System.out.println("non");
                } else if (age2 >= 5 && age2 < 14 && rod1) {
                    System.out.println("yes");
                } else if (!rod1) {
                    System.out.println("non");
                } else {
                    System.out.println("yes");
                }
                if (age3 < 5) {
                    System.out.println("non");
                } else if (age3 >= 5 && age3 < 14 && rod1) {
                    System.out.println("yes");
                } else if (!rod1) {
                    System.out.println("non");
                } else {
                    System.out.println("yes");
                }
            }
            {
                if (age1 < 5) {
                    System.out.println("non");
                } else if (age1 >= 5 && age1 < 14 && rod2) {
                    System.out.println("yes");
                } else if (!rod2) {
                    System.out.println("non");
                } else {
                    System.out.println("yes");
                }
                if (age2 < 5) {
                    System.out.println("non");
                } else if (age2 >= 5 && age2 < 14 && rod2) {
                    System.out.println("yes");
                } else if (!rod1) {
                    System.out.println("non");
                } else {
                    System.out.println("yes");
                }
                if (age3 < 5) {
                    System.out.println("non");
                } else if (age3 >= 5 && age3 < 14 && rod2) {
                    System.out.println("yes");
                } else if (!rod2) {
                    System.out.println("non");
                } else {
                    System.out.println("yes");
                }
            }
        }
        {
            var people1 = 120;
            var people2 = 94;
            if (people1 > 102) {
                System.out.println("non");
            } else {
                System.out.println("stend " + (people1 - 60));
            }
            if (people2 > 102) {
                System.out.println("non");
            } else {
                System.out.println("stend " + (people2 - 60));
            }
        }
        {
            int one = 1;
            int two = 2;
            int three = 3;
            if (one > two && one > three) {
                System.out.println(one);
            } else if (two > one && two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}