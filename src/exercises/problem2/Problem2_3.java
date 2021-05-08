package exercises.problem2;

public class Problem2_3 {
    public static void main(String[] args){
        int x = 3;
        int y = 7;
        // ここでxとyの値を入れ替える
        int n = x;
        x = y;
        y = n;
        System.out.println( "x=" + x + ",y=" + y );
    }
}
