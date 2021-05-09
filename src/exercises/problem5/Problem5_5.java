package exercises.problem5;

import java.util.ArrayList;
import java.util.Random;

public class Problem5_5 {
	public static void main(String[] args){
		System.out.println("配列で実行");
		//配列の場合
		int arr_Count = random_num_count();
		int arr[] = new int[arr_Count];
		int over = 0;
		int under = 0;
		int zero = 0;

		for(int i = 0; i < arr.length; i++){
			arr[i] = random_num();
			System.out.print(arr[i] + " ");
			if(arr[i] == 0){
				zero++;
			}else if(arr[i] > 0){
				over++;
			}else{
				under++;
			}
		}
		System.out.println();
		System.out.println("0より大きい数:" + over);
		System.out.println("0より小さい数:" + under);
		System.out.println("0の数:" + zero);

		System.out.println("ArrayListで実行");
		//ArrayListの場合
		over = 0;
		under = 0;
		zero = 0;
		ArrayList<Integer> col = new ArrayList<>();
		int col_count = random_num_count();
		for(int i = 0; i < col_count; i++){
			col.add(random_num());
		}
		for(int col_num : col){
			System.out.print(col_num + " ");
			if(col_num == 0){
				zero++;
			}else if(col_num > 0){
				over++;
			}else{
				under++;
			}
		}
		System.out.println();
		System.out.println("0より大きい数:" + over);
		System.out.println("0より小さい数:" + under);
		System.out.println("0の数:" + zero);
	}
	private static int random_num_count() {
		Random rand = new Random();
		int num = rand.nextInt(10);
		System.out.println("exportnumcount:" + num);
		return num;
	}

	private static int random_num() {
		Random rand = new Random();
		int num = rand.nextInt(20) - 10;
		//System.out.println("exportnum:" + num);
		return num;
	}
}
