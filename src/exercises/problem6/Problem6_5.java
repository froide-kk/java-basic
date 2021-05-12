package exercises.problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problem6_5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        HashMap<String,String> map = new HashMap();

        map.put("cat","猫");
        map.put("dog","犬");
        map.put("bird","鳥");
        map.put("tiger","トラ");

        System.out.print("英語で動物の名前を入力してください：");
        String str = br.readLine();

        if(map.containsKey(str)){
            System.out.println("「"+map.get(str)+"」です。");
        }else {
            System.out.println("対応するデータは登録されていません");
        }

    }
}
