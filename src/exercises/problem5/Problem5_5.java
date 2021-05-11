package exercises.problem5;

import java.util.Random;

public class Problem5_5 {
	public static void main(String[] args){
		int[] num = new int[5];
		Random rand = new Random();
		int big = 0;
		int small = 0;
		int zero = 0;

		for(int i = 0; i < num.length; i++){
			num[i] = rand.nextInt(20) - 10;
			System.out.print(num[i] + " ");
		}
		System.out.println("\n");

		for(int j = 0; j < num.length; j++){
			if(num[j] > 0){
				big += 1;
			}else if(num[j] < 0){
				small +=1;
			}else {
				zero += 1;
			}
		}
		System.out.println("0より大きい数：" + big + "個");
		System.out.println("0より小さい数：" + small + "個");
		System.out.println("0の個数：" + zero + "個");
	}
}
