package exercises.problem3;

import java.util.Random;

public class Problem3_7 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(21) - 10;
        System.out.println(num);
        if (num > 0){
            //正の整数
            if (num % 2 == 0){
                //正の偶数
                System.out.println("正の偶数");
            }else{
                //正の奇数
                System.out.println("正の奇数");
            }
        }else{
            if (num % 2 == 0){
                //負の偶数
                System.out.println("負の偶数");
            }else{
                //負の奇数
                System.out.println("負の奇数");
            }
        }
    }
}
