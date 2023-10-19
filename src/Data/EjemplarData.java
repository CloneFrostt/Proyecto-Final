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

    public List<Ejemplar> listaDisponible() {
        List<Ejemplar> ejemplar = new ArrayList<>();

        try {
            String sql = "SELECT * FROM ejemplar WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
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

    public List<Ejemplar> listaPrestados() {
        List<Ejemplar> ejemplar = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ejemplar WHERE estado = 2";
            PreparedStatement ps = con.prepareStatement(sql);
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

    public List<Ejemplar> listaEnReparacion() {
        List<Ejemplar> ejemplar = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ejemplar WHERE estado = 3";
            PreparedStatement ps = con.prepareStatement(sql);
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

    public List<Ejemplar> listaEnRetraso() {
        List<Ejemplar> ejemplar = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ejemplar WHERE estado = 4";
            PreparedStatement ps = con.prepareStatement(sql);
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

    public void eliminarEjemplar(int id) {
        String sql = "DELETE FROM ejemplar WHERE idEjemplar=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
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

        String sql = "UPDATE ejemplar SET Codigo=?,idLibro=?,Estado=?,Cantidad=?"
                + " WHERE idEjemplar=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, ej.getCodigo());

            ps.setInt(2, ej.getIdLibro().getIdLibro());
            ps.setString(3, ej.isEstado());
            ps.setInt(4, ej.getCantidad());
            ps.setInt(5, ej.getIdEjemplar());
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