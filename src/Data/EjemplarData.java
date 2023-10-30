package Data;
import Data.*;
import Entidades.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class EjemplarData {

    private Connection con = null;
    private LibroData ld = new LibroData();

    public EjemplarData() {

        con = Conexion.getConexion();
    }

    public void cargarEjemplar(Ejemplar eje) {
        String sql = "INSERT INTO ejemplar(Codigo,idLibro,Estado,Cantidad)VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, eje.getCodigo());
            ps.setInt(2, eje.getIdLibro().getIdLibro());
            ps.setString(3, eje.isEstado());
            ps.setInt(4, eje.getCantidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                eje.setIdEjemplar(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ejemplar añadido con exito.");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplar");
        }
    }

    public List<Ejemplar> listaEjemplarPorEstado(String estado) {
        List<Ejemplar> ejemplar = new ArrayList<>();

        try {
            String sql = "SELECT * FROM ejemplar WHERE Estado = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ejemplar ej = new Ejemplar();
                ej.setIdEjemplar(rs.getInt("idEjemplar"));
                ej.setCodigo(rs.getInt("Codigo"));
                Libros L = ld.buscarLibroPorId(rs.getInt("idLibro"));
                ej.setIdLibro(L);
                ej.setEstado(rs.getString("Estado"));
                ej.setCantidad(rs.getInt("Cantidad"));
                ejemplar.add(ej);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ejemplar" + ex.getMessage());
        }
        return ejemplar;
    }

   

    public void eliminarEjemplar(int codigo) {
            String sql = "UPDATE ejemplar SET Estado = 'Inactivo' WHERE Codigo=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            int exito = ps.executeUpdate();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Ejemplar eliminado con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se selecciono ejemplar a eliminar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ejemplar" + ex.getMessage());
        }

    }

    public void modificarEjemplar(Ejemplar ej) {

        String sql = "UPDATE ejemplar SET idLibro=?,Estado=?,Cantidad=?"
                + " WHERE Codigo=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, ej.getIdLibro().getIdLibro());
            ps.setString(2, ej.isEstado());
            ps.setInt(3, ej.getCantidad());
            ps.setInt(4, ej.getCodigo());
            
            int exito = ps.executeUpdate();
      
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un ejemplar");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplar " + ex.getMessage());
        }
    }

    public Ejemplar buscarEjemplarPorCodigo(int codigo) {
        Ejemplar eje = null;
        try {
            String sql = "SELECT * FROM ejemplar WHERE Codigo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                eje = new Ejemplar();

                eje.setCodigo(rs.getInt("Codigo"));
              Libros L = ld.buscarLibroPorId(rs.getInt("idLibro"));
                eje.setIdLibro(L);
                eje.setEstado(rs.getString("Estado"));
                eje.setCantidad(rs.getInt("Cantidad"));

            } else {
                JOptionPane.showMessageDialog(null, "El Ejemplar no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ejemplar" + ex.getMessage());
        }
        return eje;

    }
     public Ejemplar buscarEjemplarPorId(int id) {
        Ejemplar eje = null;
        try {
            String sql = "SELECT * FROM ejemplar WHERE idEjemplar=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                eje = new Ejemplar();
                eje.setIdEjemplar(rs.getInt("idEjemplar"));
                eje.setCodigo(rs.getInt("Codigo"));
              Libros L = ld.buscarLibroPorId(rs.getInt("idLibro"));
                eje.setIdLibro(L);
                eje.setEstado(rs.getString("Estado"));
                eje.setCantidad(rs.getInt("Cantidad"));

            } else {
                JOptionPane.showMessageDialog(null, "El Ejemplar no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ejemplar" + ex.getMessage());
        }
        return eje;

    }
     public void modificarCantDeEje(Ejemplar ej){
      String sql = "UPDATE ejemplar SET Cantidad=?"
                + " WHERE idEjemplar=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

         
            ps.setInt(1, ej.getCantidad());
            ps.setInt(2, ej.getIdEjemplar());
            int exito = ps.executeUpdate();
      
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Ejemplar ya existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplar " + ex.getMessage());
        }
     
     }
}