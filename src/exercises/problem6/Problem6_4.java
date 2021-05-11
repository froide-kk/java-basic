package exercises.problem6;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6_4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<String> inputs = new ArrayList<>();
        while(true) {
            System.out.println("文字を入力：");
            String str = br.readLine();
            if (str.equals("")) {
                break;
            }
            inputs.add(str);
//            System.out.println(inputs);
        }
        for (int i = 0; i < inputs.size(); i++) {
            inputs.removeIf(name -> name.length() >= 5);
        }
        System.out.println("5文字未満の単語:" + inputs);
    }
}
//実行結果
//文字を入力：
//apple
//文字を入力：
//good
//文字を入力：
//pineapple
//文字を入力：
//big
//文字を入力：
//dog
//文字を入力：
//downtown
//文字を入力：
//girl
//文字を入力：
//
//5文字未満の単語:[good, big, dog, girl]