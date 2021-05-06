package exercises.problem2;

public class Problem2_4 {
    public static void main(String[] args){
        String temp = "こんにちわ、今日は良い天気ですね";
        // 最後の5文字を取得
        String middle = temp.substring(11, 16);
        System.out.println(middle);
//        実行結果
//        天気ですね

//        Challenge
        System.out.println(temp.substring(temp.length() -5));
//        実行結果
//        天気ですね
    }
}
