package exercises.problem2;

public class Problem2_5 {
    public static void main(String[] args){
        String temp = "こんばんわおはよう";
        String ex_temp = "こおはんばんようわ";

        String[] target = {"お","は","よ","う"};


        String ohayo1 = "";
        String ohayo2 = "";
        // tempを「おはよう」と「こんばんわ」に分割
        for(int i = 0; i < target.length; i++){
            int target_index = temp.indexOf(target[i]);
            ohayo1 += temp.charAt(target_index);
            temp = temp.replaceFirst(target[i],"");
        }
        System.out.println("ohayo１:" + ohayo1);
        System.out.println("temp: " + temp);

        String temp_kon = temp.replace("おはよう", "");
        System.out.println("おはようを一気にreplace: " + temp_kon);


        // ex_tempを「おはよう」と「こんばんわ」に分割
        for(int i = 0; i < target.length; i++){
            int target_index = ex_temp.indexOf(target[i]);
            ohayo2 += ex_temp.charAt(target_index);
            ex_temp = ex_temp.replaceFirst(target[i],"");
        }

        System.out.println("ohayo2: " + ohayo2);
        System.out.println("ex_temp: " + ex_temp);

    }
}


