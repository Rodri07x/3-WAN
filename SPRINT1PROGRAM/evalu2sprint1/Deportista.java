package evalu2sprint1;

import java.util.ArrayList;

public class Deportista {
    private int dni;
    private String nombre;
    private byte edad;
    private String teléfono;
    private String género;

    private ArrayList<Participación> inscripciones;

    // Constructor
    public Deportista(int dni, String nombre, String teléfono) {
        this.dni = dni;
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.inscripciones = new ArrayList<>();
    }

    public void inscribirse(Edicion edicion) {
        Participación p = new Participación(this, edicion);
        
        this.inscripciones.add(p);
        edicion.añadirParticipacion(p);
        
        System.out.println("--> Inscripción realizada correctamente.");
    }

    public void actualizarTeléfono(String tlf) { //tlf = telefono
        this.teléfono = tlf;
    }

    public String getNombre() { return nombre; }
}