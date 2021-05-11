package exercises.problem6;
import java.util.ArrayList;
import java.util.Random;

public class Problem6_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> gusu = new ArrayList<>();
        ArrayList<Integer> kisu = new ArrayList<>();
        while (true){
            int num = rand.nextInt(11);
            System.out.println("乱数：" + num);
            if (num == 0){
                break;
            } else if (num % 2 == 0){
                gusu.add(num);
            } else {
                kisu.add(num);
            }
        }
        System.out.print("偶数：");
        for (Integer g : gusu) {
            System.out.print(g + " ");
        }
        System.out.print("\n奇数：");
        for (Integer k : kisu) {
            System.out.print(k + " ");
        }
    }
}
