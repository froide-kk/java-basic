package exercises.problem10;

/**
 * FizzBuzz
 */
public class Problem10_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
//実行結果
//1
//2
//Fizz
//4
//Buzz
//Fizz
//7
//8
//Fizz
//Buzz
//11
//Fizz
//13
//14
//FizzBuzz
//16
//17
//Fizz
//19
//Buzz
//Fizz
//22
//23
//Fizz
//Buzz
//26
//Fizz
//28
//29
//FizzBuzz
