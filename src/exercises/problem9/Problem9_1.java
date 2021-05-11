package exercises.problem9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9_1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("名前を入力してください：");
        String name = br.readLine();
        System.out.print("年齢を入力してください：");
        int age = Integer.parseInt(br.readLine());

        Cat cat = new Cat();
        cat.setProfile(name, age);
        cat.showProfile();
        cat.sleep();
    }


}
