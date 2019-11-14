
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static String driver = "com.mysql.jdbc.Driver";
    
    private static String database = "trasefor";
    
    private static String hostname = "localhost";
    
    private static String port = "3306";
    
    private static String username = "root";
    
    private static String password = "";
    
    private static String connectionURL;
    
    public static Connection conn;
    
    /**
     * Constructor de la clase ConexionMySQL
     */
    public Conexion(){
        this.connectionURL = "jdbc:mysql://";
        this.connectionURL += hostname + ":" + port + "/" + database;
        this.connectionURL += "?autoReconnect=true&useSSL=false";
        this.getConnection();
    }

    /**
     * Retorna el conector a la base de datos 
     * @return Connection Conector a la base de datos
     */
    public static Connection getConnection() {
        try {
            Class.forName(driver);
            try {
                conn = DriverManager.getConnection(connectionURL, username, password);
            } catch(SQLException e) {
                System.out.print("No se puede conectar: "+e.getMessage());
            }
        } catch(ClassNotFoundException ex) {
            System.out.print("La clase "+driver+" no existe en el sistema");
        }
        return conn;
    } 
}

    

