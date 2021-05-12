package exercises.problem4;

public class Problem4_8 {
	public static void main(String[] args){
		String tmp = "";
		for (int i = 0; i < 10; i++) {
			tmp = "";
			for (int j = 0; j < 10; j++) {
				if (j == i) {
					tmp += "□";
					continue;
				}
				tmp += "■";
			}
			System.out.println(tmp);
		}
	}
}
