package exercises.problem4;

import java.util.Random;

public class Problem4_6 {
	public static void main(String[] args){
		Random rn = new Random();

		int min = rn.nextInt(10)+1;
		System.out.println(min);
		int max = min;

		for(int i=1;i<10;i++){
			int num = rn.nextInt(10)+1;
			System.out.println(num);
			if(num>max){
				max = num;
			}else if(num<min){
				min = num;
			}
		}
		System.out.println("最大値:"+max+"最小値:"+min);
	}
}
