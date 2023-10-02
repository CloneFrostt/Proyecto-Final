package Entidades;
public class Libros {
   private int idLibro;
   private String isbn;
   private String Titulo;
   private String Autor;
   private int Anio;
   private String Tipo;
   private String Editorial;
   private boolean Estado;

    public Libros(int idLibro, String isbn, String Titulo, String Autor, int Anio, String Tipo, String Editorial, boolean Estado) {
        this.idLibro = idLibro;
        this.isbn = isbn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Anio = Anio;
        this.Tipo = Tipo;
        this.Editorial = Editorial;
        this.Estado = Estado;
    }

    public Libros(String isbn, String Titulo, String Autor, int Anio, String Tipo, String Editorial, boolean Estado) {
        this.isbn = isbn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Anio = Anio;
        this.Tipo = Tipo;
        this.Editorial = Editorial;
        this.Estado = Estado;
    }

    public Libros() {
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Libros{" + "isbn=" + isbn + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Anio=" + Anio + ", Tipo=" + Tipo + ", Editorial=" + Editorial + '}';
    } 
}