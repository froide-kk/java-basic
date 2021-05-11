package exercises.problem4;

public class Problem4_8 {
	public static void main(String[] args){
		for(int i = 0; i < 10; i++) {
			String square = "";
			for(int j = 0; j < 10; j++) {
				if(j == i) {
					square += "□";
				} else {
					square += "■";
				}
			}
			System.out.println(square);
		}
	}
}
//□■■■■■■■■■
//■□■■■■■■■■
//■■□■■■■■■■
//■■■□■■■■■■
//■■■■□■■■■■
//■■■■■□■■■■
//■■■■■■□■■■
//■■■■■■■□■■
//■■■■■■■■□■
//■■■■■■■■■□
