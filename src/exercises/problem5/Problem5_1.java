package exercises.problem5;
import java.util.*;

public class Problem5_1 {
	public static void main(String[] args){
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			Random rand = new Random();
			int num = rand.nextInt(10) + 1;
			arr[i] = num;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=" + arr[i] + " ");
		}
	}
}
//実行結果
//arr[0]=8 arr[1]=5 arr[2]=7 arr[3]=1 arr[4]=8 arr[5]=3 arr[6]=7