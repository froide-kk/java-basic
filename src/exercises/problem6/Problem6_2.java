package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

public class Problem6_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> data = new ArrayList<>();
        String integer = "";

        while(true){
            int num = rand.nextInt(10);
            System.out.println("乱数：" + num);
            if(num == 0){
                break;
            }else {
                data.add(num);
            }
        }
        for (int i = data.size()-1; i >= 0 ; i--) {
            integer += data.get(i) + " ";
        }
        System.out.println("\n" + integer);
    }
}
