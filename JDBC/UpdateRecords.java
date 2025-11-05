package Java.JDBC;
import java.sql.*;

public class UpdateRecords {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            String url = "jdbc:mysql://localhost:3306/test";
            String password = "samanta";
            String userName = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            stmt.execute("Update students set name = 'Sudip', Roll = 4 where Marks = 96");
            stmt.execute("Update students set name = 'Rohit', Roll = 5 where Marks = 90");
            System.out.println("Database connected");
        }
        catch (SQLException ex){
            // handles the sql exceptions
            System.out.println("SQLException : "+ex.getMessage());
            System.out.println("SQLState : "+ ex.getSQLState());
            System.out.println("VendorError: "+ ex.getErrorCode());
        }
        // handles the other exceptions
        catch (Exception e){
            System.out.println("Exception : "+e);
        }
        finally {
            if(conn != null){
                try {
                    conn.close();
                    System.out.println("Connection terminated");
                }catch (Exception e){
                    /*ignore closing errors*/
                }
            }
        }
    }
}
