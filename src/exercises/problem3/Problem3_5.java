package exercises.problem3;

import java.util.Random;

public class Problem3_5 {
    public static void main(String[] args){
        Random rnd = new Random();
        int num = rnd.nextInt(100)+1;

        System.out.println(num);
        if(num>=20&&num<80){
            System.out.println("20以上80未満です");
        }
    }
}
