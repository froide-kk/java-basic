package exercises.problem3;

import java.util.Random;

public class Problem3_6 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println(num);
        if(num % 2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
