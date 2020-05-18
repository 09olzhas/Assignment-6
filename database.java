package postgre;

import Interfaces.iDBRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database implements iDBRepository {


    @Override
    public Connection getConnection() {
        try {
            String connStr = "jdbc:postgresql://localhost:5432/employee";
            Connection conn = DriverManager.getConnection(connStr, "postgres", "qwerty21012815");
            return conn;
        } catch (SQLException ex) {
            ex.getErrorCode();
        }
        return null;
    }
}
