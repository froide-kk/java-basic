package exercises.problem3;

import java.util.Random;

public class Problem3_6 {
    public static void main(String[] args){
        Random rnd = new Random();
        int num = rnd.nextInt(10)+1;

        System.out.println(num);
        if(num%2==0){
            System.out.println("偶数です");
        }else {
            System.out.println("奇数です");
        }
    }
}
