package exercises.problem8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem8_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("名前を入力してください：");
        String name = br.readLine();
        System.out.print("年齢を入力してください：");
        int age = Integer.parseInt(br.readLine());
        System.out.print("犬種を入力してください：");
        String breed = br.readLine();

        Dog dog = (breed.length() != 0) ? new Dog(breed) : new Dog();
        dog.setName(name);
        dog.setAge(age);
        dog.showProfile();
    }
}
