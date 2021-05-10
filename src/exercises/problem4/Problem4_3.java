package exercises.problem4;

import java.util.Random;

public class Problem4_3 {
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(10);
		int i = 0;
		System.out.println(num);
		String tmp = "";
		if (num>0){
			do {
				tmp += "■";
				i++;
			}while (i<num);
		}
		System.out.println(tmp);
	}
}
