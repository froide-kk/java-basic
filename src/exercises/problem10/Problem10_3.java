package exercises.problem10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * Convert repeated characters to numbers
 */
public class Problem10_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        String text = "";
        String result = "";

            System.out.print("文字を入力：");
            String str = br.readLine();
            List<String> list = Arrays.asList(str.split(""));

            for (int i = 0; i < list.size(); i++) {
                if (result.equals(list.get(i))) {
                    count++;
                    if (i+1 == list.size()) {
                        text += count;
                    }
                    continue;
                }
                if (count > 1) {
                    text += count;
                    count = 1;
                }
                text += list.get(i);
                result = list.get(i);
            }
            System.out.print("Input："+str+"\n");
            System.out.print("Output："+text);

    }
}
