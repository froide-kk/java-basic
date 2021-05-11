package exercises.problem5;
import java.util.Random;

public class Problem5_4 {
	public static void main(String[] args){
		int[] data = new int[5];
		Random rand = new Random();
		for (int i = 0; i < data.length; i++){
			data[i] = rand.nextInt(10) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println("\n");

		int sum = 0;
		for (int j = 0; j < data.length; j++){
			sum += data[j];
		}
		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + (sum/5));

		String big = "";
		String small = "";
		for (int k = 0; k < data.length; k++){
			if ((sum/data.length) < data[k]){
				big += data[k] + " ";
			} else if (data[k] < (sum/data.length)){
				small += data[k] + " ";
			}
		}
		System.out.println("\n平均値より大きい値：" + big);
		System.out.println("平均値より小さい値：" + small);
	}
}
