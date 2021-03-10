package chapters.ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbSample {
    public static void main(String[] args) {
        // 接続用 URL
        String url = "jdbc:mysql://localhost:3306/world?useSSL=false";
        // mysql ユーザー名
        String user = "root";
        // mysql パスワード
        String password = "root";

        try (
            // ⒈ Connection DBとの接続を確立する
            Connection conn = DriverManager.getConnection(url, user, password);
            // ⒉ PreparedStatement で実行したいSQLを定義
            PreparedStatement statement =  conn.prepareStatement("select * from country limit 5");
            // ⒊ ResultSet でSQLの実行結果にアクセスする
            ResultSet rs = statement.executeQuery();
        ) {
            while (rs.next()) {
                // カラムデータを出力
                System.out.print(rs.getString("name"));
                System.out.print(" | ");
                System.out.println(rs.getString("continent"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
