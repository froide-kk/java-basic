package exercises.problem4;

import java.util.Random;

public class Problem4_2 {
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(11);
		int i = 0;
		System.out.println(num);
		String tmp = "";
		while (i<num){
			tmp += "■";
			i++;
		}
		System.out.println(tmp);
	}
}
