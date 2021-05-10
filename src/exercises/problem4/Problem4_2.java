package exercises.problem4;

import java.util.Random;

public class Problem4_2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(10);
		System.out.println("数：" + num);
		int i = 0;
		while (i < num) {
			System.out.print("■");
			i++;
		}
	}
}

