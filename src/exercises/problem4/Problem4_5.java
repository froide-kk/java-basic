package exercises.problem4;

import java.util.Random;
import static java.lang.System.*;

public class Problem4_5 {
	public static void main(String[] args){

		int sum = 0;
		for(int i = 0; i < 10; i++){
			Random rand = new Random();
			int num = rand.nextInt(10) + 1;
			out.printf("%d ", num);
			sum +=num;
		}

		double avg = sum/10;
		out.println("");
		out.println("avg: " + avg);
	}
}
