package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.System.out;

public class Problem6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> num_list = new ArrayList<>();
        while(true) {
            Random rand = new Random();
            int num = rand.nextInt(11);
            out.println("乱数: " + num);

            if (num == 0) break;
            num_list.add(num);
        }

        for(int i = num_list.size(); 0 < i; i--) {
            out.printf("%d ", num_list.get(i - 1));
        }
    }
}
