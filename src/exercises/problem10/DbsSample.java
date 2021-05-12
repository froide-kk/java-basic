package exercises.problem10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Random;

public class DbsSample {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10) +1;
        HashMap<Integer, String> rank = new HashMap<>();
        // 接続用 URL
        String url = "jdbc:mysql://localhost:3306/world?useSSL=false";
        // mysql ユーザー名
        String user = "root";
        // mysql パスワード
        String password = "root";
        try (
                // ⒈ DBとの接続を確立する
                Connection conn = DriverManager.getConnection(url, user, password);
                // ⒉ 実行したいSQLを定義

                PreparedStatement statement =  conn.prepareStatement
                        ("SELECT countrylanguage.Language as language, SUM(country.Population*countrylanguage.Percentage/100) as speaker FROM country INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode GROUP BY countrylanguage.Language ORDER BY speaker DESC;");
                // ⒊ SQLの実行結果にアクセスする
                ResultSet rs = statement.executeQuery();
        ) {
            int count = 1;
            while (rs.next()) {

                // カラムデータを出力
                /*System.out.print(rs.getString("language"));
                System.out.print(" | ");
                System.out.println(rs.getString("language");*/
                String value = rs.getString("language") + ": " + rs.getString("speaker");
                rank.put(count, value);
                count ++;
                if(count > num) break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < rank.size(); i++){
            System.out.printf("%d位　%s\n", i+1, rank.get(i+1));
        }
    }
}