package exercises.problem5;
import java.util.Random;

public class Problem5_1 {
	public static void main(String[] args){
		Random rand = new Random();
		int[] arr;
		arr = new int[7];
		for (int i = 0; i < arr.length; i++){
			arr[i] = rand.nextInt(10) + 1;
			System.out.print("arr[" + i + "]=" + arr[i] + " ");
		}
	}
}
