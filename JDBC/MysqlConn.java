package Java.JDBC;
import java.sql.*;

public class MysqlConn {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/test";
        String password = "samanta";
        String userName = "root";
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(URL, userName, password);
            System.out.println("Connection established");

        }
        catch (Exception e){
            System.out.println("Csn not connect to database server :"+ e);
        }finally {
            if(conn != null){
                try{
                    conn.close();
                    System.out.println("Database connection terminated");
                }catch (Exception e){
                    /*ignore close errors*/
                }
            }
        }
    }
}
