package Data;
import Entidades.Libros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LibroData {

    private Connection con = null;

    public LibroData() {

        con = Conexion.getConexion();
    }

    public void cargarLibro(Libros libro) {
        String sql = "INSERT INTO libro(isbn,Titulo,Autor,Anio,Tipo,Editorial,Estado)VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, libro.getIsbn());
            ps.setString(2, libro.getTitulo());
            ps.setString(3, libro.getAutor());
            ps.setInt(4, libro.getAnio());
            ps.setString(5, libro.getTipo());
            ps.setString(6, libro.getEditorial());
            ps.setBoolean(7, libro.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                libro.setIdLibro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Libro añadido con exito.");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro");
        }
    }

    public void eliminarLibro(int idLibro) {
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

    public void modificarLibro(Libros libro) {
        String sql = "UPDATE libro SET  titulo=?, autor=?,tipo=?,anio=?,editorial=?"
                + "WHERE idLibro=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getTipo());
            ps.setInt(4, libro.getAnio());
            ps.setString(5, libro.getEditorial());
            ps.setInt(6, libro.getIdLibro());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Libro ya existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros " + ex.getMessage());
        }
    }

    public List<Libros> listarLibros() {

        List<Libros> libro = new ArrayList<>();
        try {
            String sql = "SELECT * FROM libro WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Libros lib = new Libros();

                lib.setIdLibro(rs.getInt("idLibro"));
                lib.setIsbn(rs.getString("isbn"));
                lib.setTitulo(rs.getString("Titulo"));
                lib.setAutor(rs.getString("Autor"));
                lib.setAnio(rs.getInt("Anio"));
                lib.setTipo(rs.getString("Tipo"));
                lib.setEditorial(rs.getString("Editorial"));
                lib.setEstado(rs.getBoolean("Estado"));
                libro.add(lib);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Libros" + ex.getMessage());
        }
        return libro;
    }

    public Libros buscarLibroPorAutor(String autor) {
        Libros lib = null;
        String sql = "SELECT * FROM libro WHERE Autor=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, autor);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lib = new Libros();
                
                lib.setIdLibro(rs.getInt("idLibro"));
                lib.setIsbn(rs.getString("isbn"));
                lib.setTitulo(rs.getString("Titulo"));
                lib.setAutor(rs.getString("Autor"));
                lib.setAnio(rs.getInt("Anio"));
                lib.setTipo(rs.getString("Tipo"));
                lib.setEditorial(rs.getString("Editorial"));
                lib.setEstado(rs.getBoolean("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Libro");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros " + ex.getMessage());
        }

        return lib;
    }
public Libros buscarLibroPorId(String idLibro) {
        Libros lib = null;
        String sql = "SELECT * FROM libro WHERE idLibro=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idLibro);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lib = new Libros();
                
                lib.setIdLibro(rs.getInt("idLibro"));
                lib.setIsbn(rs.getString("isbn"));
                lib.setTitulo(rs.getString("Titulo"));
                lib.setAutor(rs.getString("Autor"));
                lib.setAnio(rs.getInt("Anio"));
                lib.setTipo(rs.getString("Tipo"));
                lib.setEditorial(rs.getString("Editorial"));
                lib.setEstado(rs.getBoolean("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Libro");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros " + ex.getMessage());
        }

        return lib;
    } 
}