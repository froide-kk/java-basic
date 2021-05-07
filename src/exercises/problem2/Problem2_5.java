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

        System.out.println("------challenge------");


        String[] c = new String[5];
        c = a.split("");

        String[] d = new String[4];
        d = b.split("");

        String[] e = new String[9];
        e = ex_temp.split("");


        //こんばんわ抜き出し
        for(int i=0;i<a.length();i++){
            for(int j=0;j<ex_temp.length();j++){
                if(e[j].equals(c[i])){
                    System.out.print(e[j]);
                    break;
                }
            }
        }

        //改行
        System.out.println();

        //おはよう抜き出し
        for(int i=0;i<b.length();i++){
            for(int j=0;j<ex_temp.length();j++){
                if(e[j].equals(d[i])){
                    System.out.print(e[j]);
                    break;
                }
            }
        }

        System.out.println();
    }
}
