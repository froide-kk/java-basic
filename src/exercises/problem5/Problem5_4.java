package exercises.problem5;
import java.util.ArrayList;
import java.util.Random;

public class Problem5_4 {
	public static void main(String[] args){
		int[] arr = new int[5];
		ArrayList<Integer> big = new ArrayList<>();
		ArrayList<Integer> small = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			Random rand = new Random();
			int num = rand.nextInt(10) + 1;
			arr[i] = num;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		float ave = sum /arr.length;
		System.out.print("\n合計値:" + sum);
		System.out.print("\n平均値:" + ave);
		for(int i = 0; i < arr.length; i++) {
			if(ave < arr[i]) {
				big.add(arr[i]);
			} else if (ave > arr[i]) {
				small.add(arr[i]);
			}
		}
		System.out.print("\n平均値より大きい数:" + big);
		System.out.print("\n平均値より小さい数:" + small);
	}
}
//実行結果
//1 2 10 2 8
//合計値:23
//平均値:4.0
//平均値より大きい数:[10, 8]
//平均値より小さい数:[1, 2, 2]