package exercises.problem4;
import java.util.Random;

public class Problem4_3 {
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		String square = "";
		System.out.println("数:" + num);

		int i = 0;
		do {
			square += "■";
			i++;
		} while (i < num);
		System.out.println(square);
	}
}
//実行結果
//数:10
//■■■■■■■■■■