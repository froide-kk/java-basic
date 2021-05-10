package exercises.problem4;
import java.util.Random;

public class Problem4_2 {
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		System.out.println("数：" + num);
		String temp = "";
		int i = 0;
		while (i < num){
			temp += "■";
			i++;
		}
		System.out.println(temp);
	}
}
