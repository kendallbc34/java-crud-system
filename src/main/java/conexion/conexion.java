package conexion;

import java.sql.*;

public class conexion {

    Connection con;

    public conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bdCrud", "root", "");
            System.out.println("Conexion exitosa");

        } catch (Exception e) {

            System.out.println("No puede conectarse a la BD");

        }

    }

    public Connection getConnection() {
        return con;
    }
}
