package exercises.problem5;
import java.util.Random;

public class Problem5_5 {
	public static void main(String[] args){
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			Random rand = new Random();
			int num = rand.nextInt(21) - 10;
			arr[i] = num;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count1++;
			} else if (arr[i] < 0) {
				count2++;
			} else {
				count3++;
			}
		}
		System.out.println("\n0より大きい数：" + count1);
		System.out.println("0より小さい数：" + count2);
		System.out.println("0の個数：" + count3);
	}
}
//実行結果
//4 0 -5 1 -9
//0より大きい数：2
//0より小さい数：2
//0の個数：1