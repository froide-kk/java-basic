package exercises.problem4;

public class Problem4_7 {
	public static void main(String[] args){
		for (int i = 1; i <= 9; i++){
			for (int j = 1; j <= 9; j++){
				System.out.print(String.format("%3d", i*j) + " ");
			}
			System.out.print("\n");
		}
	}
}
