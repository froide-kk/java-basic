package exercises.problem6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem6_4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;
        ArrayList<String> strs = new ArrayList<>();
        while(true){
            System.out.print("文字を入力：");
            str = br.readLine();
            //System.out.println(str);
            if (str.isEmpty()){
                break;
            } else {
                strs.add(str);
            }
        }

        /*5文字以上の除去*/
        for (int i = 0; i < strs.size(); i++){
            if (strs.get(i).length() >= 5){
                strs.remove(i);
            }
        }

        System.out.print("5文字未満の単語：");
        for (String s : strs){
            System.out.print(s + " ");
        }

    }
}
