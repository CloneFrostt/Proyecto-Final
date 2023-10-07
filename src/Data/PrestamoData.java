package Data;
import Entidades.Ejemplar;
import Entidades.Lector;
import Entidades.Prestamo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PrestamoData {

    private Connection con = null;

    public PrestamoData() {

        con = Conexion.getConexion();
    }

    public void cargarPrestamo(Prestamo pres) {
       
        String sql = "INSERT INTO prestamo(FechaI,FechaF,Estado,idEjemplar,idLector)VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(pres.getFechaI()));
            ps.setDate(2, Date.valueOf(pres.getFechaF()));
            ps.setBoolean(3, pres.isEstado());
            ps.setInt(4, pres.getEjemplar());
            ps.setInt(5, pres.getLector());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pres.setIdPrestamo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Prestamo otorgado con exito.");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestamo");
        }
    }

    public List<Prestamo> listadoDePrestOtorgados() {

        List<Prestamo> lector = new ArrayList<>();
        try {
            String sql = "SELECT * FROM prestamo WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Prestamo pres = new Prestamo();
                pres.setIdPrestamo(rs.getInt("idPrestamo"));
                pres.setFechaI(rs.getDate("FechaI").toLocalDate());
                pres.setFechaF(rs.getDate("FechaF").toLocalDate());
                pres.setEjemplar(rs.getInt("idEjemplar"));
                pres.setLector(rs.getInt("idLector"));
                pres.setEstado(rs.getBoolean("Estado"));

                lector.add(pres);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo" + ex.getMessage());
        }
        return lector;
    }

    public Prestamo buscarPrestamoPorId(int idPrestamo) {
        Prestamo pres = null;
        try {
            String sql = "SELECT * FROM prestamo WHERE idPrestamo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPrestamo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pres = new Prestamo();
                pres.setIdPrestamo(rs.getInt("idPrestamo"));
                pres.setFechaI(rs.getDate("FechaI").toLocalDate());
                pres.setFechaF(rs.getDate("FechaF").toLocalDate());
                pres.setEjemplar(rs.getInt("idEjemplar"));
                pres.setLector(rs.getInt("idLector"));
                pres.setEstado(rs.getBoolean("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El Prestamo no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo" + ex.getMessage());
        }
        return pres;

    }
 
}
/*public void otorgarPrestamo(){
String sql="SELECT *
FROM prestamo
INNER JOIN ejemplar ON prestamo.cantidad = ejemplar.cantidad";
if(ejemplar.catidad>0){
    Prestamo pres = null;
        try {
            String sql = "SELECT * FROM prestamo WHERE idPrestamo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPrestamo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pres = new Prestamo();
                pres.setIdPrestamo(rs.getInt("idPrestamo"));
                pres.setFechaI(rs.getDate("FechaI").toLocalDate());
                pres.setFechaF(rs.getDate("FechaF").toLocalDate());
                pres.setEjemplar(rs.getInt("idEjemplar"));
                pres.setLector(rs.getInt("idLector"));
                pres.setEstado(rs.getBoolean("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El Prestamo no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo" + ex.getMessage());
        }
        return pres;
}
}*/
