package exercises.problem3;
import java.util.Random;

public class Problem3_2 {
    public static void main(String[] args){
        int x = random_num();
        if( x != 1){
            System.out.println("1じゃありません");
        }
    }

    private static int random_num(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println("exportnum:" + num);
        return num;
    }
}
