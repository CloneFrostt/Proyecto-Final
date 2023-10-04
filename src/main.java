import Data.Conexion;
import Data.LectorData;
import Data.LibroData;
import Entidades.Lector;
import Entidades.Libros;
import java.sql.Connection;

public class main {

    Connection con = Conexion.getConexion();

    public static void main(String[] args) {
        Libros L1 = new Libros("1234567891292", "La casa Blanca", "Rosa Sosa", 1973, "Politica", "Blum", true);
        Libros L2 = new Libros(7,"1234567891270", "Biolagia4", "Jose Perez", 1994, "Biologia", "Planeta", true);
        Libros L3 = new Libros("1234567891236", "El Test", "Jonathan Holms ", 2003, "Ficcion", "Proyecto", true);
        Libros L4 = new Libros("1234567891237", "El Descanso", "Mauro Scistri", 2000, "Novela", "Arbol", true);
        Libros L5 = new Libros("1234567891230", "Decada del 80", "Julio Lezcano", 1984, "Policial", "Guters", true);
      //  LibroData ld = new LibroData();
       // ld.cargarLibro(L1);
       // ld.cargarLibro(L2);
       // ld.cargarLibro(L3);
       // ld.cargarLibro(L4);
       // ld.cargarLibro(L5);
       // ld.cargarLibro(L5);
       //ld.eliminarLibro(4);
//ld.modificarLibro(L5);
//ld.cargarLibro(L2);
//ld.modificarLibro(L2);
//ld.listarLibros();
//ld.buscarLibroPorId(7);

//for(Libros l:ld.listarLibrosPorAutor("Jose Perez")){
    //System.out.println(l.toString());
    LectorData ld=new LectorData();
    Lector lec1 = new Lector(1,1,"Rebeca Pla","Londres 20","rebepla@gmail.com",true);
    Lector lec2 =new Lector (2,2,"juan Gonzales","Paris 114","juancito@gmail.com",true);
    //ld.CargarLector(lec2);
    //ld.modificarLector(lec2);
//for(Lector l:ld.listarLectores() ){
    //System.out.println(l.toString());
//}

     ld.eliminarLector(1);
    }
}