package evalu2sprint1;

import java.util.ArrayList;

public class Edicion {
    private String fecha;
    private String lugarRealización;
    
    private Evento evento;
    private ArrayList<Participación> participaciones;
    private ArrayList<Productos> productos;

    public Edicion(String fecha, String lugar, Evento evento) {
        this.fecha = fecha;
        this.lugarRealización = lugar;
        this.evento = evento;
        this.participaciones = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public void añadirParticipacion(Participación p) {
        this.participaciones.add(p);
    }

    public void añadirProducto(Productos p) {
        this.productos.add(p);
    }

    // Getters
    public String getLugar() { return lugarRealización; }
    public String getFecha() { return fecha; }
    public ArrayList<Participación> getParticipaciones() { return participaciones; }
    
    public ArrayList<Productos> getProductos() { return productos; }
}