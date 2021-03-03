package exercises.problem7;

public class Problem7_1 {
    public static void main(String[] args) {
        double a = 4.0;
        double b = 2.0;
        Calc c = new Calc();
        System.out.println(a + " + " + b + " = " + c.add(a, b));
        System.out.println(a + " - " + b + " = " + c.sub(a, b));
    }
}
