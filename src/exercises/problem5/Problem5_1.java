package exercises.problem5;

import java.util.Random;

public class Problem5_1 {
	public static void main(String[] args){
		int[] arr;
		arr = new int[7];
		for (int i = 0; i < arr.length; i++){
			Random rand = new Random();
			int num = rand.nextInt(10);

			System.out.print(" arr[" + i + "]" + "=" + num);
		}
	}
}
