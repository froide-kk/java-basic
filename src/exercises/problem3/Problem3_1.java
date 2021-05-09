package exercises.problem3;
import java.util.Random;

public class Problem3_1 {
    public static void main(String[] args){
        int x = random_num();
        if( x >= 5){
            System.out.println("5以上です");
        }
    }

    private static int random_num(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println("exportnum:" + num);
        return num;
    }
}
