import java.net.URL;
import java.sql.*;
public class DataBaseHandler extends Config {
    public static final String URL = "jdbc:mysql://localhost:3306/MarketBase";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "sadboys133722813";
    public DataBaseHandler(){

    }
    public void databaseIdName() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT name FROM market_place.fire_weapons");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("blade_lenght")+
                        resultSet.getString(1));
            }

        } catch (Exception e) {
            System.out.println("badtime");

        }
    }
}
