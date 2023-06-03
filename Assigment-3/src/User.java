import java.sql.*;
import java.util.Scanner;

public class User {
    private static final String url = "jdbc:mysql://localhost:3306/market";
    private static final String user = "root";
    private static final String password = "sadboys133722813";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private String nickname1;
    private double cash;
    private String passwordUser;

    public boolean verifyPassword(String scanname) {
        Scanner scanner = new Scanner(System.in);
        try {
            con = DriverManager.getConnection(url, user, password);
            Statement stmt1 = con.createStatement();
            ResultSet rs1 = stmt1.executeQuery("SELECT*FROM market.users WHERE users.nickname LIKE " + "'" + scanname + "'");
            rs1.next();
            String nName = rs1.getString("nickname");
            if (nName.equalsIgnoreCase(scanname)) {
                System.out.println("Enter your password");
                String password = scanner.next();
                Statement statement2 = con.createStatement();
                ResultSet rs2 = statement2.executeQuery("SELECT users.password FROM market.users WHERE users.nickname LIKE " + "'" + scanname + "'");
                rs2.next();
                ;
                String nPassword = rs2.getString("password");
                if (nPassword.equalsIgnoreCase(password)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("You must to registrate");
            }
        } catch (SQLException sql) {
            sql.printStackTrace();
            System.out.println("bad verify");
        }
        return false;
    }

    public void registrationUser(String scanname) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        try {
            con = DriverManager.getConnection(url, user, password);
            Statement statement1 = con.createStatement();
            ResultSet rs1 = statement1.executeQuery("SELECT " + "nickname" + " FROM market.users");
            System.out.println("enter password");
            this.nickname1 = scanname;
            String scanPassword = scanner.next();
            this.passwordUser = scanPassword;
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO market.users(nickname,users.password) VALUES(" + "'" + scanname + "'" + "," + "'" + passwordUser + "'" + ')');
            preparedStatement.executeUpdate();
        }
        catch(SQLException sql)

        {
            System.out.println("registration user bad");
        }
        con.close();
    }



    public User() throws SQLException {
        System.out.println("Enter nickname");
        Scanner scanner=new Scanner(System.in);
        String inputNickname=scanner.next();
        con=DriverManager.getConnection(url,user,password);
        Statement nickStatement=con.createStatement();
        ResultSet resnick=nickStatement.executeQuery("SELECT nickname FROM market.users WHERE nickname LIKE" + "'" + inputNickname + "'");
        boolean isEmpty=resnick.next();
        if(isEmpty) {
            String finalTest = resnick.getString("nickname");
            if (finalTest.equalsIgnoreCase(inputNickname)) {
                if (verifyPassword(inputNickname)) {
                    this.nickname1 = inputNickname;
                    Statement newstatement = con.createStatement();
                    ResultSet rs1 = newstatement.executeQuery("SELECT users.password FROM market.users WHERE users.nickname LIKE" + "'" + inputNickname + "'");
                    rs1.next();
                    String npassword = rs1.getString("password");
                    this.passwordUser = npassword;
                    System.out.println("Hello!");
                } else {
                    System.out.println("Wrong answer, goodbye");

                }
            }
        }
        else{
            registrationUser(inputNickname);
        }
    }

    public User(String nickname, double cash){
        this.nickname1=nickname;
        this.cash=cash;
    }
    public void getAllColdWeapon(){
        try{
            con= DriverManager.getConnection(url,user,password);
            stmt=con.createStatement();
            rs=stmt.executeQuery("SELECT*FROM market.cold_weapons");
            while(rs.next()){
                System.out.println("id:"+rs.getInt("id")+" serialNumber: "
                        +rs.getString("serialnumber")+" price: "
                        +rs.getInt("price")+" range: "
                        +rs.getInt("range")+" country: "
                        +rs.getString("country")+" metal: "
                        +rs.getString("metal")+" blade length: "
                        +rs.getDouble("bladeLength"));
            }
        }
        catch (SQLException sql){
            sql.printStackTrace();
        }
    }

    public void getAllFireWeapon(){
        try{
            con=DriverManager.getConnection(url,user,password);
            stmt=con.createStatement();
            rs=stmt.executeQuery("SELECT*FROM market.fire_weapons");
            while(rs.next()){
                System.out.println("id:"+rs.getInt("id")+" serialNumber: "
                        +rs.getString("serialnumber")+" price: "
                        +rs.getInt("price")+" range: "
                        +rs.getInt("range")+" country: "
                        +rs.getString("country")+" magazine: "
                        +rs.getString("magazine")+" trunk length: "
                        +rs.getDouble("trunkLength")+" caliber: "
                        +rs.getDouble("caliber")+" is it auto? 1=yes, 0=no: "+
                        rs.getBoolean("isAutomatic"));
            }
        }
        catch (SQLException sql){
            sql.printStackTrace();
        }
    }
    public void getAllNuclearWeapon(){
        try{
            con=DriverManager.getConnection(url,user,password);
            stmt=con.createStatement();
            rs=stmt.executeQuery("SELECT*FROM market.nuclear_weapon");
            while(rs.next()){
                System.out.println("id:"+rs.getInt("id")+" serialNumber: "
                        +rs.getString("serialnumber")+" price: "
                        +rs.getInt("price")+" range: "
                        +rs.getInt("range")+" country: "
                        +rs.getString("country")+" power: "
                        +rs.getInt("power")+" type: "+
                        rs.getString("type"));
            }
        }
        catch (SQLException sql){
            sql.printStackTrace();
        }
    }
    public void getFromDatabase() {
        System.out.println("What to dou want to see? \n" +
                " 1)All cold weapon \n " +
                "2)All fire weapon \n" +
                "3)All nuclear weapon \n" +
                "4)everything" );
        Scanner scanner =new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice==1){
            getAllColdWeapon();
            System.out.println("write to back \' back \' ");
            String back = scanner.next();
            if(back.equals("back")){
                getFromDatabase();
            }
        }
        else if(choice==2){
            getAllFireWeapon();
            System.out.println("write to back \'back\' ");
            String back = scanner.next();
            if(back.equals("back")){
                getFromDatabase();
            }
        }
        else if(choice==3){
            getAllNuclearWeapon();
            System.out.println("write to back \'back\' ");
            String back = scanner.next();
            if(back.equals("back")){
                getFromDatabase();
            }
        }
        else if(choice==4){
            getAllNuclearWeapon();
            getAllFireWeapon();
            getAllColdWeapon();
        }

    }

    public String getNickname() {
        return nickname1;
    }

    public double getCash() {
        return cash;
    }
}
