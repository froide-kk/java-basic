package exercises.problem10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 最大公約数
 */
public class Problem10_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[2];
        int[] num = new int[2];
        boolean judge = false;

        /* 数値入力 */
        for (int i = 0; i < 2; i++) {
            while (!judge) {
                System.out.print("自然数（" + (i+1) +"つ目）を指定：");
                str[i] = br.readLine();
                try {
                    num[i] = Integer.parseInt(str[i]);
                    judge = true;
                } catch (NumberFormatException e) {
                    System.out.println("半角数字を入力してください");
                }
            }
            judge = false; //フラグ初期化
        }

        Euclid euclid = new Euclid();
        System.out.println("最大公約数は " + euclid.calc(num[0], num[1]));

    }
}
