package exercises.problem10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Convert repeated characters to numbers
 */
public class Problem10_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input: ");
        String s = br.readLine();
        String output = convertRepeatedCharactersToNumbers(s);
        System.out.println("Output: " + output);
    }

    static String convertRepeatedCharactersToNumbers(String s) {
        if(s.length() == 0) return "";

        int count = 1;
        String output = "";
        List<String> splitted_s = new ArrayList<String>(Arrays.asList(s.split("")));

        for(int i = 0; i < splitted_s.size(); ){

            if(i == splitted_s.size()-1) {
                if(count != 1) splitted_s.add(String.valueOf(count));
                break;
            }

            String target = splitted_s.get(i);
            String next = splitted_s.get(i+1);

           if(target.equals(next)){
               count+=1;
               splitted_s.remove(i);
           }else{
               if(count!=1) splitted_s.add(i+1, String.valueOf(count));
               count = 1;
               i++;
           }
        }

        for(int i = 0; i < splitted_s.size(); i++){
            output += splitted_s.get(i);
        }

        return output;
    }
}
