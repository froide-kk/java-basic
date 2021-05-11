package exercises.problem2;

import java.util.HashSet;

public class rensyu {
    public static void main(String[] args){
        String com1 = "CoMpare";
        String com2 = "compare";

        String result1 = (com1.compareTo(com2) == 0 ? "一致しました" : "不一致") ;
        String result2 = (com1.compareToIgnoreCase(com2) == 0 ? "一致しました" : "不一致") ;

        System.out.println("大文字小文字判別ありで" + result1);
        System.out.println("大文字小文字判別なしで" + result2);

        HashSet<String> books = new HashSet<>();
        books.add("不思議の国のアリス");
        books.add("ヘンゼル");
        books.add("銀河鉄道");

        for(String book:books){
            System.out.println(book);
        }

    }
}