package exercises.problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //  コンソールから文字列の読み込み
        System.out.print("文字を入力：");
        String str = br.readLine();
        System.out.println(str);
    }
}
