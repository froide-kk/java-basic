package exercises.problem4;

import java.util.Random;

public class Problem4_4 {
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(30);
		System.out.println(num);
		int i;
		for(i = 3; i < num; i++){
			if(i % 3 == 0){
				System.out.println(i);
			}
		}
	}
}
