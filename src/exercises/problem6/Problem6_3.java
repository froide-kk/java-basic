package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

public class Problem6_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        while(true){
            int randbox = rand.nextInt(100);
            if(randbox==0){
                arr.add(randbox);
                break;
            }
            arr.add(randbox);
        }

        for(int i:arr){
            System.out.println("乱数:"+i);
        }

        for(int i=0;i<10;i++){
            System.out.print("一位の位が"+i+":");
            boolean flg = false;
            for(int j=0;j<arr.size();j++) {
                if (arr.get(j)!=0&&arr.get(j) % 10 == i) {
                    System.out.printf("%2d ",arr.get(j));
                    flg=true;
                }
            }
            if(flg==false){
                System.out.print("なし");
            }
            System.out.println();
        }
    }
}
