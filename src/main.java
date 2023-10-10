import Data.Conexion;
import Data.EjemplarData;
import Data.LectorData;
import Data.LibroData;
import Data.PrestamoData;
import Entidades.Ejemplar;
import Entidades.Lector;
import Entidades.Libros;
import Entidades.Prestamo;
import java.sql.Connection;
import java.time.LocalDate;

public class main {

    Connection con = Conexion.getConexion();

    public static void main(String[] args) {
        Libros L1 = new Libros("1234567891292", "La casa Blanca", "Rosa Sosa", 1973, "Politica", "Blum", true);
        Libros L2 = new Libros(7, "1234567891270", "Biolagia4", "Jose Perez", 1994, "Biologia", "Planeta", true);
        Libros L3 = new Libros("1234567891236", "El Test", "Jonathan Holms ", 2003, "Ficcion", "Proyecto", true);
        Libros L4 = new Libros("1234567891237", "El Descanso", "Mauro Scistri", 2000, "Novela", "Arbol", true);
        Libros L5 = new Libros("1234567891230", "Decada del 80", "Julio Lezcano", 1984, "Policial", "Guters", true);
         Libros L6 = new Libros("1234567891287", "La Nueva Era", "Julio Salas", 2020, "Realismo", "Planeta", true);
//          LibroData ld = new LibroData();
//         ld.cargarLibro(L6);
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
       // LectorData ld = new LectorData();
        Lector lec5 = new Lector(5, 5, "Juan", "Londres 23", "as@gmail.com", true);
        Lector lec2 = new Lector(2, 2, "juan Gonzales", "Paris 114", "juancito@gmail.com", true);
        //ld.CargarLector(lec5);
        //ld.modificarLector(lec2);
//for(Lector l:ld.listarLectores() ){
        //System.out.println(l.toString());
//}

        //ld.eliminarLector(1);
        //ld.buscarLector(2);
        // System.out.println(ld.bucarLectorPorNroSocio(2).toString());
       // EjemplarData ed = new EjemplarData();
        Ejemplar e1 = new Ejemplar(1, 1, 7, 1, 15);
        Ejemplar e2 = new Ejemplar(2, 2, 5, 1, 5);
        Ejemplar e3 = new Ejemplar(3, 3, 4, 1, 12);
        Ejemplar e4 = new Ejemplar(4, 4, 1, 1, 9);
//ed.cargarEjemplar(e4);
//ed.cargarEjemplar(e2);
//System.out.println(ed.buscarEjemplarPorId(1).toString());
//ed.modificarEjemplar(e1);
//for (Ejemplar e :ed.listaDisponible()){
  //  System.out.println(e.toString());
//}
//ed.eliminarEjemplar(1);
PrestamoData pd =new PrestamoData();

Prestamo p1 = new Prestamo(1,LocalDate.of(2022,5,12),LocalDate.of(2022,7,12),2,1,true,1);
pd.cargarPrestamo(p1);
//for (Prestamo p :pd.listadoDePrestOtorgados()){
 //   System.out.println(p.toString());
//}
    }

}