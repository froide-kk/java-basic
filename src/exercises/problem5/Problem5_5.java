package exercises.problem5;

import java.util.Random;
import static java.lang.System.*;

public class Problem5_5 {
	public static void main(String[] args){
		int[] arr = new int[5];
		int over_zero = 0;
		int under_zero = 0;
		int zero = 0;

		for(int i = 0; i < arr.length; i++){
			Random rand = new Random();
			int num = rand.nextInt(11) ;
			int sign = rand.nextInt(2) ;
			num = (sign == 0) ? -num : num;
			arr[i] = num;
			out.printf("%d  ", arr[i]);
		}

		for(int arr_num: arr){
			if(arr_num > 0){
				over_zero += 1;
			}else if(arr_num < 0){
				under_zero += 1;
			}else{
				zero += 1;
			}
		}

		out.println();
		out.printf("0より大きい数: %d個\n", over_zero);
		out.printf("0より小さい数: %d個\n", under_zero);
		out.printf("0の個数: %d個\n", zero);


	}
}
