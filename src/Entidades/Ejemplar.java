package Entidades;
public class Ejemplar {
   private int idEjemplar;
   private int Codigo;
   private Libros idLibro;
   private  String Estado;
   private int Cantidad;

    public Ejemplar(int idEjemplar, int Codigo, Libros idLibro, String Estado,int Cantidad) {
        this.idEjemplar = idEjemplar;
        this.Codigo = Codigo;
        this.idLibro = idLibro;
        this.Estado = Estado;
        this.Cantidad=Cantidad;
    }

    public Ejemplar(int Codigo, Libros idLibro, String Estado, int Cantidad) {
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

    public Libros getIdLibro() {
        return idLibro;
    }

    public String isEstado() {
        return Estado;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setIdLibro(Libros idLibro) {
        this.idLibro = idLibro;
    }

    public void setEstado(String Estado) {
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