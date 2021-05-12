package exercises.problem10;

public class Euclid {
    private int remainder = 0; //余り

    public int calc (int num1, int num2){
        /* num1 > num2 の状態にする */
        if (num1 < num2){
            int dummy = num1;
            num1 = num2;
            num2 = dummy;
        }
        while (true){
            this.remainder = num1 % num2;
            num1 = num2;
            num2 = this.remainder; //値を入れ替える
            if (this.remainder == 0){ //割り切れたときループ終了
                break;
            }
        }
        return num1;
    }
}
