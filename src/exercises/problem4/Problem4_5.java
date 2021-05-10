package exercises.problem4;
import java.util.Random;

public class Problem4_5 {
	public static void main(String[] args) {
		Random rand = new Random();
		float sum = 0;
		int num;
		for (int i = 0; i < 10; i++) {
			num = rand.nextInt(10) + 1;
			System.out.println(num);
			sum += num;
		}
		System.out.println(sum / 10);
	}
}
//実行結果
//9
//7
//4
//9
//5
//4
//2
//6
//9
//7
//6.2
