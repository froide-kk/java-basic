package exercises.problem3;

import java.util.Random;

public class Problem3_8 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(101);
        System.out.println(num);
        if (num >= 80 ){
            System.out.println("優");
        }else if(num < 80 && num>=70){
            System.out.println("良");
        }else if(num < 70 && num>=60){
            System.out.println("可");
        }else{
            System.out.println("不可");
        }
    }
}
