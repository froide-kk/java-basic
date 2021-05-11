package exercises.problem3;
import java.util.Random;

public class Problem3_1 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(10) + 1;
        System.out.println(num);
        if (num >= 5) {
            System.out.println("5以上です");
        } else {
//            条件を満たさない時は何もしない
        }
    }
}

//実行結果
//6
//5以上です