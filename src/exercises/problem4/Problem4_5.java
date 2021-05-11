package exercises.problem4;

import java.util.Random;

public class Problem4_5 {
	public static void main(String[] args){
		Random rand = new Random();
		int sum = 0;
		int num;
		for(int i = 0; i < 10 ; i++) {
			num = rand.nextInt(10) + 1;
			System.out.println(num);
			sum += num;
		}
		System.out.println("平均値　" + sum / 10);
	}
}
