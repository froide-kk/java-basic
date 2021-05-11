package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.System.out;

public class Problem6_3 {
    public static void main(String[] args) {
        ArrayList<Integer> num_list = new ArrayList<>();

        while(true) {
            Random rand = new Random();
            int num = rand.nextInt(101);
            out.println("乱数: " + num);

            if (num == 0) break;
            num_list.add(num);
        }

        for(int i = 0; i < 10; i++){
            int count = 0;
            out.printf("一の位が%d: ", i);
            for(int arr_num: num_list){
                if(arr_num % 10 == i ){
                    out.printf("%d ", arr_num);
                    count+=1;
                }
            }
            if(count == 0) out.printf("なし");
            out.println();
        }
    }
}
