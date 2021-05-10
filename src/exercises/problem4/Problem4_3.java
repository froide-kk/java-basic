package exercises.problem4;

import java.util.Random;

public class Problem4_3 {
	public static void main(String[] args){
		Random rn = new Random();
		int num = rn.nextInt(10)+1;

		System.out.println("数:"+num);
		int i = 0;

		do{
			System.out.print("■ ");
			i++;
		}while(i<num);
	}
}
