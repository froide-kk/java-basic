package exercises.problem3;
import java.util.Random;

public class Problem3_7 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(21) -10;
        System.out.println(num);
        if(num % 2 == 0 && num >= 0){
            System.out.println("正の偶数");
        }else if(num % 2 == 1 && num > 0){
            System.out.println("正の奇数");
        }else if(num % 2 == 0 && num < 0){
            System.out.println("負の偶数");
        }else{
            System.out.println("負の奇数");
        }
    }
}
