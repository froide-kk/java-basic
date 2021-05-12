package exercises.problem5;

import java.util.Random;

public class Problem5_4 {
	public static void main(String[] args){
		Random rand = new Random();
		int[] date = new int[5];
		int sum = 0;
		int avg = 0;
		String big = "";
		String small = "";

		for(int i = 0; i < date.length; i++){
			date[i] = rand.nextInt(11);
			System.out.print(date[i] + " ");
		}
		System.out.println();
		System.out.println();
		for(int j = 0; j < date.length; j++){
			sum += date[j];
		}
		avg = (sum / date.length);

		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + avg);
		System.out.println();
		for(int k = 0; k < date.length; k++){
			if(avg < date[k]){
				big += date[k] + " ";
			}else{
				small += date[k] + " ";
			}
		}
		System.out.println("平均値より大きい数：" + big);
		System.out.println("平均値より小さい数：" + small);
	}
}
