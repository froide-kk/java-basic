package exercises.problem2;

public class Problem2_5 {
    public static void main(String[] args){
        String temp = "こんばんわおはよう";
        String ex_temp = "こおはんばんようわ";
        // tempを「おはよう」と「こんばんわ」に分割
        String ohayo1 = temp.substring(5, 9);
        String konbanwa1 = temp.substring(0, 5);

        // ex_tempを「おはよう」と「こんばんわ」に分割
        String ohayo2 = ex_temp.substring(1, 3) + ex_temp.substring(6, 8);
        String konbanwa2 = ex_temp.charAt(0) + ex_temp.substring(3, 6) + ex_temp.charAt(8);

        String ohayo3 = ex_temp.replace("こ", "").replace("んばん", "").replace("わ", "");
        String konbanwa3 = ex_temp.replace("おは", "").replace("よう", "");

        String ohayo4 =  "";
        String konbanwa4 = "";
        String dummy;
        for(int i=0; i<ex_temp.length(); i++){
            dummy = "";
            dummy += ex_temp.charAt(i);
            if (dummy.equals("お") || dummy.equals("は") || dummy.equals("よ") || dummy.equals("う")){
                ohayo4 += dummy;
            } else {
                konbanwa4 += dummy;
            }
        }

        System.out.println(ohayo1 + "\n" + konbanwa1);
        System.out.println(ohayo2 + "\n" + konbanwa2);
        System.out.println(ohayo3 + "\n" + konbanwa3);
        System.out.println(ohayo4 + "\n" + konbanwa4);
    }
}
