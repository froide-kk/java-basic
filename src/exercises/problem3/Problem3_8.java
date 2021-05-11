package exercises.problem3;

import java.util.Random;

public class Problem3_8 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        System.out.println("点数:" + num);

        String eval ;
        if(num>=80) {
            eval = "優";
        }else if(num>=70){
            eval = "良";
        }else if(num>=60){
            eval = "可";
        }else{
            eval = "不可";
        }

        System.out.println(eval);
    }
}
