package Entidades;
public class Ejemplar {
   private int idEjemplar;
   private int Codigo;
   private int idLibro;
   private  int Estado;
   private int Cantidad;

    public Ejemplar(int idEjemplar, int Codigo, int idLibro, int Estado,int Cantidad) {
        this.idEjemplar = idEjemplar;
        this.Codigo = Codigo;
        this.idLibro = idLibro;
        this.Estado = Estado;
        this.Cantidad=Cantidad;
    }

    public Ejemplar(int Codigo, int idLibro, int Estado, int Cantidad) {
        this.Codigo = Codigo;
        this.idLibro = idLibro;
        this.Estado = Estado;
        this.Cantidad = Cantidad;
    }

    public Ejemplar() {
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

    public int isEstado() {
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

    public void setEstado(int Estado) {
        this.Estado = Estado;   
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "idEjemplar=" + idEjemplar + ", Codigo=" + Codigo + ", idLibro=" + idLibro + ", Estado=" + Estado + ", Cantidad=" + Cantidad + '}';
    }
}