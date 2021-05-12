package exercises.problem3;

import java.util.Random;

public class Problem3_3 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(101);
        System.out.println(num);
        if (num < 50) {
            System.out.println("50未満です。");
        }
    }
}
