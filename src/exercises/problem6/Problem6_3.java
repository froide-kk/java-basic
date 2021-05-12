package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

public class Problem6_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList <Integer> data = new ArrayList<>();
        String result = "";

        while (true){
            int num  = rand.nextInt(100);
            System.out.println("乱数：" + num);

            if(num == 0){
                break;
            }else {
                data.add(num);
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            result = "";
            for (int j = 0; j < data.size(); j++) {
                if(data.get(j) % 10 == i){
                    result += data.get(j) + " ";
                }
            }
            if (result.equals("")) {
                result = "なし";//
            }
            System.out.println("一の位が" + i + "：" + result);
        }
    }
}
