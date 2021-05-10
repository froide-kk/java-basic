package exercises.problem6;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6_5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        HashMap<String,String> pair = new HashMap<>();

        System.out.println("英語で動物の名前を入力してください：");
        String str = br.readLine();
        pair.put("cat","猫");
        pair.put("dog","犬");
        pair.put("bird","鳥");
        pair.put("tiger","トラ");

        if (str.equals("cat")) {
            System.out.println("「" + pair.get("cat") + "」です。");
        } else if (str.equals("dog")) {
            System.out.println("「" + pair.get("dog") + "」です。");
        } else if (str.equals("bird")) {
            System.out.println("「" + pair.get("bird") + "」です。");
        } else if (str.equals("tiger")) {
            System.out.println("「" + pair.get("tiger") + "」です。");
        } else {
            System.out.println("対応するデータは登録されていません。");
        }
    }
}
//実行結果
//英語で動物の名前を入力してください：
//「猫」です。
//英語で動物の名前を入力してください：
//対応するデータは登録されていません。