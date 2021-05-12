package exercises.problem9;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Problem9_3 {
    public static void main(String[] args) {
        Random rand = new Random();

        Cat cat = new Cat();
        Dog dog = new Dog();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        //実験的にポリモーフィズム
        for (Animal animal: animals){
            //アルフベト以外を削除
            animal.name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]","");
            animal.age = rand.nextInt(101);
            animal.showProfile();
            animal.speak();
        }
    }
}
