package exercises.problem5;
import java.util.*;

public class Problem5_2 {
	public static void main(String[] args){
		double[] d = new double[4];
		d[0] = 0.2;
		d[1] = -5.1;
		d[2] = 3.2;
		d[3] = 1.8;
		for (int i = 0; i < d.length; i++) {
			System.out.print("d[" + i + "]=" + d[i] + " ");
		}
	}
}
//実行結果
//d[0]=0.2 d[1]=-5.1 d[2]=3.2 d[3]=1.8
