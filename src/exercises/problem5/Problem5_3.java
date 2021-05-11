package exercises.problem5;

import java.util.Random;

public class Problem5_3 {
	public static void main(String[] args){
		Random rand = new Random();
		int[] date = new int[10];
		String odd = "";
		String even = "";

		for(int i = 0; i < date.length; i++){
			date[i] = rand.nextInt(100);
			System.out.print(date[i] + " ");
		}

		System.out.println();
		System.out.println();

		for(int j = 0; j < date.length; j++){
			if(date[j] % 2 == 0){
				odd += (date[j] + " ");
			}else {
				even += (date[j] + " ");
			}
		}
		System.out.print("偶数：" + odd);
		System.out.println();
		System.out.print("奇数：" + even);
	}
}
