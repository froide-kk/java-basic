package exercises.problem6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class Problem6_4 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while(true){
            System.out.print("文字を入力：");
            String str = br.readLine();
            if(str.equals("")){
                break;
            }
            arr.add(str);
        }

        System.out.print("5文字未満の単語：");
        for(int i=0;i<arr.size();i++){
            String box = arr.get(i);
            if(box.length()<=5){
                System.out.print(box+" ");
            }else{
                arr.remove(i);
            }
        }

    }
}
