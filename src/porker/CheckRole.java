package porker;

import java.util.*;
//それぞれの役に値するかを判別するクラス　サブクラスで、最終的な役決定　返す値は、役に相当するかを決める数字、キッカーとなる数字（降順）　
// 引数は昇順で並び替え済み
public class CheckRole {
    private ArrayList<Integer> royalSt = new ArrayList<>();

    protected ArrayList<Integer> checkFlash(ArrayList<String> suits, ArrayList<Integer> num) {
        ArrayList<Integer> result = new ArrayList<>();
        String first_suit = suits.get(0);
        int status = 1;
        int kick;
        if(num.get(0) == 1){//  フラッシュのキッカーは１or最大の数字
            kick = 1;
        }else {
            kick =num.get(4);
        }
        for (String card : suits) { // 先頭のスートと違うものがでてきたらステータスを０にしてbreak
            if (!card.equals(first_suit)) {
                status = 0;
                break;
            }
        }
        Collections.addAll(result, status, kick);// ステータスとキッカーを配列にaddし終了
        return result;
    }

    protected ArrayList<Integer> checkStraight(ArrayList<Integer> nums){
        Collections.addAll(royalSt, 1,10,11,12,13); // この場合連続で判断できないため別途判断ようの配列を用意
        ArrayList<Integer> result = new ArrayList<>();
        int status = 1;
        int count = 0;
        int kick = nums.get(4);

        for (int i = 0; i < 5; i++ ){  //別途用意した分の判別
            if(nums.get(i) == royalSt.get(i)){
                count += 1;
            }
        }
        if(count == 5) {
            Collections.addAll(result, 2,1);
            return result;
        }    //ロイやスルトレートフラッシュの判別用に 返す値を変えている。

        for (int i = 0; i < 4; i++ ){// 連続していなかったらステータスを０に
            if(nums.get(i+1) != nums.get(i) +1){
                status = 0;
            }
        }
        Collections.addAll(result, status, kick);
        return result;
    }




    ArrayList<Integer> checkSame(ArrayList<Integer> list){ //同じカードの枚数を判別して役を振り分ける。
        int pairs = 0;
        int three = 0;
        int four = 0;
        ArrayList<Integer> kick = new ArrayList<>();
        for(int i = 0; i<list.size();){  //
            int count = 0;
            int target = list.get(i);
            for(int j = i; j < list.size();j++){
                if(target == list.get(j)){ //同じ数が何連続しているかをcountに代入
                    count++;
                }
            }
            if(count == 2){  //countの数に応じてそれぞれの値をインクリメント 、キッカーのlistにadd
                pairs+=1;
                kick.add(0, list.get(i));
            }else if(count == 3){
                three+=1;
                kick.add(0, (list.get(i)));  // 数字が昇順であること、より連続数が多いほどキッカーとしての優先度が高いことから、先頭にadd
            }else if(count == 4){
                four+=1;
                kick.add(0,list.get(i));  // フォーカードの場合他はないので先頭で良い
            }
            i+=count;

        }

        int kick_length = kick.size();
        for (int i = 5; i > 0;i-- ){   //ペア数やトリオ数の合計値が不明のため、１枚のカードはここで別途キッカーのlistにadd
            if(kick.contains(list.get(i-1)) == false){
                if(list.get(i-1) == 1){  //１は最強なので最初に置く
                    kick.add(kick_length,1);
                }else {
                    kick.add(list.get(i-1));
                }
            }
        }

        if(four != 0){     //同一の枚数に応じてreturn,setしている値はあとで役の強弱を判断するためのもの。
            kick.add(0,7);
            return kick;
        }else if(three != 0){
            if(pairs == 1){
                kick.add(0,6);
                return kick;
            }else{
                kick.add(0,3);
                return kick;
            }
        }else if(pairs != 0 ){
            kick.add(0,pairs);
            return kick;
        }else{
            kick.add(0,0);
            return kick;
        }
    }

}
