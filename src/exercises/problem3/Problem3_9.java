package exercises.problem3;

import java.util.Random;

public class Problem3_9 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println(num);
        if (num % 6 == 0){
            System.out.println("2と3の公倍数です。");
            return;
        }else if(num % 2 == 0){
            System.out.println("2の倍数です。");
        }else if(num % 3 == 0){
            System.out.println("3の倍数です。");
        }
    }
}
