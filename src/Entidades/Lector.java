package Entidades;
public class Lector {
    private int idLector;
    private int NroSocio;
    private String nombre;
    private String domicilio;
    private String mail;
    private boolean estado;

    public Lector(int idLector, int NroSocio, String nombre, String domicilio, String mail, boolean estado) {
        this.idLector = idLector;
        this.NroSocio = NroSocio;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.mail = mail;
        this.estado = estado;
    }

    public Lector(int NroSocio, String nombre, String domicilio, String mail, boolean estado) {
        this.NroSocio = NroSocio;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.mail = mail;
        this.estado = estado;
    }

    public Lector() {
    }

    public int getIdLector() {
        return idLector;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public int getNroSocio() {
        return NroSocio;
    }

    public void setNroSocio(int NroSocio) {
        this.NroSocio = NroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Lector{" + "idLector=" + idLector + ", NroSocio=" + NroSocio + ", nombre=" + nombre + ", domicilio=" + domicilio + ", mail=" + mail + ", estado=" + estado + '}';
    }
}