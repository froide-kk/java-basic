package exercises.problem5;

import java.util.Random;

public class Problem5_4 {
	public static void main(String[] args){
		int[] arr = new int[5];
		Random rn = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i] = rn.nextInt(10)+1;
		}
		for(int i:arr){
			System.out.print(i+" ");
		}
		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		System.out.println();
		System.out.println("合計値："+sum+"平均値："+(sum/arr.length));

		for(int i=0;i<arr.length;i++) {
			if (i == 0) {
				System.out.print("平均値より大きい数：");
			}
			if (arr[i] > (sum / arr.length)) {

				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if (i == 0) {
				System.out.print("平均値より小さい数：");
			}
			if (arr[i] < (sum / arr.length)) {

				System.out.print(arr[i] + " ");
			}
		}
	}
}
