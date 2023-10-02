package Entidades;
public class Ejemplar {
   private int idEjemplar;
   private int Codigo;
   private int idLibro;
   private boolean Estado;

    public Ejemplar(int idEjemplar, int Codigo, int idLibro, boolean Estado) {
        this.idEjemplar = idEjemplar;
        this.Codigo = Codigo;
        this.idLibro = idLibro;
        this.Estado = Estado;
    }

    public Ejemplar(int Codigo, int idLibro) {
        this.Codigo = Codigo;
        this.idLibro = idLibro;
    }

    public Ejemplar() {
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "idEjemplar=" + idEjemplar + ", Codigo=" + Codigo + ", idLibro=" + idLibro + ", Estado=" + Estado + '}';
    }
    
}