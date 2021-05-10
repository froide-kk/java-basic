package exercises.problem6;
import java.util.ArrayList;
import java.util.Random;

public class Problem6_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr0 = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr4 = new ArrayList<>();
        ArrayList<Integer> arr5 = new ArrayList<>();
        ArrayList<Integer> arr6 = new ArrayList<>();
        ArrayList<Integer> arr7 = new ArrayList<>();
        ArrayList<Integer> arr8 = new ArrayList<>();
        ArrayList<Integer> arr9 = new ArrayList<>();

        Random rand = new Random();
        int num;
        while (true) {
            num = rand.nextInt(101);
            System.out.println("乱数:" + num);
            if (num == 0) {
                break;
            }
            arr.add(num);
        }
        for (int i = 0; i < arr.size(); i++) {
            switch (arr.get(i) % 10) {
                case 0:
                    arr0.add(arr.get(i));
                    break;
                case 1:
                    arr1.add(arr.get(i));
                    break;
                case 2:
                    arr2.add(arr.get(i));
                    break;
                case 3:
                    arr3.add(arr.get(i));
                    break;
                case 4:
                    arr4.add(arr.get(i));
                    break;
                case 5:
                    arr5.add(arr.get(i));
                    break;
                case 6:
                    arr6.add(arr.get(i));
                    break;
                case 7:
                    arr7.add(arr.get(i));
                    break;
                case 8:
                    arr8.add(arr.get(i));
                    break;
                case 9:
                    arr9.add(arr.get(i));
                    break;
            }
        }
        if(arr0.size() == 0) {
            System.out.println("一の位が0:" + "なし");
        } else {
            System.out.println("一の位が0:" + arr0);
        }
        if(arr1.size() == 0) {
            System.out.println("一の位が1:" + "なし");
        } else {
            System.out.println("一の位が1:" + arr1);
        }
        if(arr2.size() == 0) {
            System.out.println("一の位が2:" + "なし");
        } else {
            System.out.println("一の位が2:" + arr2);
        }
        if(arr3.size() == 0) {
            System.out.println("一の位が3:" + "なし");
        } else {
            System.out.println("一の位が3:" + arr3);
        }
        if(arr4.size() == 0) {
            System.out.println("一の位が4:" + "なし");
        } else {
            System.out.println("一の位が4:" + arr4);
        }
        if(arr5.size() == 0) {
            System.out.println("一の位が5:" + "なし");
        } else {
            System.out.println("一の位が5:" + arr5);
        }
        if(arr6.size() == 0) {
            System.out.println("一の位が6:" + "なし");
        } else {
            System.out.println("一の位が6:" + arr6);
        }
        if(arr7.size() == 0) {
            System.out.println("一の位が7:" + "なし");
        } else {
            System.out.println("一の位が7:" + arr7);
        }
        if(arr8.size() == 0) {
            System.out.println("一の位が8:" + "なし");
        } else {
            System.out.println("一の位が8:" + arr8);
        }
        if(arr9.size() == 0) {
            System.out.println("一の位が9:" + "なし");
        } else {
            System.out.println("一の位が9:" + arr9);
        }
    }
}
//実行結果
//乱数:43
//乱数:89
//乱数:92
//乱数:82
//乱数:86
//乱数:98
//乱数:13
//乱数:87
//乱数:84
//乱数:14
//乱数:8
//乱数:97
//乱数:0
//一の位が0:なし
//一の位が1:なし
//一の位が2:[92, 82]
//一の位が3:[43, 13]
//一の位が4:[84, 14]
//一の位が5:なし
//一の位が6:[86]
//一の位が7:[87, 97]
//一の位が8:[98, 8]
//一の位が9:[89]
