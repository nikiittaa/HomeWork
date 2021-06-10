package homework7.zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Animals {

    public static int age = 2;
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Input animal (cat,dog,duck,tiger) or press Enter to exit");
            String animalType = bufferedReader.readLine();

            if (animalType.equals(" ") || animalType.equals("")) {
                break;
            }
            switch (animalType) {
                case "cat":
                    Cat cat = new Cat();
                    cat.getAge();
                    cat.climb();
                    cat.run();
                    break;
                case "dog":
                    Dog dog = new Dog();
                    dog.getAge();
                    dog.run();
                    dog.climb();
                    break;
                case "duck":
                    Duck duck = new Duck();
                    duck.getAge();
                    duck.fly();
                    duck.run();
                    duck.climb();
                    break;
                case "tiger":
                    Tiger tiger = new Tiger();
                    tiger.getAge();
                    tiger.run();
                    tiger.climb();
                    break;
                default:
                    System.out.println("Unknown animal type");
            }

        }


    }

}
