package exercises.problem4;
import java.util.Random;

public class Problem4_1 {
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		String square = "";
		System.out.println("数:" + num);

		for(int i = 0; i < num; i++) {
			square += "■";
		}
		System.out.println(square);
	}
}
//実行結果
//数:6
//■■■■■■
