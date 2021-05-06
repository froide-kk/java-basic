package exercises.problem2;

public class Problem2_5 {
    public static void main(String[] args){
        String temp = "こんばんわおはよう";
        String ex_temp = "こおはんばんようわ";
        // tempを「おはよう」と「こんばんわ」に分割
        String morning_temp = temp.replace("こんばんわ","");
        String afternoon_temp = temp.replace("おはよう","");
        String morning_ex_temp = "";
        String afternoon_ex_temp = "";

        // ex_tempを「おはよう」と「こんばんわ」に分割
        String[] list = ex_temp.split("");
        list.toString();

        for (int i = 0; i <ex_temp.length() ; i++) {
            System.out.println(list[i] == "お");
        }
        System.out.println(morning_temp);
        System.out.println(afternoon_temp);
        System.out.println(morning_ex_temp);
        System.out.println(afternoon_ex_temp);

    }
}
