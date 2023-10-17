package Entidades;
import java.time.LocalDate;
public class Prestamo {
    private int idPrestamo;
    private int Codigo;
    private LocalDate FechaI;
    private LocalDate FechaF;
    private Ejemplar ejemplar;
    private Lector lector;
    private boolean Estado;
    private int Cantidad;

    public Prestamo(int idPrestamo,int Codigo, LocalDate FechaI, LocalDate FechaF, Ejemplar ejemplar, Lector lector, boolean Estado, int Cantidad) {
        this.idPrestamo = idPrestamo;
        this.Codigo = Codigo;
        this.FechaI = FechaI;
        this.FechaF = FechaF;
        this.Estado = Estado;
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.Cantidad = Cantidad;
    }

    public Prestamo(int Codigo,LocalDate FechaI, LocalDate FechaF, Ejemplar ejemplar, Lector lector, boolean Estado, int Cantidad) {
        this.Codigo = Codigo;
        this.FechaI = FechaI;
        this.FechaF = FechaF;
        this.Estado = Estado;
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.Cantidad = Cantidad;
    }
    

public Prestamo() {
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public LocalDate getFechaI() {
        return FechaI;
    }

    public void setFechaI(LocalDate FechaI) {
        this.FechaI = FechaI;
    }

    public LocalDate getFechaF() {
        return FechaF;
    }

    public void setFechaF(LocalDate FechaF) {
        this.FechaF = FechaF;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }


  public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }


    @Override
    public String toString() {
        return  Codigo + " - "+FechaI +  " , " + FechaF + " - " + ejemplar.getIdEjemplar() + " - " + lector.getNombre() ;
    }
     
}