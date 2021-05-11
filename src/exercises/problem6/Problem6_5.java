package exercises.problem6;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;

public class Problem6_5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        HashMap<String,String> animals = new HashMap<>();
        animals.put("cat","猫");
        animals.put("dog","犬");
        animals.put("bird","鳥");
        animals.put("tiger","虎");

        System.out.print("英語で動物の名前を入力してください：");
        String str = br.readLine();

        if(animals.containsKey(str)){
            out.printf("「%s」です", animals.get(str));
        }else{
            out.printf("対応するデータは登録されていません。");
        }





    }
}
