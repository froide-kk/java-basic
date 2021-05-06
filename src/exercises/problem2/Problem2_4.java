package exercises.problem2;

public class Problem2_4 {
    public static void main(String[] args){
        String temp = "こんにちわ、今日は良い天気ですね";
        // 最後の5文字を取得
        System.out.println(temp.substring(temp.length()-5,temp.length()));
    }
}
