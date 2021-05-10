package exercises.problem9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("猫の名前を入力してください：");
        String cat_name = br.readLine();
        System.out.print("猫の年齢を入力してください：");
        int cat_age = Integer.parseInt(br.readLine());
        System.out.print("犬の名前を入力してください：");
        String dog_name = br.readLine();
        System.out.print("犬の年齢を入力してください：");
        int dog_age = Integer.parseInt(br.readLine());

        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.setProfile(cat_name, cat_age);
        dog.setProfile(dog_name, dog_age);
        cat.showProfile();
        cat.sleep();
        dog.showProfile();
        dog.run();
    }
}
