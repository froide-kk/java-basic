package exercises.problem3;

import java.util.Random;

public class Problem3_5 {
    public static void main(String[] args){
        int x = random_num();
        if( x >= 20 && x < 80){
            System.out.println("20以上か80未満です");
        }
    }

    private static int random_num(){
        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println("exportnum:" + num);
        return num;
    }
}
