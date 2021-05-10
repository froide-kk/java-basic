package exercises.problem4;

import static java.lang.System.out;

public class Problem4_8 {
	public static void main(String[] args){

		for(int i = 0; i < 9; i++){
			String squares = "";
			for(int j = 0; j < 9; j++) {
				if (j == i) {
					squares += "□️";
				} else {
					squares += "■️";
				}
			}
			out.println(squares);
		}
	}
}
