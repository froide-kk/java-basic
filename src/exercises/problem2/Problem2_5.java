package exercises.problem2;

public class Problem2_5 {
    public static void main(String[] args){
        String temp = "こんばんわおはよう";
        String ex_temp = "こおはんばんようわ";
        // tempを「おはよう」と「こんばんわ」に分割
        String evening = temp.substring(0,5);
        String morning = temp.substring(5);
        // ex_tempを「おはよう」と「こんばんわ」に分割
        String ohayo1 = ex_temp.substring(1,3);
        String ohayo2 = ex_temp.substring(6,8);
        String ohayo = ohayo1 + ohayo2;

        String konbanwa1 = ex_temp.substring(0,1);
        String konbanwa2 = ex_temp.substring(3,6);
        String konbanwa3 = ex_temp.substring(8);
        String konbanwa = konbanwa1 + konbanwa2 + konbanwa3;


        System.out.println(morning);
        System.out.println(evening);
        System.out.println(ohayo);
        System.out.println(konbanwa);
    }
}