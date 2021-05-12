package exercises.problem6;

import java.util.ArrayList;
import java.util.Random;

public class Problem6_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            int randbox = rand.nextInt(10);
            if (randbox == 0) {
                arr.add(randbox);
                break;
            }
            arr.add(randbox);
        }

        for (int i : arr) {
            System.out.println("乱数" + i);
        }

        System.out.println();

        int i = 0;
        System.out.print("偶数:");
        for (int r : arr) {
            if (arr.get(i) % 2 == 0&&arr.get(i)!=0) {
                System.out.print(arr.get(i)+" ");
            }
            i++;
        }

        System.out.println();

        i = 0;
        System.out.print("奇数:");
        for (int r : arr) {
            if (arr.get(i) % 2 != 0) {
                System.out.print(arr.get(i)+" ");
            }
            i++;
        }

    }
}

