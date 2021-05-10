package exercises.problem5;

import java.util.Random;

public class Problem5_1 {
	public static void main(String[] args){
		Random rand = new Random();
		int arr[];
		arr = new int[7];
		String tmp = "";

		for (int i = 0; i < arr.length; i++) {
			int num = rand.nextInt(10);
			arr[i] = num;
			System.out.println(arr[i]);

			//最後の文字の後ろに空白が入るのを防止
			if (i+1 == 7){
				tmp += "arr["+i+"]="+num;
			}else{
				tmp += "arr["+i+"]="+num+" ";
			}
		}
		System.out.println(tmp);
	}
}
