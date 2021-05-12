package exercises.problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problem6_5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        HashMap<String,String> japanese = new HashMap<>();

        japanese.put("cat","猫");
        japanese.put("dog","犬");
        japanese.put("bird","鳥");
        japanese.put("tiger","トラ");

        while (true){
            System.out.print("英語で動物の名前を入力してください：");
            String str = br.readLine();
            System.out.println(str);
            if(japanese.get(str) == null){
                System.out.println("対応するデータは登録されていません。");
            }else {
                System.out.println(japanese.get(str));
            }
        }

    }
}

