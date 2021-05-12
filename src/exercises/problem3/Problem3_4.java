package exercises.problem3;

import java.util.Random;

public class Problem3_4 {
    public static void main(String[] args){
        Random rnd = new Random();
        int num = rnd.nextInt(100)+1;

        System.out.println(num);
        if(num<=10||num>=90){
            System.out.println("10以下か90以上の値です");
        }
    }
}
