package exercises.problem2;

public class Problem2_5 {
    public static void main(String[] args){
        String temp = "こんばんわおはよう";
        String ex_temp = "こおはんばんようわ";
        // tempを「おはよう」と「こんばんわ」に分割
        String evening = temp.substring(0,5);
        String morning = temp.substring(5);
        // ex_tempを「おはよう」と「こんばんわ」に分割
        String konbanwa = ex_temp.replace("こおはんばんよう","こんばん");
        String ohayo = ex_temp.replaceAll("[あ-ん]+","おはよう");

        System.out.println(morning);
        System.out.println(evening);
        System.out.println(ohayo);
        System.out.println(konbanwa);
    }
}

