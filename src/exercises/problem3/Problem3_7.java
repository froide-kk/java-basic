package exercises.problem3;
import java.util.Random;

public class Problem3_7 {
    public static void main(String[] args){
        Random rnd = new Random();
        int num = rnd.nextInt(20)-10;

        System.out.println(num);
        if(num>0&&num%2==0){
            System.out.println("正の偶数");
        }else if(num>0&&num%2!=0){
            System.out.println("正の奇数");
        }else if(num<0&&num%2==0){
            System.out.println("負の偶数");
        }else if(num<0&&num%2!=0) {
            System.out.println("負の奇数");
        }
    }
}
