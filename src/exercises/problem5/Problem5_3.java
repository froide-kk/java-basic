package exercises.problem5;

import java.util.Random;

public class Problem5_3 {
	public static void main(String[] args){
		int[] data = new int[10];
		Random rn = new Random();
		for(int i=0;i<data.length;i++) {
			data[i] = rn.nextInt(100) + 1;
		}
		for(int i: data){
			System.out.print(i+" ");
		}

		System.out.println();


		for(int i=0;i<data.length;i++) {
			if (i == 0) {
				System.out.print("奇数:");
			}
			if (data[i] % 2 != 0) {
				System.out.print(data[i] + " ");
			}
		}
		for(int i=0;i<data.length;i++) {
			if (i == 0) {
				System.out.print("偶数:");
			}
			if (data[i] % 2 == 0) {
				System.out.print(data[i] + " ");
			}
		}

	}
}
