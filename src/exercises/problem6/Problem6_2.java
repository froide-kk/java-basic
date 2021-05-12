package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

public class Problem6_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numberArray = new ArrayList<>();
        String result = "";
        while (true){
            int num = rand.nextInt(11);
            numberArray.add(num);
            System.out.println("乱数："+num);
            if (num==0) {
                break;
            }
        }
        for (int i = numberArray.size() - 1; i > -1; i--) {
            result += numberArray.get(i)+" ";
        }
        System.out.println(result);
    }
}
