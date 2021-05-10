package exercises.problem4;

import java.util.Random;

public class Problem4_3 {
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		System.out.println(num);

		String squares = "";
		int i = 0;
		do {
			squares += "■️";
			i++;
		}while(i<num);

		System.out.println(squares);
	}
}
