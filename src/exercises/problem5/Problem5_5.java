package exercises.problem5;

import java.util.Random;

public class Problem5_5 {
	public static void main(String[] args){
		Random rand = new Random();
		int randomNumber[];
		randomNumber = new int[5];
		String result = "";
		int positive = 0;
		int negative = 0;
		int zero = 0;

		for (int i = 0; i < randomNumber.length; i++) {
			int num = rand.nextInt(20) -10;
			//配列に代入
			randomNumber[i] = num;
			//文字列を作成
			if (i+1 == randomNumber.length){
				result += num;
			}else{
				result += num+" ";
			}

			if (num>0) {
				positive++;
			}else if (num<0) {
				negative++;
			}else{
				zero++;
			}
		}

		System.out.println(result);
		System.out.println("0より大きい数： "+positive);
		System.out.println("0より小さい数： "+negative);
		System.out.println("0の個数： "+zero);
	}
}
