package exercises.problem3;

import java.util.Random;

public class Problem3_6 {
    public static void main(String[] args){
        int x = random_num();
        if(x < 0){
            System.out.print("負の");
        }else{
            System.out.print("正の");
        }
        if( x % 2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }

    private static int random_num(){
        Random rand = new Random();
        int num = rand.nextInt(20) - 10;
        System.out.println("exportnum:" + num);
        return num;
    }
}
