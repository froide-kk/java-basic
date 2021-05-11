package exercises.problem5;

import java.util.Random;

public class Problem5_1 {
	public static void main(String[] args){

		int[] arr = new int[7];

		for(int i = 0; i < 7; i++){
			Random rand = new Random();
			int num = rand.nextInt(10) + 1;
			arr[i] = num;
			System.out.printf("arr[%d]=%d  ", i, arr[i]);
		}

	}
}
