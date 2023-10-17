import Data.Conexion;

import Data.*;
import Entidades.*;
import java.sql.Connection;
import java.time.LocalDate;

public class main {

    Connection con = Conexion.getConexion();

    public static void main(String[] args) {
//        Libros L1 = new Libros("1234567891292", "La casa Blanca", "Rosa Sosa", 1973, "Politica", "Blum", true);
//        Libros L2 = new Libros("1234567891270", "Biolagia4", "Jose Perez", 1994, "Biologia", "Planeta", true);
//        Libros L3 = new Libros("1234567891236", "El Test", "Jonathan Holms ", 2003, "Ficcion", "Proyecto", true);
//        Libros L4 = new Libros("1234567891237", "El Descanso", "Mauro Scistri", 2000, "Novela", "Arbol", true);
//        Libros L5 = new Libros("1234567891230", "Decada del 80", "Julio Lezcano", 1984, "Policial", "Guters", true);
//        Libros L6 = new Libros("1234567891287", "La Nueva Era", "Julio Salas", 2020, "Realismo", "Planeta", true);
//     LibroData ld = new LibroData();
//        ld.cargarLibro(L1);
//        ld.cargarLibro(L2);
//        ld.cargarLibro(L3);
//        ld.cargarLibro(L4);
//        ld.cargarLibro(L5);
//         ld.cargarLibro(L6);
        //ld.eliminarLibro(4);
//ld.modificarLibro(L5);
//ld.cargarLibro(L2);
//ld.modificarLibro(L2);
//ld.listarLibros();
//ld.buscarLibroPorId(7);

//for(Libros l:ld.listarLibrosPorAutor("Jose Perez")){
        //System.out.println(l.toString());
  //--------------------------------------------------------------------------------------------------------------------------------        
//        Lector lec5 = new Lector( 7, "Jose", "Hawaii 23", "asd@gmail.com", true);
//        Lector lec2 = new Lector( 2, "juan Gonzales", "Paris 114", "juancito@gmail.com", true);
//          Lector lec3 = new Lector( 3, "juana Soria", "Paris 114", "juancito@gmail.com", true);
//            Lector lec1 = new Lector( 5, "Ivanna Jeilinski", "Republica del Libano 542", "okto@gmail.com", true);
//              Lector lec4 = new Lector( 1, "Martin Sosa", "Av. San Martin 2000", "jto@gmail.com", true);
//       LectorData ld = new LectorData();
            // ld.CargarLector(lec5);
            // ld.CargarLector(lec2);
            // ld.CargarLector(lec1);
             //ld.CargarLector(lec3);
           //  ld.CargarLector(lec4);
        //ld.modificarLector(lec2);
//for(Lector l:ld.listarLectores() ){
        //System.out.println(l.toString());
//}

        //ld.eliminarLector(1);
        //ld.buscarLector(2);
        // System.out.println(ld.bucarLectorPorNroSocio(2).toString());
//--------------------------------------------------------------------------------------------------------------------------------       
//
// LibroData ld = new LibroData();
//Libros lib1 = ld.buscarLibroPorId(1);
//Libros lib2 = ld.buscarLibroPorId(2);
//Libros lib3 = ld.buscarLibroPorId(3);
//Libros lib4 = ld.buscarLibroPorId(4);
//Libros lib5 = ld.buscarLibroPorId(5);
//Libros lib6 = ld.buscarLibroPorId(6);
//Ejemplar e1 = new Ejemplar( 1, lib1, "Disponible en Biblioteca", 15);
  //     Ejemplar e2 = new Ejemplar( 2, lib2, "Reparacion", 5);
//      Ejemplar e3 = new Ejemplar( 3, lib3, 1, 12);
//       Ejemplar e4 = new Ejemplar( 4, lib4, 1, 9);
//        Ejemplar e5 = new Ejemplar( 5, lib5, 1, 19);
//        Ejemplar e6 = new Ejemplar( 6, lib6, 1, 11);
//
// EjemplarData ed = new EjemplarData();
//ed.cargarEjemplar(e1);
//ed.cargarEjemplar(e2);
//ed.cargarEjemplar(e3);
//ed.cargarEjemplar(e4);
//ed.cargarEjemplar(e5);
//ed.cargarEjemplar(e6);
//System.out.println(ed.buscarEjemplarPorId(1).toString());
//ed.modificarEjemplar(e1);
//for (Ejemplar e :ed.listaDisponible()){
  //  System.out.println(e.toString());
//}
//ed.eliminarEjemplar(1);
//----------------------------------------------------------------------------------------------------------
//EjemplarData ed = new EjemplarData();
//LectorData ld = new LectorData();
//Ejemplar e1 =ed.buscarEjemplarPorCodigo(1);
//Lector l1 = ld.buscarLector(1);
//Ejemplar e2 =ed.buscarEjemplarPorId(2);
//Lector l2 = ld.buscarLector(2);
//Ejemplar e3 =ed.buscarEjemplarPorId(3);
//Lector l3 = ld.buscarLector(3);
//Ejemplar e4 =ed.buscarEjemplarPorId(4);
//Lector l4 = ld.buscarLector(4);
//
//Prestamo p1 = new Prestamo(LocalDate.of(2023,5,12),LocalDate.of(2023,7,12),e1,l1,true,1);
//Prestamo p2 = new Prestamo(LocalDate.of(2022,5,12),LocalDate.of(2022,7,12),e2,l2,true,1);
//Prestamo p3= new Prestamo(2,LocalDate.of(2023,9,21), LocalDate.of (2023,10,1),e3,l3,true,2);
//Prestamo p4= new Prestamo(3,LocalDate.of(2023,5,2), LocalDate.of (2023,6,12),e4,l4,true,2);

//PrestamoData pd =new PrestamoData();
//pd.cargarPrestamo(p1);
//pd.cargarPrestamo(p2);
//pd.cargarPrestamo(p3);
//pd.cargarPrestamo(p4);

//for (Prestamo p :pd.listadoDePrestOtorgados()){
//    System.out.println(p.toString());
//}
//pd.devolucionPrestamo(p2);
//Prestamo p = pd.buscarPrestamoPorId(1);
//        System.out.println(p.toString());
//for (Lector p :pd.listaLectoresQuePidieronPrestamo()){
  //  System.out.println(p.toString());
//}

    }

}