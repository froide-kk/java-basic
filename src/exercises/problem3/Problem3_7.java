package exercises.problem3;

import java.util.Random;

public class Problem3_7 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(11) ;
        int sign = rand.nextInt(2) ;
        num = (sign == 0) ? -num : num;
        System.out.println(num);

        String sign_str = ( num<0 ) ? "負の" : "正の";
        String Evenness = (num%2 == 0) ? "偶数": "奇数";

        System.out.println(sign_str + Evenness);
    }
}
