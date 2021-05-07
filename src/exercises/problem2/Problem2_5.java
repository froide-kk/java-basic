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
        for (int i = 0; i <ex_temp.length() ; i++) {
            if (Problem2_5.morningWord(list[i])){
                morning_ex_temp += list[i];
            } else {
                afternoon_ex_temp += list[i];
            }
        }
        System.out.println(morning_temp);
        System.out.println(afternoon_temp);
        System.out.println(morning_ex_temp);
        System.out.println(afternoon_ex_temp);
    }

    static boolean morningWord (String value) {
        if (value.equals("お") || value.equals("は") || value.equals("よ") || value.equals("う")) {
            return true;
        }else {
            return false;
        }
    }
}
