package exercises.problem5;

import java.util.Random;
import static java.lang.System.*;

public class Problem5_3 {
	public static void main(String[] args){
		int[] data = new int[10];
		String odd = "奇数: ";
		String even = "偶数: ";
		for(int i = 0; i < 10; i++){
			Random rand = new Random();
			int num = rand.nextInt(100) + 1;
			data[i] = num;
		}

		for(int data_num : data){
			out.printf("%d  ", data_num);

			if(data_num%2 == 0){
				even += (data_num + " ");
			}else{
				odd += (data_num + " ");
			}
		}
		out.println("");
		out.println(odd);
		out.println(even);
	}
}
