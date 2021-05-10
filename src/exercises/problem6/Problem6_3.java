package exercises.problem6;
import java.util.ArrayList;
import java.util.Random;

public class Problem6_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> data = new ArrayList<>();
        String zero = "";
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";
        String six = "";
        String seven = "";
        String eight = "";
        String nine = "";

        while (true) {
            int num = rand.nextInt(101);
            System.out.println("乱数：" + num);
            if (num == 0){
                break;
            } else {
                data.add(num);
            }
        }
        System.out.println();
        for (Integer datum : data) {
            if (datum % 10 == 0) {
                zero += datum + " ";
            } else if (datum % 10 == 1){
                one += datum + " ";
            } else if (datum % 10 == 2){
                two += datum + " ";
            } else if (datum % 10 == 3){
                three += datum + " ";
            } else if (datum % 10 == 4){
                four += datum + " ";
            } else if (datum % 10 == 5){
                five += datum + " ";
            } else if (datum % 10 == 6){
                six += datum + " ";
            } else if (datum % 10 == 7){
                seven += datum + " ";
            } else if (datum % 10 == 8){
                eight += datum + " ";
            } else {
                nine += datum + " ";
            }
        }
        System.out.println("一の位が0：" + zero);
        System.out.println("一の位が1：" + one);
        System.out.println("一の位が2：" + two);
        System.out.println("一の位が3：" + three);
        System.out.println("一の位が4：" + four);
        System.out.println("一の位が5：" + five);
        System.out.println("一の位が6：" + six);
        System.out.println("一の位が7：" + seven);
        System.out.println("一の位が8：" + eight);
        System.out.println("一の位が9：" + nine);
    }
}
