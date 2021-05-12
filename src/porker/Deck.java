package porker;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<ArrayList<String>> deck_arr = new ArrayList<ArrayList<String>>();
    private String[] suits = {"H", "D", "S", "C"};

    Deck(){      //綺麗に並んだ配列を作って、シャッフルする。
        for(int i = 1; i <= 13; i++){
            for(int j = 0; j < 4; j++){
                ArrayList<String> card = new ArrayList<>();
                card.add(suits[j]);
                card.add(String.valueOf(i));
                deck_arr.add(card);
            }
        }
        Collections.shuffle(deck_arr);
    }

    /*public void showDeck(){    確認用
        System.out.println(deck_arr);
    }*/

    public ArrayList<String> draw(){     //配列の先頭を返して、先頭は削除する。
        ArrayList<String> drawn_card = deck_arr.get(0);
        deck_arr.remove(0);
        return drawn_card;
    }


}
