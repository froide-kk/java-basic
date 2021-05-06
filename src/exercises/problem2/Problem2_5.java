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
        // ex_tempを「おはよう」と「こんばんわ」に分割
        String correct1 = ex_temp.replace("おは", "");
        String correct2 = correct1.replace("よう","");
        String correct3 = ex_temp.replace("こ","");
        String correct4 = correct3.replace("んばん","");
        String correct5 = correct4.replace("わ","");

        System.out.println(correct5);
        System.out.println(correct2);
    }
}
