package exercises.problem2;

public class Problem2_5 {
    public static void main(String[] args){
        String temp = "こんばんわおはよう";
        String ex_temp = "こおはんばんようわ";
        // tempを「おはよう」と「こんばんわ」に分割
        String middle1 = temp.substring(0, 5);
        String middle2 = temp.substring(5, 9);
        System.out.println(middle2);
        System.out.println(middle1);
//        実行結果
//        おはよう
//        こんばんは

        // ex_tempを「おはよう」と「こんばんわ」に分割①
        String correct1 = ex_temp.replace("おは", "");
        String correct2 = correct1.replace("よう","");
        String correct3 = ex_temp.replace("こ","");
        String correct4 = correct3.replace("んばん","");
        String correct5 = correct4.replace("わ","");
        System.out.println(correct5);
        System.out.println(correct2);
//        実行結果
//        おはよう
//        こんばんは

        // ex_tempを「おはよう」と「こんばんわ」に分割②
        String correct6 = ex_temp.substring(1, 3);
        String correct7 = ex_temp.substring(6, 8);
        System.out.println(correct6 + correct7);
        String correct8 = ex_temp.substring(0, 1);
        String correct9 = ex_temp.substring(3, 6);
        String correct10 = ex_temp.substring(8, 9);
        System.out.println(correct8 + correct9 + correct10);
//        実行結果
//        おはよう
//        こんばんは
    }
}
