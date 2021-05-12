package exercises.problem4;

import java.util.Random;

public class Problem4_8 {
	public static void main(String[] args){
		Random rn = new Random();
		int num = rn.nextInt(10)+1;

		System.out.println(num);

		 for(int j=0;j<num;j++) {
			 for (int i = 0; i < num; i++) {
				 if (i == j) {
					 System.out.print("□ ");
					 i++;
					 if(i==num){
					 	break;
					 }
				 }
				 System.out.print("■ ");
			 }
			 System.out.println();
		 }
	}
}
