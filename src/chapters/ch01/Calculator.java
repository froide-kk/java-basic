package chapters.ch01;

public class Calculator {
	public static void main(String[] args) {
		/* 計算をする */
		int a = 1;
		int b = 2;
		int c = a - b; // cは-1になる
		int d = c + a;
		/* 計算した結果を表示する */
		System.out.println("1 - 2 + 1 = " + d);
	}
}
