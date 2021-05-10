package exercises.problem4;
import java.util.Random;

public class Problem4_1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(10);
		System.out.println("数：" + num);
		int i;
		for (i = 1; i < num; i++) {
			System.out.print("■");
		}
	}
}

