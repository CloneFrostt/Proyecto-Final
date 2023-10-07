package Entidades;
import java.time.LocalDate;
public class Prestamo {
    private int idPrestamo;
    private LocalDate FechaI;
    private LocalDate FechaF;
    private boolean Estado;
    private int ejemplar;
    private int lector;

    public Prestamo(int idPrestamo, LocalDate FechaI, LocalDate FechaF, boolean Estado, int ejemplar, int lector) {
        this.idPrestamo = idPrestamo;
        this.FechaI = FechaI;
        this.FechaF = FechaF;
        this.Estado = Estado;
        this.ejemplar = ejemplar;
        this.lector = lector;
    }

    public Prestamo(LocalDate FechaI, LocalDate FechaF, boolean Estado, int ejemplar, int lector) {
        this.FechaI = FechaI;
        this.FechaF = FechaF;
        this.Estado = Estado;
        this.ejemplar = ejemplar;
        this.lector = lector;
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

    @Override
    public String toString() {
        return "Prestamo{" + "FechaI=" + FechaI + ", FechaF=" + FechaF + ", Estado=" + Estado + ", ejemplar=" + ejemplar + ", lector=" + lector + '}';
    }
     
}