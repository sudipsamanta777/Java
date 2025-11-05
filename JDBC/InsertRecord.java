package Java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try{
            String url = "jdbc:mysql://localhost:3306/test";
            String password = "samanta";
            String user = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            stmt.execute("insert into students values(1, 'Asit', 80, 'A', 'Male')");
            stmt.execute("insert into students values(2, 'Amar', 85, 'A', 'Male')");
            stmt.execute("insert into students values(3, 'Sanjib', 76, 'B+', 'Male')");
            stmt.execute("insert into students values(4, 'Rohit', 96, 'A+', 'Male')");
            stmt.execute("insert into students values(5, 'Sudip', 90, 'A+', 'Male')");

            System.out.println("Connection Established");
        }
        catch (SQLException ex){
            System.out.println("SQLException : "+ ex.getMessage());
            System.out.println("SQLState : "+ ex.getSQLState());
            System.out.println("VendorError : "+ ex.getErrorCode());
        }
        catch (Exception e){
            System.out.println("Exception : "+ e);
        }
        finally {
            if(conn != null){
                try{
                    conn.close();
                    System.out.println("Database Connection terminated");
                }catch (Exception e){
                    /* Ignore close error */
                }
            }
        }
    }
}
