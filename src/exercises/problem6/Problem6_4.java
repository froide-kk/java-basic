package exercises.problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem6_4 {
    public static void main(String[] args) throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            ArrayList<String> moji = new ArrayList<>();
            String result = "";

            while (true) {
                System.out.print("文字を入力：");
                String str = br.readLine();
                if (str.length() == 0){
                    break;
                }
                moji.add(str);
                System.out.println(str);
            }

            for (int i = 0; i < moji.size(); i++) {
                if (moji.get(i).length() < 5){
                    result += moji.get(i) + " ";
                }
            }
            System.out.print("\n5文字未満の単語：" + result);
    }
}

