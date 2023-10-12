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
        Libros L2 = new Libros("1234567891270", "Biolagia4", "Jose Perez", 1994, "Biologia", "Planeta", true);
        Libros L3 = new Libros("1234567891236", "El Test", "Jonathan Holms ", 2003, "Ficcion", "Proyecto", true);
        Libros L4 = new Libros("1234567891237", "El Descanso", "Mauro Scistri", 2000, "Novela", "Arbol", true);
        Libros L5 = new Libros("1234567891230", "Decada del 80", "Julio Lezcano", 1984, "Policial", "Guters", true);
       //  Libros L6 = new Libros("1234567891287", "La Nueva Era", "Julio Salas", 2020, "Realismo", "Planeta", true);
//      LibroData ld = new LibroData();
//        ld.cargarLibro(L1);
//         ld.cargarLibro(L2);
//         ld.cargarLibro(L3);
//         ld.cargarLibro(L4);
//        ld.cargarLibro(L5);
//        
        //ld.eliminarLibro(4);
//ld.modificarLibro(L5);
//ld.cargarLibro(L2);
//ld.modificarLibro(L2);
//ld.listarLibros();
//ld.buscarLibroPorId(7);

//for(Libros l:ld.listarLibrosPorAutor("Jose Perez")){
        //System.out.println(l.toString());
       
        Lector lec5 = new Lector( 7, "Jose", "Hawaii 23", "asd@gmail.com", true);
        Lector lec2 = new Lector( 2, "juan Gonzales", "Paris 114", "juancito@gmail.com", true);
          Lector lec3 = new Lector( 3, "juana Soria", "Paris 114", "juancito@gmail.com", true);
            Lector lec1 = new Lector( 4, "juan Gonzales", "Av. Belgrano", "juancito@gmail.com", true);
              Lector lec4 = new Lector( 6, "Enrique Goea", "Entre Rios 200", "juancito@gmail.com", true);
//        LectorData ld = new LectorData();
//              ld.CargarLector(lec5);
//              ld.CargarLector(lec2);
//              ld.CargarLector(lec1);
//              ld.CargarLector(lec3);
//              ld.CargarLector(lec4);
        //ld.modificarLector(lec2);
//for(Lector l:ld.listarLectores() ){
        //System.out.println(l.toString());
//}

        //ld.eliminarLector(1);
        //ld.buscarLector(2);
        // System.out.println(ld.bucarLectorPorNroSocio(2).toString());
       
//        Ejemplar e1 = new Ejemplar( 1, 2, 1, 15);
//        Ejemplar e2 = new Ejemplar( 2, 3, 1, 5);
////        Ejemplar e3 = new Ejemplar( 3, 4, 1, 12);
// LibroData ld = new LibroData();
// Libros lib = ld.buscarLibroPorId(2);
//  Ejemplar e4 = new Ejemplar( 7, lib, 1, 9);
// EjemplarData ed = new EjemplarData();
//ed.cargarEjemplar(e1);
//ed.cargarEjemplar(e2);
//ed.cargarEjemplar(e3);
//ed.cargarEjemplar(e4);
//System.out.println(ed.buscarEjemplarPorId(1).toString());
//ed.modificarEjemplar(e1);
//for (Ejemplar e :ed.listaDisponible()){
  //  System.out.println(e.toString());
//}
//ed.eliminarEjemplar(1);
//----------------------------------------------------------------------------------------------------------
EjemplarData ed = new EjemplarData();
LectorData ld = new LectorData();
Ejemplar e =ed.buscarEjemplarPorId(6);
Lector l = ld.buscarLector(3);


//Prestamo p1 = new Prestamo(2,LocalDate.of(2022,5,12),LocalDate.of(2022,7,12),e,l,true,1);
//pd.cargarPrestamo(p1);

Prestamo p1 = new Prestamo(LocalDate.of(2022,5,12),LocalDate.of(2022,7,12),e,l,true,1);
Prestamo p2= new Prestamo(2,LocalDate.of(2023,9,21), LocalDate.of (2023,10,1),e,l,true,2);
//Prestamo p3= new Prestamo(3,LocalDate.of(2023,5,2), LocalDate.of (2023,6,12),4,4,true,2);
//Prestamo p4= new Prestamo(4,LocalDate.of(2023,7,8), LocalDate.of (2023,8,10),5,5,true,2);
PrestamoData pd =new PrestamoData();
pd.cargarPrestamo(p2);
//for (Prestamo p :pd.listadoDePrestOtorgados()){
 //   System.out.println(p.toString());
//}
    }

}