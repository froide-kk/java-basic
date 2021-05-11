package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

public class Problem6_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numberArray = new ArrayList<>();
        String[] first =new String[10];

        while (true){
            int num = rand.nextInt(101);
            numberArray.add(num);
            System.out.println("乱数："+num);
            if (num==0) {
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            first[i] = "";
            for (int j = 0; j < numberArray.size(); j++) {
                if (numberArray.get(j) % 10 == i) {
                    first[i] += numberArray.get(j) + " ";
                }
            }
        }

        for(int f = 0; f < 10; f++){
            System.out.printf("1の位が%dのもの",f);
            System.out.println(first[f]);
        }
    }
}
