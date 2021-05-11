package exercises.problem6;
import java.util.*;

public class Problem6_1 {
    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        Random rand = new Random();
        while (true) {
            int num = rand.nextInt(11);
            System.out.println("乱数:" + num);
            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.println("偶数:" + even);
        System.out.println("奇数:" + odd);
    }
}
//実行結果
//乱数:3
//乱数:10
//乱数:2
//乱数:5
//乱数:7
//乱数:0
//偶数:[10, 2]
//奇数:[3, 5, 7]