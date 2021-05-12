package exercises.problem4;
import java.util.Random;

public class Problem4_2 {
	public static void main(String[] args){
		Random rn = new Random();
		int num = rn.nextInt(10)+1;

		System.out.println("数:"+num);
		int i = 0;

		while(i<num){
			System.out.print("■　");
			i++;
		}
	}

}
