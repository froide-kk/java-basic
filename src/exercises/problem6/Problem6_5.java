package exercises.problem6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problem6_5 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;
        HashMap<String, String> animals = new HashMap<>();
        animals.put("cat", "猫");
        animals.put("dog", "犬");
        animals.put("bird", "鳥");
        animals.put("tiger", "トラ");

        System.out.print("英語で動物の名前を入力してください：");
        str = br.readLine();
        //System.out.println(str);
        if (animals.get(str) == null){
            System.out.println("対応するデータは登録されていません。");
        } else {
            System.out.println("「" + animals.get(str) + "」です。");
        }
    }
}
