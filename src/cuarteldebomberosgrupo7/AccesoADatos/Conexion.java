package cuarteldebomberosgrupo7.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3307/";
    private static final String BD="bomberos";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){}
        
    public static Connection getConexion(){
        if (connection==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection(URL+BD,USUARIO,PASSWORD);
                JOptionPane.showMessageDialog(null,"Conectado a la base de datos");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error al cargar Driver "+ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error de Conexion "+ex.getMessage());
            }
        }
            
        return connection;
    }
}
