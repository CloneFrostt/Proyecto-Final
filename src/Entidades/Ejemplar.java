package Entidades;
public class Ejemplar {
   private int idEjemplar;
   private int Codigo;
   private int idLibro;
   private  EstadoEjemplar Estado;

    public Ejemplar(int idEjemplar, int Codigo, int idLibro, EstadoEjemplar Estado) {
        this.idEjemplar = idEjemplar;
        this.Codigo = Codigo;
        this.idLibro = idLibro;
        this.Estado = Estado;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public int getCodigo() {
        return Codigo;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public EstadoEjemplar isEstado() {
        return Estado;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public void setEstado(EstadoEjemplar Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "idEjemplar=" + idEjemplar + ", Codigo=" + Codigo + ", idLibro=" + idLibro + ", Estado=" + Estado + '}';
    }
   

}