
package logica;

import conexion.cls_conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author juana
 */

public class cls_servicio {
    
        private final String SQL_INSERT = "INSERT INTO taxis1 (id_con,n_con,p_veh,c_ver,id_cli,n_cli,v_ser,a_dia) values (?,?,?,?,?,?,?,?)";
        private final String SQL_SELECT = "SELECT * FROM taxis1";
        private PreparedStatement PS;
        private DefaultTableModel DT;
        private ResultSet RS;
        private final cls_conexion CN;
        
public cls_servicio(){
    PS = null;
    CN = new cls_conexion();
}

private DefaultTableModel setTitulos(){
    DT = new DefaultTableModel();
    DT.addColumn("Id conductor");
    DT.addColumn("Nombre conductor");
    DT.addColumn("Placa vehiculo");
    DT.addColumn("Codigo verificacion");
    DT.addColumn("Id cliente");
    DT.addColumn("Nombre cliente");
    DT.addColumn("Valor servicio");
    DT.addColumn("Acumulado del dia");
    return DT;
}

public int insertDatos(String idcon,String ncon,String pveh,int cver,int idcli,String ncl,int vser,int adia){
            int res = 0;
    try {
        PS = CN.getConnection().prepareStatement(SQL_INSERT);
        PS.setString(1, idcon);
        PS.setString(2, ncon);
        PS.setString(3, pveh);
        PS.setInt(4, cver);
        PS.setInt(5, idcli);
        PS.setString(6, ncl);
        PS.setInt(7, vser);
        PS.setInt(8, adia);
        res = PS.executeUpdate();
        if(res > 0){
            JOptionPane.showMessageDialog(null,"Registro guardado" );
        }
    } catch (SQLException e){
        System.err.println("Error al guardar los datos: " + e.getMessage());
    } finally {
        PS = null;
        CN.close();
    }
    return res;
}
    
public int updateDatos(String idcon,String ncon,String pveh,int cver,int idcli,String ncl,int vser,int adia){
String SQL = "UPDATE taxis1 SET  n_con'" + ncon + "',p_veh'" + pveh + "',c_ver '" + cver + "',id_cli'" + idcli + "',n_cli'" + ncl + "',v_ser'" + vser + "',a_dia'" + adia + "' WHERE = id_con "+ idcon;
    int res = 0;        
    try {
        PS = CN.getConnection().prepareStatement(SQL);
        res = PS.executeUpdate();
        if(res > 0){
            JOptionPane.showMessageDialog(null,"Registro modificado.." );
        }
    } catch (SQLException e){
        System.err.println("Error al modificar los datos: " + e.getMessage());
    } finally {
        PS = null;
        CN.close();
    }
    return res;
}

public int deleteDatos(String idcon){
    String SQL ;
    SQL =  "DELETE from taxis1 WHERE id_con=" +idcon; 
    int res = 0;        
    try {
        PS = CN.getConnection().prepareStatement(SQL);
        res = PS.executeUpdate();
        if(res > 0){
            JOptionPane.showMessageDialog(null,"Registro eliminado.." );
        }
    } catch (SQLException e){
        System.err.println("Error al eliminar los datos: " + e.getMessage());
    } finally {
        PS = null;
        CN.close();
    }
    return res;
}
    
public DefaultTableModel getDatos(){
    try{
        setTitulos();
        PS = CN.getConnection().prepareStatement(SQL_SELECT);
        RS = PS.executeQuery();
        Object[] fila = new Object[8];
        while (RS.next()){
            fila[0] = RS.getString(1);
            fila[1] = RS.getString(2);
            fila[2] = RS.getString(3);
            fila[3] = RS.getString(4);
            fila[4] = RS.getInt(5);
            fila[5] = RS.getString(6);
            fila[6] = RS.getInt(7);
            fila[7] = RS.getInt(8);
            DT.addRow(fila);
        }
    } catch (SQLException e){
        System.out.println("Error al listar los datos:" +e.getMessage());
    } finally {
        PS = null;
        RS = null;
        CN.close();
    }
    return DT;
}

public DefaultTableModel getDato(int crt, String prm){
    String SQL;
    if(crt == 0){
        SQL = "SELECT * FROM taxis1 WHERE id_con = " +prm;
    } else {
        SQL = "SELECT * FROM taxis1 WHERE c_ver like '" + prm + "%'";
    }
    try{
        setTitulos();
        PS = CN.getConnection().prepareStatement(SQL);
        RS = PS.executeQuery();
        Object[] fila = new Object[8];
        while (RS.next()){
            fila[0] = RS.getString(1);
            fila[1] = RS.getString(2);
            fila[2] = RS.getString(3);
            fila[3] = RS.getString(4);
            fila[4] = RS.getInt(5);
            fila[5] = RS.getString(6);
            fila[6] = RS.getInt(7);
            fila[7] = RS.getInt(8);
            DT.addRow(fila);
        }
    } catch (SQLException e){
        System.out.println("Error al listar los datos:" +e.getMessage());
    } finally {
        PS = null;
        RS = null;
        CN.close();
    }
    return DT;
}

    public int updateDatos(String ncon, String pveh, int cver, int idcl, String ncl, int vser, int adia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int insertDatos(String ncon, String pveh, int cver, int idcl, String ncl, int vser, int adia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}