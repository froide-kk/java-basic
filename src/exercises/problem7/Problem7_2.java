package exercises.problem7;

public class Problem7_2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        //  円の半径を設定
        c.r = 4.0;
        System.out.println("半径" + c.r +"の円の円周の長さは" + c.circumference());

        //  円の半径を設定
        c.r = 4.0;
        System.out.println("半径" + c.r +"の円の面積の長さは" + c.area());

    }
}
