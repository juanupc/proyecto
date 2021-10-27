
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author juana
 */
public class cls_conexion {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "100324";
    private static final String URL = "jdbc:mysql://localhost:3307/taxis";
    private static Connection CN;
    
    public cls_conexion() {
        CN = null;
    }  
    
    public Connection getConnection(){
              try {
            Class.forName(DRIVER);
            CN = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException ex ){
           JOptionPane.showMessageDialog(null, ex.getMessage(),"Error al conectar", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }  
        return CN;
    }
    
    public void close() {
        try{
            CN.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error al conectar", JOptionPane.ERROR_MESSAGE);
        }
    }
}