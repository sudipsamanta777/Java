package Java.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_1 {
    public static void main(String[] args) {
        try {
            Connection conn = null;

            // Java.JDBC URL string pointing to the SQLite database path
            String DB_URL = "jdbc:sqlite:/tempfs/db";

            // This line sets a temporary directory for SQLite to avoid permission issues
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Try to connect to the database
            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



