package exercises.problem8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem8_2 {
    public static void main(String args[]) throws IOException {
        Dog dog = new Dog();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("名前を入力してください：");
        String name = br.readLine();
        System.out.print("年齢を入力してください：");
        int age = Integer.parseInt(br.readLine());
        dog.setName(name);
        dog.setAge(age);
        dog.showProfile();
    }
}
