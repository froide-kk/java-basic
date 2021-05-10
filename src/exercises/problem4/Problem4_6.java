package exercises.problem4;

import java.util.Random;

public class Problem4_6 {
	public static void main(String[] args){
		Random rand = new Random();
		int max = 0;
		int min = 10;
		for (int i = 0; i < 10; i++) {
			int num = rand.nextInt(10);
			System.out.println(num);
			if (max < num){
				max = num;
			}else if (min > num){
				min = num;
			}

		}
		System.out.println(max);
		System.out.println(min);
	}
}
