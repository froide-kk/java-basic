package exercises.problem6;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;

public class Problem6_4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        ArrayList<String> str_list = new ArrayList<>();
        //  コンソールから文字列の読み込み
        while (true) {
            System.out.print("文字を入力：");
            String str = br.readLine();
            System.out.println(str);
            if (str.length() == 0) break;

            str_list.add(str);
        }
        out.printf("5文字未満の単語: ");
        for(int i = 0; i < str_list.size();i++){
            if (str_list.get(i).length() < 5){
                out.printf("%s ", str_list.get(i));
            }
        }
/*
        out.printf("5文字未満の単語: ");
        for(String str: str_list){
            out.printf("%s ", str);
        }*/



    }
}
