package exercises.problem5;
import java.util.Random;

public class Problem5_5 {
	public static void main(String[] args){
		Random rand = new Random();
		int[] data = new int[5];
		//challenge問題
		//int num = rand.nextInt(10)+1;
		//int[] data = new int[num];
		for (int i = 0; i < data.length; i++){
			data[i] = rand.nextInt(21) - 10;
			System.out.print(data[i] + " ");
		}

		int count_big = 0;
		int count_small = 0;
		int count_zero = 0;
		for (int j = 0; j < data.length; j++){
			if (0 < data[j]){
				count_big += 1;
			} else if (data[j] < 0){
				count_small += 1;
			} else {
				count_zero += 1;
			}
		}
		System.out.println("\n\n0より大きい数：" + count_big + "個");
		System.out.println("0より小さい数：" + count_small + "個");
		System.out.println("0の個数：" + count_zero + "個");
	}
}
