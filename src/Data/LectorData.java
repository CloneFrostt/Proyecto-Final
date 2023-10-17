package Data;
import Data.*;
import Entidades.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class LectorData {

    private Connection con = null;

    public LectorData() {

        con = Conexion.getConexion();
    }

    public void CargarLector(Lector lec) {
        String sql = "INSERT INTO lector(NroSocio,Nombre,Domicilio,mail,Estado)VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, lec.getNroSocio());
            ps.setString(2, lec.getNombre());
            ps.setString(3, lec.getDomicilio());
            ps.setString(4, lec.getMail());
            ps.setBoolean(5, lec.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                lec.setIdLector(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Lector añadido con exito.");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector");
        }
    }

    public void eliminarLector(int NroSocio) {
        try {
            String sql = "UPDATE lector SET Estado = 0 WHERE NroSocio= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, NroSocio);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó un Lector");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Lector");
        }
    }

    public void modificarLector(Lector lec) {
        String sql = "UPDATE lector SET Nombre=?,Domicilio=?,mail=?,Estado=?"
                + " WHERE idLector=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, lec.getNombre());

            ps.setString(2, lec.getDomicilio());
            ps.setString(3, lec.getMail());
            ps.setBoolean(4, lec.isEstado());
            ps.setInt(5, lec.getIdLector());
            int exito = ps.executeUpdate();
            System.out.println(exito);
            System.out.println(lec.toString());
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Lector ya existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector " + ex.getMessage());
        }
    }
       public List<Lector> listarLectores() {

        List<Lector> lector = new ArrayList<>();
        try {
            String sql = "SELECT * FROM lector WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lector lec = new Lector();
                lec.setIdLector(rs.getInt("idLector"));
                lec.setNroSocio(rs.getInt("NroSocio"));
                lec.setNombre(rs.getString("Nombre"));
                lec.setDomicilio(rs.getString("Domicilio"));
                lec.setMail(rs.getString("mail"));
                lec.setEstado(rs.getBoolean("Estado"));

               
                lector.add(lec);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Lector" + ex.getMessage());
        }
        return lector;
    }
       public Lector buscarLector(int idLector){
           Lector lec = null;
        try {
            String sql = "SELECT * FROM lector WHERE idLector=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLector);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                lec = new Lector();
                lec.setIdLector(idLector);
                lec.setNroSocio(rs.getInt("NroSocio"));
                  lec.setNombre(rs.getString("Nombre"));
                lec.setDomicilio(rs.getString("Domicilio"));
                lec.setMail(rs.getString("mail"));
                lec.setEstado(rs.getBoolean("Estado"));
                        
            }else {
                JOptionPane.showMessageDialog(null, "El Lector no existe");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Lector" + ex.getMessage());
        }
        return lec;
       }
       public Lector bucarLectorPorNroSocio(int nroSocio){
           Lector lec = null;
           try{
           String sql = "SELECT * FROM lector WHERE NroSocio=?";
                 PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroSocio);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                lec = new Lector();
                lec.setIdLector(nroSocio);
                lec.setNroSocio(rs.getInt("NroSocio"));
                  lec.setNombre(rs.getString("Nombre"));
                lec.setDomicilio(rs.getString("Domicilio"));
                lec.setMail(rs.getString("mail"));
                lec.setEstado(rs.getBoolean("Estado"));
                        
            }else {
                JOptionPane.showMessageDialog(null, "El Lector no existe");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Lector" + ex.getMessage());
        }
        return lec;
       }
}