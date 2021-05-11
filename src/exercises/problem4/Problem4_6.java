package exercises.problem4;
import java.util.Random;

public class Problem4_6 {
	public static void main(String[] args){
		Random rand = new Random();
		int num;
		int min = 10;
		int max = 0;
		for(int i = 0; i < 10; i++) {
			num = rand.nextInt(10) + 1;
			System.out.println(num);
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		System.out.println("最小値："+ min);
		System.out.println("最大値："+ max);
	}
}
//実行結果
//5
//5
//1
//8
//10
//4
//9
//6
//4
//8
//最小値：1
//最大値：10