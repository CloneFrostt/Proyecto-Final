package Entidades;
import java.time.LocalDate;
public class Prestamo {
    private int idPrestamo;
    private LocalDate FechaI;
    private LocalDate FechaF;
    private int ejemplar;
    private int lector;
    private boolean Estado;
    private int Cantidad;

    public Prestamo(int idPrestamo, LocalDate FechaI, LocalDate FechaF, int ejemplar, int lector, boolean Estado, int Cantidad) {
        this.idPrestamo = idPrestamo;
        this.FechaI = FechaI;
        this.FechaF = FechaF;
        this.Estado = Estado;
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.Cantidad = Cantidad;
    }

    public Prestamo(LocalDate FechaI, LocalDate FechaF, int ejemplar, int lector, boolean Estado, int Cantidad) {
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

    public int getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(int ejemplar) {
        this.ejemplar = ejemplar;
    }

    public int getLector() {
        return lector;
    }

    public void setLector(int lector) {
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
        return "Prestamo{" + "FechaI=" + FechaI + ", FechaF=" + FechaF + ", Estado=" + Estado + ", ejemplar=" + ejemplar + ", lector=" + lector + '}';
    }
     
}