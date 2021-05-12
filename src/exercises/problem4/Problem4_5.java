package exercises.problem4;

import java.util.Random;

public class Problem4_5 {
	public static void main(String[] args){
		Random rand = new Random();
		double result = 0;
		for (int i = 0; i < 10; i++) {
			int num = rand.nextInt(11);
			System.out.println(num);
			result += num;
		}
		System.out.println(result/10);
	}
}
