package exercises.problem10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Convert repeated characters to numbers
 */
public class Problem10_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input:");
        String s = br.readLine();
        String[] str =  s.split("");
        System.out.print("Output:");


        int count = 1;
        for(int i=0;i<str.length;i++){
            if(i==str.length-1){
                if (Objects.equals(str[i], str[i - 1])) {
                    System.out.print(str[i]+count);
                }else{
                    System.out.print(count+str[i]);
                }
            }else if(Objects.equals(str[i], str[i+1])){
                count++;
            }else if(count==1){
                System.out.print(str[i]);
            }else{
                System.out.print(str[i]+count);
                count=1;
            }
        }
    }

    static String convertRepeatedCharactersToNumbers(String s) {
        return "";
    }
}
