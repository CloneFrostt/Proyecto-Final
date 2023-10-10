package Data;
import Entidades.Ejemplar;
import Entidades.Lector;
import Entidades.Libros;
import Entidades.Prestamo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PrestamoData {

    private Connection con = null;

    public PrestamoData() {

        con = Conexion.getConexion();
    }

   public void cargarPrestamo(Prestamo pres) {

        String sql = "INSERT INTO prestamo(FechaI,FechaF,idEjemplar,idLector,idLibro,Estado,Cantidad)VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(pres.getFechaI()));
            ps.setDate(2, Date.valueOf(pres.getFechaF()));
            ps.setInt(3, pres.getEjemplar());
            ps.setInt(4, pres.getLector());
            ps.setInt(5, pres.getLibro());
            ps.setBoolean(6, pres.isEstado());
            ps.setInt(7, pres.getCantidad());
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
                pres.setLibro(rs.getInt("idLibro"));
                pres.setEstado(rs.getBoolean("Estado"));
                pres.setCantidad(rs.getInt("Cantidad"));

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
                pres.setLibro(rs.getInt("idLibrp"));
                pres.setEstado(rs.getBoolean("Estado"));
                pres.setCantidad(rs.getInt("Cantidad"));

            } else {
                JOptionPane.showMessageDialog(null, "El Prestamo no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo" + ex.getMessage());
        }
        return pres;

    }

    public void devolucionPrestamo(Prestamo P) {
        String sql = "UPDATE prestamo SET FechaF= ?,Cantidad =? WHERE idPrestamo=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(P.getFechaF()));
            ps.setInt(1, P.getCantidad());
            ps.setInt(3, P.getIdPrestamo());
            ps.executeUpdate(sql);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo" + ex.getMessage());
        }
    }
 public List<Libros>listaLibrosPrestados(){
    List<Libros> libros = new ArrayList<>();
 
          String sql="SELECT Titulo, Autor, Anio FROM libro l,prestamo p  WHERE  l.idLibro = p.idLibro";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
            Libros lib = new Libros();
            lib.setIdLibro(rs.getInt("idLibro"));
            lib.setIsbn(rs.getString("isbn"));
            lib.setTitulo(rs.getString ("Titulo"));
            lib.setAutor(rs.getString("Autor"));
            lib.setAnio(rs.getInt("Anio"));
            lib.setTipo(rs.getString("Tipo"));
            lib.setEditorial(rs.getString("Editorial"));
            lib.setEstado(rs.getBoolean("Estado"));
            libros.add(lib);
            
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo" + ex.getMessage());
        
 }return libros;
}
  public List<Libros>listaLibrosPrestados(LocalDate fecha){
    List<Libros> libros = new ArrayList<>();
 
          String sql="SELECT Titulo, Autor, Anio FROM libro l,prestamo p  WHERE  l.idLibro = p.idLibro AND FechaI = ? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()){
            Libros lib = new Libros();
            lib.setIdLibro(rs.getInt("idLibro"));
            lib.setIsbn(rs.getString("isbn"));
            lib.setTitulo(rs.getString ("Titulo"));
            lib.setAutor(rs.getString("Autor"));
            lib.setAnio(rs.getInt("Anio"));
            lib.setTipo(rs.getString("Tipo"));
            lib.setEditorial(rs.getString("Editorial"));
            lib.setEstado(rs.getBoolean("Estado"));
            
            libros.add(lib);
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo" + ex.getMessage());
        
 }return libros;
}
 public List<Lector>listaLectoresQuePidieronPrestamo(){
    List<Lector> lector = new ArrayList<>();
 
          String sql="SELECT NroSocio,Nombre,Domicilio FROM lector l,prestamo p WHERE  l.idLector = p.idLector ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
           
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()){
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
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo" + ex.getMessage());
        
 }return lector;
}
  public List<Lector>listaLectoresPrestamoVencido(LocalDate fechaD){
    List<Lector> lector = new ArrayList<>();
 
          String sql="SELECT NroSocio,Nombre,Domicilio FROM lector l,prestamo p WHERE  l.idLector = p.idLector AND FechaD < ? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
           ps.setDate(1,Date.valueOf(fechaD));
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()){
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
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo" + ex.getMessage());
        
 }return lector;
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
