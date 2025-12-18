package evalu2sprint1;

public class Participación {
    private int dni; 
    private byte ndeEdición;
    private short ndeInscripción;

    private Deportista deportista;
    private Edicion edicion;

    // Constructor
    public Participación(Deportista deportista, Edicion edicion) {
        this.deportista = deportista;
        this.edicion = edicion;
        generarNroInscripción();
    }

    public void generarNroInscripción() {
        // Genera un número aleatorio para el dorsal --telmo
        this.ndeInscripción = (short) (Math.random() * 999 + 1);
    }

    public Deportista getDeportista() { return deportista; }
    public short getNdeInscripción() { return ndeInscripción; }
}