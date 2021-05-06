package exercises.problem2;

public class Problem2_2 {
    public static void main(String[] args){
        int a = 1, b = 2, c = 3, d = 4, e = 5;
        a += 2;
        b -= 1;
        c *= 3;
        d /= 2;
        e %= 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}

//Question
//再帰代入演算子を使わず表示時に四則演算だけ行った表示した場合どうなりますか。
//Ans... " + "が文字列連結演算子として機能し、演算は行われずに数値が連結して表示される。