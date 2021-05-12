package exercises.problem8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class DbSample {
    public static void main(String[] args) {
        // 接続用 URL
        String url = "jdbc:mysql://localhost:3306/world?useSSL=false";
        // mysql ユーザー名
        String user = "root";
        // mysql パスワード
        String password = "root";
        HashMap<String,Integer> list = new HashMap<>();

        try (
                // ⒈ DBとの接続を確立する
                Connection conn = DriverManager.getConnection(url, user, password);
                // ⒉ 実行したいSQLを定義
                PreparedStatement statement =  conn.prepareStatement("select Language, count(*) as LanguageNumber from countrylanguage group by Language");
                // ⒊ SQLの実行結果にアクセスする
                ResultSet rs = statement.executeQuery();
        ) {
            while (rs.next()) {
                list.put(rs.getString("Language"),rs.getInt("LanguageNumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (String key : list.keySet()) {
            System.out.println(key);
            System.out.println(list.get(key));
        }

    }
}