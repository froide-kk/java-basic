package chapters.ch01;

public class Calculator {
	public static void main(String[] args) {
		/* 計算をする */
		int a = 1;
		int b = 2;
		for(int i = a; i<10; i++){
			int c = i + b;
			System.out.printf("%d + 2 = %d\n", i,c);
		}
		 // cは3になる
		/* 計算した結果を表示する */

	}
}
