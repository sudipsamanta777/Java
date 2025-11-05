package Java.JDBC;

import java.sql.*;


public class CreateTable {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            String userName = "root";
            String password = "samanta";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            // creating table
            stmt.execute("create table Students(Roll Integer primary key, Name Varchar(30), Marks Integer not null, Grade Varchar(2), Sex Varchar(7))");

        }catch (SQLException ex){
            System.out.println("SQLException : "+ ex.getMessage());
            System.out.println("SQLState: "+ ex.getSQLState());
            System.out.println("VendorError : "+ ex.getErrorCode());
        }
        catch (Exception e){
            System.out.println("Exception : "+ e);
        }
    }
}
