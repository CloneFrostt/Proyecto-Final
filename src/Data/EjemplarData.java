
package Data;
import Data.*;
import Entidades.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class EjemplarData {
    private Connection con = null;

    public EjemplarData() {
        
        con = Conexion.getConexion();
    }
    public void cargarEjemplar(Ejemplar eje){
         String sql = "INSERT INTO Ejemplar(codigo,idLibro,Estado)VALUES (?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, eje.getCodigo());
            ps.setInt(2, eje.getIdLibro().getIdLibro());
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector");
        }
    }
}
