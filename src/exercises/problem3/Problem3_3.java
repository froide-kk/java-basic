package exercises.problem3;

import java.util.Random;

public class Problem3_3 {
    public static void main(String[] args){
        int x = random_num();
        if( x < 50){
            System.out.println("50未満です");
        }
    }

    private static int random_num(){
        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println("exportnum:" + num);
        return num;
    }
}
