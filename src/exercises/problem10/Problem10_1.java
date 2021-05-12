package exercises.problem10;

/**
 * FizzBuzz
 */
public class Problem10_1 {
    public static void main(String[] args){
        for (int i = 1; i <= 30; i++){
            if (i % (3*5) == 0){
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0){
                System.out.print("Fizz ");
            } else if (i % 5 == 0){
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
