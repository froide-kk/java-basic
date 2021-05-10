package exercises.problem5;

import java.util.Random;

public class Problem5_3 {
	public static void main(String[] args){
		Random rand = new Random();
		int data[];
		data = new int[10];
		String result = "";
		String odd = "奇数 :";
		String even = "偶数 :";

		for (int i = 0; i < data.length; i++) {
			int num = rand.nextInt(100);
			if (num%2 == 0) {
				even += " "+num;
			}else{
				odd += " "+num;
			}
			//最後の文字の後ろに空白が入るのを防止
			if (i+1 == data.length){
				result += num;
			}else{
				result += num+" ";
			}
		}
		System.out.println(result);
		System.out.println(odd);
		System.out.println(even);
	}
}
