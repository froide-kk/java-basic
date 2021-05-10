package exercises.problem4;
import java.util.Random;

public class Problem4_1 {
	public static void main(String[] args){
		Random rn = new Random();
		int num = rn.nextInt(10)+1;

		System.out.println("数:"+num);

		for(int i=0;i<num;i++){
			System.out.print("■ ");
		}

	}
}
