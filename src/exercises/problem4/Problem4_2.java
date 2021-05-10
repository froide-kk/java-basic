package exercises.problem4;

import java.util.Random;

public class Problem4_2 {
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		System.out.println(num);

		String squares = "";
		int i = 0;
		while(i<num){
			squares += "■️";
			i++;
		}

		System.out.println(squares);
	}
}
