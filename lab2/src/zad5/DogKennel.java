package zad5;

import java.util.ArrayList;
import java.util.Scanner;

class DogKennel {
    ArrayList<Dog> dogs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add_dog() {
        System.out.println("Введите имя собаки и ее возраст");
        String name = scanner.next();
        int age = scanner.nextInt();
        Dog dog = new Dog(name, age);
        dogs.add(dog);
    }

    public void show_dogs() {
        System.out.println("Лист собак из питомника: ");
        dogs.forEach((dog) -> System.out.println(dog.toString()));
    }

    public Dog find_dog() {
        String name = scanner.next();
        for (Dog dog:dogs) {
            if (dog.getName().equals(name)) {
                return dog;
            }
        }
        return null;
    }
}
