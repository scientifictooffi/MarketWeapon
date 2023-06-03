import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/market";
    private static final String user = "root";
    private static final String password = "sadboys133722813";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you?\n1. Buyer\n2. Admin\n3. Seller\n4)Buyer");
        int roleChoice = sc.nextInt();

        switch (roleChoice) {
            case 1:
                System.out.println("You are entry as Buyer");
                Buyer buyer=new Buyer();
                buyer.getFromDatabase();
                System.out.println("What do you want to buy?\n1)Cold\n2)Fire\n3)Nuclear");
                int choice=sc.nextInt();
                if(choice==1){
                    buyer.buyColdWeapon();
                }
                if(choice==2){
                    buyer.buyFireWeapon();
                }
                if(choice==3){
                    buyer.buyNuclearWeapon();
                }
                break;
            case 2:
                System.out.println("Special question for admin: What's the capital of France?");
                System.out.print("Answer: ");
                String test=sc.next();
                if (test.equals("Paris")) {
                    System.out.println("Welcome, admin.");
                    Admin admin =new Admin();
                    admin.sendToDatabase();
                } else {
                    System.out.println("Access denied.");
                }
                break;
            case 3:
                System.out.println("You are entry as Seller");
                Seller seller=new Seller();
                seller.sendToDatabase();
            default:
                System.out.println("Invalid option.");
        }
    }
}
