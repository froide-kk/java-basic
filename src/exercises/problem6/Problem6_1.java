package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;
import static java.lang.System.*;


public class Problem6_1 {
    public static void main(String[] args) {
        ArrayList<Integer> odd_list = new ArrayList<>();
        ArrayList<Integer> even_list = new ArrayList<>();


        while(true){
            Random rand = new Random();
            int num = rand.nextInt(11);
            out.println("乱数: " + num);

            if(num == 0) break;

            if(num % 2 ==0){
                even_list.add(num);
            }else{
                odd_list.add(num);
            }
        }

        out.printf("偶数: ");
        for(int even: even_list){
            out.printf("%d ", even);
        }

        out.println();
        out.printf("奇数: ");
        for(int odd: odd_list){
            out.printf("%d ", odd);
        }




    }
}
