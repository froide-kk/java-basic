package exercises.problem10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Convert repeated characters to numbers
 */
public class Problem10_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            System.out.print("Input: ");
            s = br.readLine();
            if(s.matches("^[A-Za-z]+$")){ //入力文字が英字ならループを抜ける
                break;
            }
            System.out.println("半角英数字のみ入力してください");
        }
        s = convertRepeatedCharactersToNumbers(s);
        System.out.print("Output: " + s);
    }

    static String convertRepeatedCharactersToNumbers(String s) {
        String[] sArray = s.split("");
        String str = "";
        //System.out.print(sArray[0]);
        int count = 1; // 同文字が連続した回数

        for (int i = 0; i < sArray.length-1; i++){
            if(sArray[i].equals(sArray[i+1])){ //１文字次と同じだったらcount+1
                count += 1;
            } else { // 違うなら挿入文字決定
                if(count > 1){ // 連続文字がある場合
                    str += sArray[i] + count;
                } else { // 連続文字がない場合
                    str += sArray[i];
                }
                count = 1;
            }
        }
        if(count > 1){
            str += sArray[sArray.length-1] + count;
        } else {
            str += sArray[sArray.length-1];
        }
        //System.out.print(str);
        return str;
    }
}
