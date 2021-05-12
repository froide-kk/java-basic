package exercises.problem10;

/**
 * FizzBuzz
 */
public class Problem10_1 {
    public static void main(String[] args){
        for(int i=1;i<=30;i++){
            if(i%3==0&&i%5==0){
                System.out.print(i+" FizzBuzz ");
            }else if(i%3==0){
                System.out.print(i+ " Fizz ");
            }else if(i%5==0){
                System.out.print(i+" Buzz ");
            }
        }
    }
}
