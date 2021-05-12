package porker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hand {
    private ArrayList<ArrayList<String>> hand_arr = new ArrayList<>();
    private HashMap<String, String> suits_name = new HashMap<>();

    Hand(){  //  手札表示用のマップ作成
        suits_name.put("D", "♦︎");
        suits_name.put("S", "♠︎");
        suits_name.put("C", "♣︎");
        suits_name.put("H", "❤︎");
    }

    public void initHand(Deck deck){  //初期手札として５枚ドローする
        for(int i = 0; i < 5; i++){
            ArrayList<String> card = deck.draw();
            hand_arr.add(card);

        }
    }

    public ArrayList<ArrayList<String>> getHand (){   //手札の中身を返す。
        return hand_arr;
    }

    public void showHand(int status){ //　手札の表示　
        switch (status){
            case 1:
                System.out.println("自分の手札");
                break;
            case 2:
                System.out.println("相手の手札");
                break;
        }
        int card_count = 1;
        for(ArrayList<String> hand : hand_arr){
            System.out.printf("%d枚目: %s の　%s\n", card_count, suits_name.get(hand.get(0)), hand.get(1));
            card_count++;
        }
        //System.out.println(hand_arr);
    }

    public void exchange(Deck deck, int status) throws IOException {  //手札の交換
        ArrayList<String> position = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        ArrayList<String> card_place_arr = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        switch (status) {   //自分の交換とコンピュータの交換で挙動が異なるため　switchを使用
            case 1:
                input: while (true) {  // 正常な値が入力されるまでのwhile
                    card_place_arr.clear();
                    System.out.println("何枚目を交換しますか？　空白区切りで1~5の半角数字を入力し、交換しない場合は０を入力してください。");
                    System.out.print("入力してください：　");
                    String card_place = br.readLine();

                    if (card_place.equals("0")) {  // 0が入力された場合にスキップ
                        System.out.println("交換をスキップします。");
                        return;
                    }


                    String[] tmp_arr = card_place.split(" ");
                    for (String s : tmp_arr) {
                        if(position.contains(s) == false) {
                            System.out.println("※不正な入力： もう一度入力してください。");
                            continue input;  //入力が1〜５でない時にwhileの先頭まで戻る。　二重ループになっているのでラベル使用
                        }else {
                            card_place_arr.add(s);
                        }
                    }
                    break;
                }
                 break;


            case 2:// コンピューター側
                Random rand = new Random();  //1~5の配列をシャッフルし、５までのランダムでどの位置を交換するか決定
                int num = rand.nextInt(6);
                if (num == 5) return;
                Collections.shuffle(position);
                for(int i = 0; i < num; i++){
                    card_place_arr.add(position.get(i));
                }
                //System.out.println(card_place_arr);
                break;


        }

        for(int i = 0; i < card_place_arr.size(); i++){
            int selected_card_position = Integer.parseInt(card_place_arr.get(i)) - 1;
            hand_arr.remove(selected_card_position);
            ArrayList<String> new_card = deck.draw();  //カードの位置を記憶、カードを消去したのち同じ場所に引いてきたカードを挿入。
            hand_arr.add(selected_card_position, new_card);
        }
    }

}
