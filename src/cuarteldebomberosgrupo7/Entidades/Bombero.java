package cuarteldebomberosgrupo7.Entidades;

import java.time.LocalDate;

public class Bombero {
    
    //Atributos
    
    private int idBombero;
    private String dni;
    private String nombreApellido;
    private LocalDate fechaNac;
    private String celular;
    private int idBrigada;
    private boolean activo;
    
    //Constructores
    
    public Bombero(){
        
    }

    public Bombero(int idBombero, String dni, String nombreApellido, LocalDate fechaNac, String celular, int idBrigada, boolean activo) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.idBrigada = idBrigada;
        this.activo = activo;
    }

    public Bombero(String dni, String nombreApellido, LocalDate fechaNac, String celular, int idBrigada, boolean activo) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.idBrigada = idBrigada;
        this.activo = activo;
    }
    
    //Metodos

    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIdBrigada() {
        return idBrigada;
    }

    public void setIdBrigada(int idBrigada) {
        this.idBrigada = idBrigada;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Bombero{" + "idBombero=" + idBombero + ", dni=" + dni + ", nombreApellido=" + nombreApellido + ", fechaNac=" + fechaNac + ", celular=" + celular + ", idBrigada=" + idBrigada + ", activo=" + activo + '}';
    }
    
    
    
}
