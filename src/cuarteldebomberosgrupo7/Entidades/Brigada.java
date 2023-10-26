package cuarteldebomberosgrupo7.Entidades;

public class Brigada {
    
    //Atributos
    
    private int idBrigada;
    private String nombreBr;
    private String especialidad;
    private boolean libre;
    private int idCuartel;
    
    //Coonstructores

    public Brigada() {
    }

    public Brigada(int idBrigada, String nombreBr, String especialidad, boolean libre, int idCuartel) {
        this.idBrigada = idBrigada;
        this.nombreBr = nombreBr;
        this.especialidad = especialidad;
        this.libre = libre;
        this.idCuartel = idCuartel;
    }

    public Brigada(String nombreBr, String especialidad, boolean libre, int idCuartel) {
        this.nombreBr = nombreBr;
        this.especialidad = especialidad;
        this.libre = libre;
        this.idCuartel = idCuartel;
    }
    
    //Metodos

    public int getIdBrigada() {
        return idBrigada;
    }

    public void setIdBrigada(int idBrigada) {
        this.idBrigada = idBrigada;
    }

    public String getNombreBr() {
        return nombreBr;
    }

    public void setNombreBr(String nombreBr) {
        this.nombreBr = nombreBr;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getIdCuartel() {
        return idCuartel;
    }

    public void setIdCuartel(int idCuartel) {
        this.idCuartel = idCuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "idBrigada=" + idBrigada + ", nombreBr=" + nombreBr + ", especialidad=" + especialidad + ", libre=" + libre + ", idCuartel=" + idCuartel + '}';
    }
    
    
    
}
