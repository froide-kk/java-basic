package exercises.problem5;
import java.util.Random;

public class Problem5_3 {
	public static void main(String[] args){
		Random rand = new Random();
		String kisu = "";
		String gusu = "";
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++){
			data[i] = rand.nextInt(100) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		for(int j = 0; j < data.length; j++){
			if (data[j] % 2 == 0){
				gusu += (data[j] + " ");
			} else {
				kisu += (data[j] + " ");
			}
		}
		System.out.println("奇数：" + kisu);
		System.out.println("偶数：" + gusu);
	}
}
