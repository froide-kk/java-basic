package exercises.problem10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 最大公約数
 */
public class Problem10_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        //  コンソールから文字列の読み込み
        while (true){
            int operand1 = 0;
            System.out.print("文字を入力：");
            String str = br.readLine();
            list.add(Integer.parseInt(str));
            if (list.size()==2) {
                while (true){
                    operand1=list.get(0) % list.get(1);
                    if (operand1 == 0){
                        System.out.print("最大公約数: "+list.get(1)+"\n");
                        break;
                    }
                    list.set(0,list.get(1));
                    list.set(1,operand1);
                }
            }

        }
    }
}
