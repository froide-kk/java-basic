package exercises.problem4;

import java.util.Random;

public class Problem4_1 {
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(11);
		System.out.println(num);
		String tmp = "";
		for (int i = 0; i < num; i++) {
			tmp += "■";
		}
		System.out.println(tmp);
	}
}
