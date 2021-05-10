package exercises.problem5;

import java.util.Random;

public class Problem5_5 {
	public static void main(String[] args){
		int[] arr = new int[5];
		Random rn = new Random();


		for(int i=0;i<arr.length;i++){
			arr[i] = rn.nextInt(20)-10;
		}
		for(int i: arr){
			System.out.print(i+" ");
		}
		System.out.println();

		int maxcount = 0;
		int mincount = 0;
		int zerocount = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				maxcount++;
			}
			if(arr[i]<0){
				mincount++;
			}
			if(arr[i]==0){
				zerocount++;
			}
		}
		System.out.println("0より大きい数："+maxcount+"個");
		System.out.println("0より小さい数："+mincount+"個");
		System.out.println("0の個数："+zerocount+"個");


	}
}
