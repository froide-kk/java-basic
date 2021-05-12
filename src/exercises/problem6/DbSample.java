package exercises.problem6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class DbSample {
    public static void  main(String[] args){
        String url = "jdbc:mysql://localhost:3306/world?useSSL=false";
        String user = "root";
        String password = "root";
        LinkedHashMap<String,Integer> gnp = new LinkedHashMap<>();

        try(
             Connection conn = DriverManager.getConnection(url,user,password);
             PreparedStatement statement = conn.prepareStatement("SELECT * FROM country order by gnp desc limit 10");
//             「SQLを実行するための窓口」みたいなもの。PreparedStatementは同じクエリを使い回す場合効率的
             ResultSet rs = statement.executeQuery();
        ){
             while(rs.next()){
                gnp.put(rs.getString("name"), rs.getInt("gnp"));
//                System.out.print(rs.getString("name"));
//                System.out.print("|");
//                System.out.println(rs.getString("continent"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(gnp);
    }
}
