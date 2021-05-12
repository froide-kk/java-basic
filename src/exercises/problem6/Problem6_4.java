package exercises.problem6;
import java.io.*;
import java.util.ArrayList;

public class Problem6_4 {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<String> list = new ArrayList<>();

        String result = "";

        while (true) {
            System.out.print("文字を入力：");
            String str = br.readLine();
            if (str.equals("")) {
                break;
            }
            list.add(str);
            System.out.println(str);
        }

        for (String item : list){
             result += item.length() < 5 ? item + " " : "";
        }
        System.out.print(result);
    }
}
