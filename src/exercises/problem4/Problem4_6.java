package exercises.problem4;
import java.util.Random;

public class Problem4_6 {
	public static void main(String[] args){
		Random rand = new Random();
		int num;
		int max = 0;
		int min = 10;
		for (int i = 0; i < 10; i++){
			num = rand.nextInt(10) + 1;
			System.out.println(num);
			if (num > max){
				max = num;
			}
			if (num < min){
				min = num;
			}
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}
}
