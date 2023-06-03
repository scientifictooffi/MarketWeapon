import java.sql.*;
import java.util.Scanner;

public class Buyer extends User implements GetFromDatabase,SendToDatabase{
    private static final String url = "jdbc:mysql://localhost:3306/market";
    private static final String user = "root";
    private static final String password = "sadboys133722813";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    @Override
    public void sendToDatabase() {
        try{
            con= DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement= con.prepareStatement("INSERT INTO market.users(nickname, cash, status)"+"values("+getNickname()+","+getCash()+","+getClass()+")");
            preparedStatement.executeUpdate();
        }
        catch(SQLException sql){
            sql.printStackTrace();
        }
    }
    public void buyNuclearWeapon() {
        System.out.println("Enter id of the weapon");
        Scanner scanner = new Scanner(System.in);
        String scanid= scanner.next();
        try {
            con = DriverManager.getConnection(url, user, password);
            Statement statement=con.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT serialnumber FROM market.nuclear_weapon WHERE id LIKE '"+scanid+"'");
            resultSet.next();
            String test=resultSet.getString("serialnumber");

            PreparedStatement preparedStatement=con.prepareStatement("UPDATE market.users SET property"+"="+"'"+test+"'"+" WHERE nickname LIKE'"+getNickname()+"'");
            preparedStatement.executeUpdate();
            //PreparedStatement preparedStatement= con.prepareStatement("INSERT INTO market.users(property) WHERE nickname LIKE '"+super.getNickname()+"'"+"SELECT serialNumber FROM market.nuclear WHERE id LIKE+'"+scanid+"'");
            //preparedStatement.executeUpdate();
           // PreparedStatement preparedStatement1=con.prepareStatement("DELETE FROM nuclear_weapon WHERE serialnumber LIKE"+"'"+serialnumber+"'");
            //preparedStatement1.executeUpdate();
        } catch (SQLException sql) {
            sql.printStackTrace();
            System.out.println("There's no item");
        }
    }
    public void buyColdWeapon(){
        System.out.println("Enter serial number");
        Scanner scanner = new Scanner(System.in);
        String serialnumber = scanner.next();
        try{
            con= DriverManager.getConnection(url,user,password);
            stmt=con.createStatement();
            PreparedStatement preparedStatement= con.prepareStatement("INSERT INTO market.users(property) SELECT*FROM market.cold_weapons WHERE serialnumber LIKE"+"'"+serialnumber+"'");
            preparedStatement.executeUpdate();
            preparedStatement=con.prepareStatement("DELETE FROM cold_weapons WHERE serialnumber LIKE"+"'"+serialnumber+"'");
            preparedStatement.executeUpdate();
        }
        catch(SQLException sql){
            sql.printStackTrace();
        }
    }
    public void buyFireWeapon(){
        System.out.println("Enter serial number");
        Scanner scanner = new Scanner(System.in);
        String serialnumber = scanner.next();
        try{
            con= DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO market.users(property) SELECT*FROM market.cold_weapons WHERE serialnumber="+serialnumber);
            preparedStatement.executeUpdate();
            preparedStatement=con.prepareStatement("DELETE FROM fire_weapons WHERE serialnumber LIKE"+"'"+serialnumber+"'");
            preparedStatement.executeUpdate();
        }
        catch(SQLException sql){
            sql.printStackTrace();
        }
    }


    public Buyer() throws SQLException {
        super();
    }
}
