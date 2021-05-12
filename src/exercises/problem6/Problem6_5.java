package exercises.problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problem6_5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        HashMap<String,String> translation = new HashMap<>();

        translation.put("cat","猫");
        translation.put("dog","犬");
        translation.put("bird","鳥");
        translation.put("tiger","トラ");

        while (true) {
            System.out.print("文字を入力：");
            String str = br.readLine().toLowerCase();
            if (translation.get(str) == null) {
                System.out.println("対応するデータは登録されていません。");
            }else{
                System.out.println(translation.get(str));
            }
        }
    }
}
