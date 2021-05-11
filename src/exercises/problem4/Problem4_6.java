package exercises.problem4;

import java.util.Random;

public class Problem4_6 {
	public static void main(String[] args){
		Random rand = new Random();
		int max = 0;
		int min = 0;
		int num;
		for(int i = 1; i < 10; i++){
			num = rand.nextInt(10) + 1;
			System.out.println(num);
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		System.out.println("最大値　" + max);
		System.out.println("最小値　" + min);
	}
}
