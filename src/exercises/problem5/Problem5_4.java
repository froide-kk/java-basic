package exercises.problem5;

import java.util.Random;
import static java.lang.System.*;


public class Problem5_4 {
	public static void main(String[] args){
		int[] arr = new int[5];
		int sum = 0;
		double avg = 0;
		String over_avg ="平均値より大きい数: ";
		String under_avg ="平均値より小さい数: ";
		for(int i = 0; i < 5; i++){
			Random rand = new Random();
			int num = rand.nextInt(5) + 1;
			arr[i] = num;
			System.out.printf("%d  ", arr[i]);
			sum += arr[i];
		}

		avg = sum/(double)arr.length;

		for(int arr_num: arr){
			if(arr_num > avg){
				over_avg += (arr_num + " ");
			}else{
				under_avg += (arr_num + " ");
			}
		}

		out.println();
		out.println("合計値: " + sum);
		out.println("平均値: " + avg);
		out.println(over_avg);
		out.println(under_avg);


	}
}
