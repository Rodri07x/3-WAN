package evalu2sprint1;

import java.util.ArrayList;

public class Evento {
    private short codEvento;
    private String tipoEvento;
    private String nombre;
    
    private ArrayList<Edicion> ediciones;

    // Constructor
    public Evento(String nombre) {
        this.nombre = nombre;
        this.ediciones = new ArrayList<>();
    }

    public void crearEdición(String fecha, String lugar) {
        // Pasamos 'this' para que la edición sepa de que evento es --Telmo
        Edicion nueva = new Edicion(fecha, lugar, this);
        this.ediciones.add(nueva);
        System.out.println("--> Edición añadida al evento " + this.nombre);
    }

    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public ArrayList<Edicion> getEdiciones() { return ediciones; }
}
