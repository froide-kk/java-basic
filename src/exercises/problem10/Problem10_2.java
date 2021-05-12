package exercises.problem10;
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 最大公約数
 */
public class Problem10_2 {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<Integer>();

//        100回まで打ち間違いok
        for(int j = 0; j < 100; j++) {
            int i = 1;
            try {
                while (i < 3) {
                    System.out.println("自然数(" + i + "つ目)を指定：");
                    String str = br.readLine();
                    int num = Integer.parseInt(str);
                    System.out.println(num);
                    i++;
                    arr.add(num);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("自然数を指定して下さい");
            }
        }
        System.out.println(arr);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);
        int big = arr.get(0);
        int small = arr.get(1);
        int div = big % small;
        System.out.println(div);

        while(div != 0) {
            big = small;
            small = div;
            return;
        }

//        System.out.println(small);
//        ここまで
        
        System.out.println("あああああ");
    }
}

