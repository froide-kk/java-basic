package chapters.ch01;

public class Calculator
{
	public static void main(String[] args) {
		/* 計算をする */
		int a = 3;// aを3に変更
		int b = 2;
		int c = a + b; // cは3になる
		/* 計算した結果を表示する */
		System.out.println("3 + 2 = " + c);//aの変更に対応して表示値も変更
	}
}
