
package Data;

import Data.Conexion;
import Entidades.Prestamo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PrestamoData {
     private Connection con = null;

    public PrestamoData() {
        
        con = Conexion.getConexion();
    }
    
    public void cargarPrestamo(Prestamo pres){
         String sql = "INSERT INTO prestamo(FechaI,FechaF,Estado,idEjemplar,idLector)VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
      
            ps.setDate(1,Date.valueOf(pres.getFechaI()));
            ps.setDate(2,Date.valueOf(pres.getFechaF()));
            ps.setBoolean(3,pres.isEstado());
            ps.setInt(4, pres.getEjemplar().getIdEjemplar());
               ps.setInt(5, pres.getLector().getIdLector());
            ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pres.setIdPrestamo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Prestamo añadido con exito.");

            }
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestamo");
        }
    }
    
   
}

