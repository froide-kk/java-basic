package exercises.problem3;

import java.util.Random;

public class Problem3_10 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(101);
        System.out.println(num);
        if (num <= 50 && num % 2 == 0){
            System.out.println("50以下の偶数です。");
            return;
        }else if(num <= 50){
            System.out.println("50以下です。");
        }else if(num % 2 == 0){
            System.out.println("偶数です。");
        }
    }
}
