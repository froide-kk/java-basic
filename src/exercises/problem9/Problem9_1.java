package exercises.problem9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9_1 extends Animal{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Cat cat = new Cat();

        System.out.print("名前を入力：");
        String name = br.readLine();
        System.out.print("年齢を入力：");
        int age = Integer.parseInt(br.readLine());

        cat.setName(name);
        cat.setAge(age);
        cat.showProfile();
        cat.sleep();

    }
}