package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

public class Problem6_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        String oddText = "奇数 :";
        String evenText = "偶数 :";
        while (true){
            int num = rand.nextInt(11);
            System.out.println("乱数："+num);
            if (num % 2 == 0) {
                evenText += " "+num;
                even.add(num);
            }else{
                oddText += " "+num;
                odd.add(num);
            }
            if (num == 0) {
                break;
            }
        }
        System.out.println(oddText);
        System.out.println(evenText);
    }
}
