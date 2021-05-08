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
        String night = "こんばんわ";
        String morning = "おはよう";

        System.out.println("------challenge------");


        String[] night_arr = new String[5];
        night_arr = night.split("");

        String[] morning_arr = new String[4];
        morning_arr = morning.split("");

        String[] ex_temp_arr = new String[9];
        ex_temp_arr = ex_temp.split("");


        //こんばんわ抜き出し
        for(int i=0;i<night.length();i++){
            for(int j=0;j<ex_temp.length();j++){
                if(ex_temp_arr[j].equals(night_arr[i])){
                    System.out.print(ex_temp_arr[j]);
                    break;
                }
            }
        }

        //改行
        System.out.println();

        //おはよう抜き出し
        for(int i=0;i<morning.length();i++){
            for(int j=0;j<ex_temp.length();j++){
                if(ex_temp_arr[j].equals(morning_arr[i])){
                    System.out.print(ex_temp_arr[j]);
                    break;
                }
            }
        }

    }
}
