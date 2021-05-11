package exercises.problem8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Problem8_1 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("名前を入力:");
        String str = br.readLine();
        Dog doc = new Dog();

        doc.setName(str);
        doc.showProfile();
    }
}
