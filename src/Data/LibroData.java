package Data;
import Entidades.Libros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LibroData {
   private Connection con = null;
   
    public LibroData() {

        con = Conexion.getConexion();
    }
    public void cargarLibro(Libros libro){
    String sql= "INSERT INTO libro(isbn,Titulo,Autor,Anio,Tipo,Editorial,Estado)VALUES (?,?,?,?,?,?,?)";
       try {
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1,libro.getIsbn());
           ps.setString(2,libro.getTitulo());
           ps.setString(3,libro.getAutor());
           ps.setInt(4,libro.getAnio());
           ps.setString(5,libro.getTipo());
           ps.setString(6,libro.getEditorial());
           ps.setBoolean(7,libro.isEstado());
           ps.executeUpdate();
           ResultSet rs=ps.getGeneratedKeys();
           if(rs.next()){
           libro.setIdLibro(rs.getInt(1));
              JOptionPane.showMessageDialog(null, "Libro añadido con exito.");
              
           } 
           ps.close();
       } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro");
       }
    }
    private void eliminarLibro(int idLibro){
     try {
            String sql = "UPDATE libro SET estado = 0 WHERE idLibro = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLibro);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó un libro");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Libro");
        }
    }
}