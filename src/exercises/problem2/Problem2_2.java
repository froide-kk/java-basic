package exercises.problem2;

public class Problem2_2 {
    public static void main(String[] args){
        int a = 1, b = 2, c = 3, d = 4, e = 5;
        System.out.println("a = " + (a += 2));
        System.out.println("b = " + (b -= 1));
        System.out.println("c = " + (c *= 3));
        System.out.println("d = " + (d /= 2));
        System.out.println("e = " + (e %= 2));
    }
}
