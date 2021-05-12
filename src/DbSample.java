import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class DbSample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world?useSSL=false";
//        何処かからもってくることが多い
        String user = "root";
        String password = "root";
        HashMap<String, Integer> ci = new HashMap<>();

//        try()は自動的にcloseしてくれる
        try (
                Connection conn = DriverManager.getConnection(url, user, password);
//                PreparedStatement statement =  conn.prepareStatement("select * from country limit 5");
                PreparedStatement statement =  conn.prepareStatement("select * from city order by population desc limit 10;");
                ResultSet rs = statement.executeQuery();
//                Integer c = ci.get();
        ) {
            while (rs.next()) {
//                カラムの名前を指定
//                System.out.print(rs.getString("Name"));
//                System.out.print(" | ");
//                System.out.println(rs.getString("Continent"));
                ci.put(rs.getString("Name"), rs.getInt("Population"));
                System.out.println(rs.getString("Name") + ": " + rs.getString("Population"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(ci);
    }
}

//人口が多い都市best10
