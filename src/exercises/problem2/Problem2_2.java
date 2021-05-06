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
//        実行結果
//        a = 3
//        b = 1
//        c = 9
//        d = 2
//        e = 1

//        Question
        System.out.println("a = " + (a + 2));
        System.out.println("b = " + (b - 1));
        System.out.println("c = " + (c * 3));
        System.out.println("d = " + (d / 2));
        System.out.println("e = " + (e % 2));
//        実行結果
//        a = 3
//        b = 1
//        c = 9
//        d = 2
//        e = 1
    }
}
