package exercises.problem10;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 最大公約数
 */
public class Problem10_2 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("自然数(1つ目)を指定 :");
        int num1 = Integer.parseInt(br.readLine());
        System.out.print("自然数(2つ目)を指定 :");
        int num2 = Integer.parseInt(br.readLine());

        out.printf("%d, %d", num1, num2);

        int first = (num1 > num2) ? num1 : num2;
        int second = (num1 > num2) ? num2 : num1;
        int ans = 0;

        while (true) {
            int surplus = first % second;
            if (surplus == 0) {
                ans = second;
                break;
            } else {
                first = second;
                second = surplus;
            }
        }

        out.printf("最大公約数は %d", ans);

    }
}
