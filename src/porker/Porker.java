package porker;

import java.io.IOException;
import java.util.ArrayList;

public class Porker {
    public static void main(String args[]){

        Hand my_hand = new Hand();
        Hand com_hand = new Hand();
        Deck deck = new Deck();
        DefRole role = new DefRole();

        System.out.println("ポーカースタート！");
        System.out.println("手札の交換は２回まで可能です。");

        //自分の初期手札
        my_hand.initHand(deck);
        my_hand.showHand(1);
        //相手の初期手札
        com_hand.initHand(deck);
        //com_hand.showHand(2);

        for(int i = 0; i < 2; i++) {
            try {
                //自分の手札交換
                my_hand.exchange(deck, 1);
                my_hand.showHand(1);
                //相手の手札交換
                com_hand.exchange(deck, 2);
                //com_hand.showHand(2);
            } catch (IOException e) {
                System.out.println("エラー");
            }
        }
        com_hand.showHand(2);
        //自分の役確認
        ArrayList<Integer> my_role = role.checkRole(my_hand);
        //相手の役確認
        ArrayList<Integer> com_role = role.checkRole(com_hand);
        //結果発表
        role.showResult(my_role, com_role);


    }
}
