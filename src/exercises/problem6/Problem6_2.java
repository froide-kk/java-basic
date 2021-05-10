package exercises.problem6;
import java.util.ArrayList;
import java.util.Random;

public class Problem6_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> data = new ArrayList<>();
        while (true) {
            int num = rand.nextInt(11);
            System.out.println("乱数：" + num);
            if (num == 0){
                break;
            } else {
                data.add(num);
            }
        }
        System.out.println();
        for (int i = data.size()-1; i >= 0; i--){
            System.out.print(data.get(i) + " ");
        }
    }
}
