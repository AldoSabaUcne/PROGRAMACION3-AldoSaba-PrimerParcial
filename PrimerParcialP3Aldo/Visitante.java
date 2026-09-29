public abstract class Visitante {
    private String nombre;
    private String motivos;
    private long cedula;

    Visitante(String nombre, String motivos, long cedula) {
        this.nombre = nombre;
        this.motivos = motivos;
        this.cedula = cedula;
    }

    public String getnombre() {
        return nombre;
    }

    
    public String getmotivos() {
        return motivos;
    }

    
    public long getcedula() {
        return cedula;
    }

    public abstract void Mostrarinfo();
}