package exercises.problem2;
import java.util.Date;
import java.util.Calendar;
//  スラッシュ区切りの年月日からcalendarに変換
public class change_format {
    public static void main(String[] args) {
        String today = "2021/05/07 11;12:13";
        String[] parts = today.split( "[/;:\\s]");
        System.out.println(parts);

        Calendar calendar = Calendar.getInstance();
        calendar.clear();

        calendar.set( Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]),Integer.parseInt(parts[4]), Integer.parseInt(parts[5]) );

        System.out.println(calendar.getTime());

    }
}


