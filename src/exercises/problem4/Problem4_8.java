package exercises.problem4;

public class Problem4_8 {
	public static void main(String[] args){
		String temp;

		for(int i = 1; i <= 10; i++){
			temp="";
			for(int j =1; j <= 10; j++){
				if(i == j){
					temp +="□";
				}else{
					temp +="■";
				}
			}
			System.out.println(temp);
		}
	}
}
