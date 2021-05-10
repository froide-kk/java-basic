package exercises.problem5;

import java.util.Random;

public class Problem5_4 {
	public static void main(String[] args){
		Random rand = new Random();
		int randomNumber[];
		randomNumber = new int[5];
		int avg = 0;
		int sum = 0;
		String above ="平均値より大きい数:";
		String below ="平均値より小さい数:";

		String result = "";
		for (int i = 0; i < randomNumber.length; i++) {
			int num = rand.nextInt(10);
			//配列に代入
			randomNumber[i] = num;

			//文字列を作成
			if (i+1 == randomNumber.length){
				result += num;
			}else{
				result += num+" ";
			}

			//合計を作成
			sum += num;
		}

		//平均を作成
		avg = sum / randomNumber.length;

		for (int j = 0; j <randomNumber.length; j++) {
			if (randomNumber[j] > avg) {
				above += randomNumber[j]+" ";
			} else if(randomNumber[j] < avg){
				below += randomNumber[j]+" ";
			}
		}

		System.out.println(avg);
		System.out.println(result);
		System.out.println(above);
		System.out.println(below);
	}
}
