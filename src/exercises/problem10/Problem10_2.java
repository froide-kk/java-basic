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

    }


//        while (i < 3) {
//            System.out.println("自然数(" + i + "つ目)を指定：");
//            String str = br.readLine();
//            int num = Integer.parseInt(str);
//            try {
//                System.out.println(num);
//                i++;
//                arr.add(num);
//            } catch (NumberFormatException e) {
//                System.out.println("自然数を指定して下さい");
//            }
//        }

//        System.out.println(arr);
//        二つ入力した後で数値の判定




//        余りで割る数を割る
//        もし1つ目(a)>2つ目(b)の場合
//        a % b = c;
//        b % c = d;
//        c % d = e;
//        e = 0になった時のd


}
