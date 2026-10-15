// Case Study 10, file 1: one place that opens the connection
import java.sql.*;

public class Db {
    static Connection open() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/scsvmv_lab", "root", "root");
    }
}
