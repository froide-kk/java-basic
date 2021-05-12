package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

public class Problem6_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        while(true){
            int randbox = rand.nextInt(10);
            if(randbox==0){
                arr.add(randbox);
                break;
            }
            arr.add(randbox);
        }

        for(int j:arr){
            System.out.println("乱数："+j);
        }


        int i = arr.size()-1;
        for(int j:arr){
            if(arr.get(i)!=0) {
                System.out.print(arr.get(i) + " ");
            }
            i--;
        }
    }
}
