package exercises.problem10;
import static java.lang.System.*;

/**
 * FizzBuzz
 */
public class Problem10_1 {
    public static void main(String[] args){
        for(int i = 1; i <= 30; i++){
            if(i % 3 == 0){

                if(i % 5 == 0){
                    out.printf("FizzBuzz ");
                }else{
                    out.printf("Fizz ");
                }

            }else if(i % 5 == 0){
                out.printf("Buzz ");
            }else{
                out.printf("%d ",i);
            }
        }
    }
}
