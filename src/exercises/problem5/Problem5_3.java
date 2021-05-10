package exercises.problem5;
import java.util.ArrayList;
import java.util.Random;

public class Problem5_3 {
	public static void main(String[] args){
		int[] arr = new int[10];
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			Random rand = new Random();
			int num = rand.nextInt(100) + 1;
			arr[i] = num;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}
		System.out.println("\n" +  "奇数:" + odd);
		System.out.println("偶数:" + even);
	}
}
//実行結果
//90 96 74 96 89 8 78 94 15 7
//奇数:[89, 15, 7]
//偶数:[90, 96, 74, 96, 8, 78, 94]
