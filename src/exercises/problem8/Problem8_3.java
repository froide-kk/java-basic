package exercises.problem8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem8_3 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Dog dog = new Dog();

        System.out.print("名前を入力:");
        String name = br.readLine();
        System.out.print("年齢を入力:");
        int age = Integer.parseInt(br.readLine());

        dog.setName(name);
        dog.setAge(age);
        dog.showProfile();
    }
}
