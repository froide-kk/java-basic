package exercises.problem3;
import java.util.Random;

public class Problem3_4 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        System.out.println(num);
        if (num <= 10 || 90 <= num) {
            System.out.println("10以下か90以上の値です");
        }
    }
}

//実行結果
//4
//10以下か90以上の値です