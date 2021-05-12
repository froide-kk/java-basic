package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

public class Problem6_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        String gusu = "";
        String kisu = "";

        while(true){
            int num = rand.nextInt(10);
            System.out.println("乱数；"+ num);
            if(num == 0){
                break;
            }else if(num % 2 == 0){
                odd.add(num);
            }else {
                even.add(num);
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            gusu += odd.get(i) + " ";
        }
        for (int j = 0; j < even.size(); j++) {
            kisu += even.get(j) + " ";
        }
        System.out.print("\n偶数：" + gusu);
        System.out.print("\n奇数：" + kisu);
    }
}
