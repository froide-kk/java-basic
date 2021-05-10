package exercises.problem3;

import java.util.Random;

public class Problem3_10 {
    public static void main(String[] args){
        Random rnd = new Random();
        int num = rnd.nextInt(100)+1;


        System.out.println(num);


        if(num%2==0&&num<50){
            System.out.println("50以下の偶数です");
        }else if(num%2==0){
            System.out.println("偶数です");
        }else if(num<50){
            System.out.println("50以下です");
        }

    }
}
