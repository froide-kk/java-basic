package exercises.problem10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 最大公約数
 */
public class Problem10_2 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("自然数(一つ目)を指定：");
        int natural1 = Integer.parseInt(br.readLine());
        System.out.print("自然数(２つ目)を指定：");
        int natural2 = Integer.parseInt(br.readLine());

        int i=2;
        while(true){
            if(natural1%i==0&&natural2%i==0){
                System.out.println("最大公約数は"+i);
                break;
            }
            i++;
        }



    }
}
