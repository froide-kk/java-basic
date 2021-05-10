package exercises.problem4;
import static java.lang.System.*;

public class Problem4_7 {
	public static void main(String[] args){

		for(int i = 1; i <= 9; i++){
			int kuku = 0;
			for(int j = 1; j <= 9; j++){
				kuku = i*j;
				out.printf("%d  ", kuku);
			}
			out.println("");
		}
	}
}
