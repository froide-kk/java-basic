package exercises.problem2;

public class Problem2_5 {
    public static void main(String[] args){
        String temp = "こんばんわおはよう";
        String ex_temp = "こおはんばんようわ";
        // tempを「おはよう」と「こんばんわ」に分割
        String morning = temp.replace("こんばんわ","");
        String evening = temp.replace("おはよう","");
        // ex_tempを「おはよう」と「こんばんわ」に分割
        String ex_morning = ex_temp.replace("こ","");
        ex_morning = ex_morning.replace("ん","");
        ex_morning = ex_morning.replace("ば","");
        ex_morning = ex_morning.replace("わ","");

        String ex_evening = ex_temp.replace("お","");
        ex_evening = ex_evening.replace("は","");
        ex_evening = ex_evening.replace("よ","");
        ex_evening = ex_evening.replace("う","");

        System.out.println("ans1 " + morning);
        System.out.println("ans2 " + evening);

        System.out.println("ex_ans1 " + ex_morning);
        System.out.println("ex_ans2 " + ex_evening);

    }
}
