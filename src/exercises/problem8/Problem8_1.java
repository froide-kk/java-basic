package exercises.problem8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problem8_1 {
    public static void main(String args[]) throws IOException {
        Dog dog = new Dog();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("名前を入力してください：");
        String name = br.readLine();
        dog.setName(name);
        dog.showProfile();
    }
}
