package exercises.problem2;

import java.util.Objects;

public class Problem2_5 {
    public static void main(String[] args){
        String temp = "こんばんわおはよう";
        String ex_temp = "こおはんばんようわ";
        // tempを「おはよう」と「こんばんわ」に分割
        int start = temp.indexOf("こ");
        int end = temp.indexOf("わ");
        System.out.println(temp.substring(start,end+1));
        System.out.println(temp.substring(end+1,temp.length()));

        // ex_tempを「おはよう」と「こんばんわ」に分割
        String a = "こんばんわ";
        String b = "おはよう";


        String[] c = new String[5];
        c = a.split("");

        String[] d = new String[4];
        d = b.split("");

        String[] e = new String[9];
        e = ex_temp.split("");

        String num;

        for(int i=0;i<ex_temp.length();i++){
            for(int j=0;j<a.length();j++){
                if(e[j] c[i]){
                    System.out.print(e[j]);
                }
            }
        }

        System.out.println();
    }
}
