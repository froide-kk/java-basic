package exercises.problem4;

import java.util.Random;

public class Problem4_1 {
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		System.out.println(num);

		String squares = "";
		for(int i = 0; i<num; i++){
			squares += "■️";
		}

		System.out.println(squares);
	}
}
