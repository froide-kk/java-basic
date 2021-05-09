package exercises.problem3;

import java.util.Random;

public class Problem3_4 {
    public static void main(String[] args){
        int x = random_num();
        if( x <= 10 || x >= 90){
            System.out.println("10以下か90以上です");
        }
    }

    private static int random_num(){
        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println("exportnum:" + num);
        return num;
    }
}
