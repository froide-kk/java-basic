package exercises.problem5;

public class Problem5_2 {
	public static void main(String[] args){

		double d[];
		d = new double[4];

		String result = "";

		//入力を受け取る
		String input = "0.2,-5.1,3.2,1.8";
		String[] inputArr = input.split(",");

		for (int i = 0; i < d.length; i++) {
			//最後の文字の後ろに空白が入るのを防止
			if (i+1 == d.length){
				result += "d["+i+"}="+inputArr[i];
			}else{
				result += "d["+i+"}="+inputArr[i]+" ";
			}
		}
		System.out.println(result);
	}
}
