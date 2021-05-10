package exercises.problem4;

import java.util.Random;

import static java.lang.System.out;

public class Problem4_6 {
	public static void main(String[] args){

		int min = 0;
		int max = 0;
		for(int i = 0; i < 10; i++){
			Random rand = new Random();
			int num = rand.nextInt(10) + 1;
			out.printf("%d ", num);
			if(i == 0){
				min = num;
				max = num;
			}else{
				min = (num < min) ? num : min;
				max = (max < num) ? num : max;
			}
		}

		out.println("");
		out.printf("min: %d, max: %d", min, max);
	}
}
