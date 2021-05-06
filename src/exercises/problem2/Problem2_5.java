package exercises.problem2;

public class Problem2_5 {
    public static void main(String[] args){
        String temp = "こんばんわおはよう";
        String ex_temp = "こおはんばんようわ";
        // tempを「おはよう」と「こんばんわ」に分割
        String temp1 = temp.substring(5, 9);
        String temp2 = temp.substring(0, 5);

        // ex_tempを「おはよう」と「こんばんわ」に分割
        String ex_temp1 = ex_temp.substring(1, 3) + ex_temp.substring(6, 8);
        String ex_temp2 = ex_temp.charAt(0) + ex_temp.substring(3, 6) + ex_temp.charAt(8);

        String ex_temp3 = ex_temp.replace("こ", "").replace("んばん", "").replace("わ", "");
        String ex_temp4 = ex_temp.replace("おは", "").replace("よう", "");

        System.out.println(temp1 + "\n" + temp2);
        System.out.println(ex_temp1 + "\n" + ex_temp2);
        System.out.println(ex_temp3 + "\n" + ex_temp4);
    }
}
