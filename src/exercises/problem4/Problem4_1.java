package exercises.problem4;

import java.util.Random;

public class Problem4_1 {
	public static void main(String[] args){
		int x = random_num();
		for(int i = 1; i <= x; i++){
			for(int j= 1; j <= x; j++) {
				if(i == j){
					System.out.print("□");
				}else{
					System.out.print("■");
				}
			}
			System.out.println();
		}
	}

	private static int random_num() {
		Random rand = new Random();
		int num = rand.nextInt(10);
		System.out.println("exportnum:" + num);
		return num;
	}
}
