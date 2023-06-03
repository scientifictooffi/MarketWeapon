import java.sql.*;
import java.util.Scanner;

public class Seller extends User implements GetFromDatabase,SendToDatabase{

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static final String url = "jdbc:mysql://localhost:3306/market";
    private static final String user = "root";
    private static final String password = "sadboys133722813";

    public Seller() throws SQLException {
        super();
    }

    public void sendToDatabase() {
        System.out.println("What do you want to sell? \n 1)Cold weapon \n2)Fire weapon \n 3)Nuclear weapon");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice==1){
            System.out.println("Enter serial number...");
            String serialNumber= scanner.next();
            System.out.println("Enter the weight...");
            double weight = scanner.nextDouble();
            System.out.println("Enter the price...");
            double price = scanner.nextDouble();
            System.out.println("Enter the range...");
            int range = scanner.nextInt();
            System.out.println("Enter the country of origin... ");
            String country = scanner.next();
            System.out.println("Enter the material...");
            String metal = scanner.next();
            System.out.println("Enter the blade length...");
            double bladeLength=scanner.nextDouble();

            try{
                con= DriverManager.getConnection(url,user,password);
                PreparedStatement preparedStatement= con.prepareStatement("INSERT INTO market.cold_weapons(serialnumber, weight, price, `range`, country, metal, bladelength) " +
                        ""+"("+"'"+serialNumber+"'"+","+"'"+weight+"'"+','+"'"+price+"'"+","+"'"+weight+"'"+","+"'"+range+"'"+","+"'"+country+"'"+","+"'"+metal+"'"+","+"'"+bladeLength+"'"+")");
                preparedStatement.executeUpdate();
                System.out.println("Accepted");
            }
            catch (SQLException sql){
                sql.printStackTrace();
            }
            getBack();
            System.out.println("End.");
        }
        else if(choice==2){
            System.out.println("Enter the serial number");
            String serialnumber1= scanner.next();
            System.out.println("Etner the weight");
            double weight1 = scanner.nextDouble();
            System.out.println("Enter the price");
            double price1 = scanner.nextDouble();
            System.out.println("Enter the range");
            int range1 = scanner.nextInt();
            System.out.println("Enter the country");
            String country1 = scanner.next();
            System.out.println("Enter the trunk length");
            double trunklength1=scanner.nextDouble();
            System.out.println("Enter the clip value");
            int magazine1 = scanner.nextInt();
            System.out.println("Enter the caliber");
            double caliber1 = scanner.nextDouble();
            System.out.println("Is the weapon automatic? 1 - yes, 0 - no");

            try{
                con= DriverManager.getConnection(url,user,password);
                PreparedStatement preparedStatement;
                String sql ="INSERT INTO market.fire_weapons (serialnumber, country, price, weight, fire_weapons.`range`, trunklength, magazine, caliber)" +
                        "VALUES"+"("+"'"+serialnumber1+"'"+","+"'"+country1+"'"+','+"'"+price1+"'"+","+"'"+weight1+"'"+","+"'"+range1+"'"+","+"'"+trunklength1+"'"+","+"'"+magazine1+"'"+","+"'"+caliber1+"'"+")";
                preparedStatement = con.prepareStatement(sql);

                preparedStatement.executeUpdate();
                System.out.println("Accepted");
            }
            catch (SQLException sql){
                sql.printStackTrace();
            }
            getBack();
            System.out.println("End");

        }
        else if(choice==3){
            System.out.println("Enter the serial number");
            String serialnumber= scanner.next();
            System.out.println("Enter the weight");
            double weight = scanner.nextDouble();
            System.out.println("Enter the price");
            double price = scanner.nextDouble();
            System.out.println("Enter the range");
            int range = scanner.nextInt();
            System.out.println("Enter the country of origin");
            String country = scanner.next();
            System.out.println("Введите explosive range");
            int range1 = scanner.nextInt();
            System.out.println("Enter the power");
            int power = scanner.nextInt();
            System.out.println("Enter bomb type (Nuclear, Hydrogen)");
            String type = scanner.next();

            try{
                con= DriverManager.getConnection(url,user,password);
                PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO market.nuclear_weapon(serialnumber, weight, price, `range`, country, power, type) " +
                        "VALUES"+"("+"'"+serialnumber+"'"+","+"'"+country+"'"+','+"'"+price+"'"+","+"'"+range1+"'"+","+"'"+country+"'"+","+"'"+power+"'"+","+"'"+type+"'"+')');
                preparedStatement.executeUpdate();
            }
            catch (SQLException sql){
                sql.printStackTrace();
            }
            getBack();
            System.out.println("End.");
        }
    }
    public void getBack(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you want to sell someone else?\"Yes\" or \"No\"");
        String scanChoice=scanner.next();
        if(scanChoice.equals("Yes")){
            sendToDatabase();
        }
    }
}
