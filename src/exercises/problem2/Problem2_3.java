package exercises.problem2;

public class Problem2_3 {
    public static void main(String[] args){
        int x = 3;
        int y = 7;
        // ここでxとyの値を入れ替える
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println( "x=" + x + ",y=" + y );
    }
}
