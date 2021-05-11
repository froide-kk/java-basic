package exercises.problem4;

public class Problem4_8 {
	public static void main(String[] args){
		String square;
		for(int i = 1; i <= 10; i++){
			square="";
			for(int j =1; j <= 10; j++){
				if(i == j){
					square +="□";
				}else{
					square +="■";
				}
			}
			System.out.println(square);
		}
	}
}
