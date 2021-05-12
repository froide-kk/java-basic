package exercises.problem4;

import java.util.Random;

public class Problem4_5 {
	public static void main(String[] args){
		Random rn = new Random();

		double sum=0;
		for(int i=0;i<10;i++){
			int num = rn.nextInt(10)+1;
			System.out.println(num);
			sum +=num;
		}
		System.out.println(sum/10);
	}
}
