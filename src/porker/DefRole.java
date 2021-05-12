package porker;

import java.util.*;

public class DefRole extends CheckRole{
    private HashMap<Integer, String> role_name= new HashMap<>();
    private ArrayList<Integer> strength = new ArrayList<>();



    DefRole() {    //役判別用の数字と役名の対応
        role_name.put(0,"ノーペア");
        role_name.put(1,"ワンペア");
        role_name.put(2,"ツーペア");
        role_name.put(3,"スリーカード");
        role_name.put(4,"ストレート");
        role_name.put(5,"フラッシュ");
        role_name.put(6,"フルハウス");
        role_name.put(7,"フォーカード");
        role_name.put(8,"ストレートフラッシュ");
        role_name.put(9,"ロイヤルストレートフラッシュ");

        //数字の強さの判別よう
        Collections.addAll(strength, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1);
    }


    ArrayList<Integer> checkRole(Hand hand) {

        ArrayList<String> suits = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();

        for(ArrayList<String> ha: hand.getHand()) {  //スートと数字を分割して数字は並べ替え　　
            suits.add(ha.get(0));                    // スートの強弱をみる場合はポジションをキーにしたMapで対応可だと思います
            num.add(Integer.parseInt(ha.get(1)));
        }
        Collections.sort(num);

        ArrayList<Integer> flash = super.checkFlash(suits,num);
        ArrayList<Integer>  straight = super.checkStraight(num);
        ArrayList<Integer> pairs = super.checkSame(num);

        if(straight.get(0) != 0 && flash.get(0) != 0){ //役の判別。競合しない役に関しては順不同で判別しています。
            if(straight.get(0) == 2){
                flash.set(0, 9);
                return flash;
            }else{
                straight.set(0,8);
                return straight;
            }
        }else if(flash.get(0) != 0){
            flash.set(0,5);
            return flash;
        }else if(straight.get(0) != 0){
            straight.set(0,4);
            return straight;
        }else{
            return pairs;
        }

    }

   void showResult(ArrayList<Integer> my_role, ArrayList<Integer> com_role){ // 結果の表示
        int winner = 0;
        int status = 0; // status が０なら役で決定、１ならキッカーで決定
        int kicker = 0;
        System.out.println("自分：　" + role_name.get(my_role.get(0)));
        System.out.println("相手：　" + role_name.get(com_role.get(0)));

        if(my_role.get(0) > com_role.get(0)){
            winner = 1;
        }else if(my_role.get(0) < com_role.get(0)){
            winner = 2;
        }else{  //役が同じ場合の勝敗判決
            for(int i = 1; i < my_role.size(); i++) {
                int my_num = my_role.get(i);
                int com_num = com_role.get(i);
                if (strength.indexOf(my_num) > strength.indexOf(com_num)) {
                    status = 1;
                    winner = 1;
                    kicker = my_num;
                    break;
                } else if (strength.indexOf(my_num) < strength.indexOf(com_num)) {
                    winner = 2;
                    status = 1;
                    kicker = com_num;

                    break;
                }
            }
        }

        switch (winner) {
            case 0:  //キッカーが存在せず、スートの優劣もないロイヤルストレートフラッシュの時のみ発生
                System.out.println("DRAW");
                break;
            case 1:
                System.out.print("YOU WIN ");
                System.out.println((status == 1 ? "キッカー" + kicker + "!" : "!"));
                break;
            case 2:
                System.out.println("YOU LOSE");
                System.out.println((status == 1 ? "キッカー" + kicker + "!" : ""));
                break;
        }
        return;
    }



}