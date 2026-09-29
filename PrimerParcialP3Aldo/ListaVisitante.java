public class ListaVisitante extends Visitante {
    ListaVisitante(String nombre, String motivo, long cedula) {
        super(nombre, motivo, cedula);
    }

    @Override
    public void Mostrarinfo() {
        System.out.println();
        System.out.println("El nombre de este visitante es: " + getnombre() + ", su motivo de viaje es: " + getmotivos() + ", y su cedula es: " + getcedula() + ".");
        
    }
}