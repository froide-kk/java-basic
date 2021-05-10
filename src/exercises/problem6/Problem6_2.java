package exercises.problem6;
import java.util.ArrayList;
import java.util.Random;

public class Problem6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> reverse = new ArrayList<Integer>();
        Random rand = new Random();
        while (true) {
            int num = rand.nextInt(11);
            System.out.println("乱数:" + num);
            if (num == 0) {
                break;
            }
            reverse.add(0, num);
        }
        System.out.println(reverse);
    }
}
//実行結果
//乱数:10
//乱数:7
//乱数:10
//乱数:6
//乱数:5
//乱数:8
//乱数:0
//[8, 5, 6, 10, 7, 10]
