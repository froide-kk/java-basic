package exercises.problem3;
import java.util.Random;

import java.util.Random;

public class Problem3_2 {
    public static void main(String[] args){
        Random rnd = new Random();
        int num = rnd.nextInt(10)+1;

        System.out.println(num);
        if(num!=1){
            System.out.println("1ではありません");
        }
    }
}
