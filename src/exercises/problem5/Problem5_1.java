package exercises.problem5;

import java.util.Random;

public class Problem5_1 {
	public static void main(String[] args){
		int[] arr = new int[7];
		Random rn = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i] = rn.nextInt(10)+1;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print("arr["+i+"]="+arr[i]+" ");
		}

	}
}
