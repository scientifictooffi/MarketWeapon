
import javax.sound.midi.Soundbank;
import java.sql.*;
import java.util.Scanner;

public class Admin extends User implements GetFromDatabase,SendToDatabase{
    private static final String url = "jdbc:mysql://localhost:3306/market";
    private static final String user = "root";
    private static final String password = "sadboys133722813";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    public Admin(String nickname,double cash){
        super(nickname,cash);

    }
    public Admin() throws SQLException {
        super();
    }

    public void sendToDatabase() {
        System.out.println("Choose the action");
        System.out.println("1)Delete user(ban)");
        System.out.println("2)Delete item from market");
        System.out.println("3)Change the parameter of thing");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice==1){
            System.out.println("Enter the user's id");
            int banId=scanner.nextInt();
            String banQuery = "DELETE FROM market.users WHERE id="+banId;
            try {
                con = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement= con.prepareStatement(banQuery);
                preparedStatement.executeUpdate();

            }
            catch(SQLException sql){
                System.out.println("There's no people");;
            }
        }
        else if(choice==2){
            System.out.println("What type of thing??");
            System.out.println("1)Cold weapon");
            System.out.println("2)Fire weapons");
            System.out.println("3)Nuclear weapon");
            int secondChoice=scanner.nextInt();
            if(secondChoice==1){
                System.out.println("Enter the serial number");
                String serial_number = scanner.next();
                String banItemQuery="DELETE FROM market.cold_weapons WHERE serialnumber LIKE '"+serial_number+"'";
                try {
                    con = DriverManager.getConnection(url, user, password);
                    PreparedStatement preparedStatement= con.prepareStatement(banItemQuery);
                    preparedStatement.executeUpdate();

                }
                catch(SQLException sql){
                    System.out.println("There's no item");;
                }
            }
            else if(secondChoice==2){
                System.out.println("Enter the serial number");
                String serial_number = scanner.next();
                String banItemQuery="DELETE FROM market.fire_weapons WHERE serialnumber LIKE '"+serial_number+"'";
                try {
                    con = DriverManager.getConnection(url, user, password);
                    PreparedStatement preparedStatement= con.prepareStatement(banItemQuery);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException sql){
                    System.out.println("there's no item");;
                }
            }
            else if(secondChoice==3){
                System.out.println("Enter the serial number");
                String serial_number = scanner.next();
                String banItemQuery="DELETE FROM market.nuclear_weapon WHERE serialnumber LIKE '"+serial_number+"'";
                try {
                    con = DriverManager.getConnection(url, user, password);
                    PreparedStatement preparedStatement= con.prepareStatement(banItemQuery);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException sql){
                    System.out.println("There's no item");;
                }
            }
        }
        else if(choice==3){
            System.out.println("What type of the thing?");
            System.out.println("1)Cold weapon");
            System.out.println("2)Fire weapons");
            System.out.println("3)Nuclear weapon");
            int secondChoice=scanner.nextInt();
            if(secondChoice==1){
                System.out.println("Enter the serial number");
                String changeSerial_Number=scanner.next();
                System.out.println("What parameter do you want to change");
                while(true) {
                    System.out.println("To exit, write \'back\'");
                    String whatToChange=scanner.next();
                    System.out.println("Change on what?(Enter)");
                    String howToChange=scanner.next();
                    if(whatToChange=="back"){
                        break;
                    }
                    String whatToChangeQuery="UPDATE market.cold_weapons"+" SET "+whatToChange+" = "+howToChange+" WHERE serialnumber LIKE'"+changeSerial_Number+"'";

                    try {
                        con = DriverManager.getConnection(url, user, password);
                        PreparedStatement preparedStatement= con.prepareStatement(whatToChangeQuery);
                        preparedStatement.executeUpdate();

                    } catch (SQLException sql) {
                        System.out.println("There's no item");

                    }
                }
            }
            if(secondChoice==2){
                System.out.println("Enter the serial number of thing");
                String changeSerial_Number=scanner.next();
                System.out.println("What parameter do you want to change?");
                while(true) {
                    System.out.println("To exit, write \'back\'");
                    String whatToChange=scanner.next();
                    System.out.println("Change on what?(Enter)");
                    String howToChange=scanner.next();
                    if(whatToChange=="back"){
                        break;
                    }
                    String whatToChangeQuery="UPDATE market.fire_weapons"+" SET "+whatToChange+" = "+howToChange+" WHERE serialnumber LIKE '"+changeSerial_Number+"'";
                    try {
                        con = DriverManager.getConnection(url, user, password);
                        PreparedStatement preparedStatement=con.prepareStatement(whatToChangeQuery);
                        preparedStatement.executeUpdate();

                    } catch (SQLException sql) {
                        System.out.println("There's no item");

                    }
                }
            }
            if(secondChoice==3){
                System.out.println("Enter the serial number");
                String changeSerial_Number=scanner.next();
                System.out.println("What parameter do you want to change?");
                while(true) {
                    System.out.println("To enter, write \'back\'");
                    String whatToChange=scanner.next();
                    System.out.println("Change on what?(Enter)");
                    String howToChange=scanner.next();
                    if(whatToChange.equalsIgnoreCase("back")){
                        break;
                    }
                    String whatToChangeQuery="UPDATE market.nuclear_weapon"+" SET "+whatToChange+" = "+howToChange+" WHERE serialnumber LIKE'"+changeSerial_Number+"'";

                    try {
                        con = DriverManager.getConnection(url, user, password);
                        PreparedStatement preparedStatement= con.prepareStatement(whatToChangeQuery);
                        preparedStatement.executeUpdate();

                    } catch (SQLException sql) {
                        System.out.println("There's no thing");

                    }
                }
            }
        }
    }
}
