/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultis;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author blueb
 */
public class DB_Ultis {
    public static Connection getConnection() throws ClassNotFoundException, SQLException, Exception {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;database=BlogManagementSWP";
        conn = DriverManager.getConnection(url, "sa", "12345");
        return conn;
    }
}
