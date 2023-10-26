package cuarteldebomberosgrupo7.Entidades;

import java.time.LocalDate;

public class Siniestro {
    
    //Atributos
    
    private int idSiniestro;
    private String tipo;
    private LocalDate fechaSiniestro;
    private int coordX;
    private int coordY;
    private String detalles;
    private LocalDate fechaResul;
    private int puntuacion;
    private int idBrigada;
    
    //Constructores

    public Siniestro() {
    }

    public Siniestro(int idSiniestro, String tipo, LocalDate fechaSiniestro, int coordX, int coordY, String detalles, LocalDate fechaResul, int puntuacion, int idBrigada) {
        this.idSiniestro = idSiniestro;
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordX = coordX;
        this.coordY = coordY;
        this.detalles = detalles;
        this.fechaResul = fechaResul;
        this.puntuacion = puntuacion;
        this.idBrigada = idBrigada;
    }

    public Siniestro(String tipo, LocalDate fechaSiniestro, int coordX, int coordY, String detalles, LocalDate fechaResul, int puntuacion, int idBrigada) {
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordX = coordX;
        this.coordY = coordY;
        this.detalles = detalles;
        this.fechaResul = fechaResul;
        this.puntuacion = puntuacion;
        this.idBrigada = idBrigada;
    }
    
    //Metodos

    public int getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(int idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(LocalDate fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFechaResul() {
        return fechaResul;
    }

    public void setFechaResul(LocalDate fechaResul) {
        this.fechaResul = fechaResul;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getIdBrigada() {
        return idBrigada;
    }

    public void setIdBrigada(int idBrigada) {
        this.idBrigada = idBrigada;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "idSiniestro=" + idSiniestro + ", tipo=" + tipo + ", fechaSiniestro=" + fechaSiniestro + ", coordX=" + coordX + ", coordY=" + coordY + ", detalles=" + detalles + ", fechaResul=" + fechaResul + ", puntuacion=" + puntuacion + ", idBrigada=" + idBrigada + '}';
    }
    
    
    
}
