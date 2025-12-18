package evalu2sprint1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Evento> listaEventos = new ArrayList<>();
    static ArrayList<Deportista> listaDeportistas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("\n--- GESTIÓN DE EVENTOS DEPORTIVOS  ---");
            System.out.println("1. Crear Evento");
            System.out.println("2. Crear Edición (dentro de un evento)");
            System.out.println("3. Registrar Deportista");
            System.out.println("4. Inscribir Deportista en Edición");
            System.out.println("5. Gestionar Merchandising");
            System.out.println("6. Listar Todo (Eventos, Inscritos y Productos)");
            System.out.println("7. Salir");
            System.out.print("Seleccione opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1: crearEvento(); break;
                case 2: crearEdicion(); break;
                case 3: registrarDeportista(); break;
                case 4: inscribirDeportista(); break;
                case 5: gestionarProductos(); break;
                case 6: listarTodo(); break;
                case 7: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción incorrecta.");
            }

        } while (opcion != 7);
    }

    public static void crearEvento() {
        System.out.print("Nombre del evento: ");
        String nombre = sc.nextLine();
        listaEventos.add(new Evento(nombre));
        System.out.println("Evento creado.");
    }

    public static void crearEdicion() {
        if (listaEventos.isEmpty()) { System.out.println("No hay eventos."); return; }
        Evento evento = elegirEvento();
        if (evento == null) return;
        System.out.print("Lugar: "); String lugar = sc.nextLine();
        System.out.print("Fecha: "); String fecha = sc.nextLine();
        evento.crearEdición(fecha, lugar);
    }

    public static void registrarDeportista() {
        System.out.print("Nombre: "); String nombre = sc.nextLine();
        System.out.print("Teléfono: "); String tlf = sc.nextLine();
        System.out.print("DNI: "); 
        int dni = 0;
        try { dni = Integer.parseInt(sc.nextLine()); } catch (Exception e) {}
        listaDeportistas.add(new Deportista(dni, nombre, tlf));
        System.out.println("Deportista registrado.");
    }

    public static void inscribirDeportista() {
        if (listaDeportistas.isEmpty() || listaEventos.isEmpty()) { 
            System.out.println("Faltan datos."); return; 
        }
        Deportista dep = elegirDeportista();
        Edicion ed = elegirEdicion();
        if (dep != null && ed != null) {
            dep.inscribirse(ed);
        }
    }


    public static void gestionarProductos() {
        Edicion edicion = elegirEdicion();
        if (edicion == null) return;

        System.out.println("--- Gestión de Productos para: " + edicion.getLugar() + " ---");
        System.out.print("Nombre del producto (ej: Camiseta Oficial): ");
        String nombre = sc.nextLine();
        
        System.out.print("Precio (en €): ");
        double precio = 0.0;
        try { precio = Double.parseDouble(sc.nextLine()); } catch(Exception e) {}

        System.out.print("Stock inicial: ");
        int stock = 0;
        try { stock = Integer.parseInt(sc.nextLine()); } catch(Exception e) {}

        Productos nuevoProducto = new Productos(nombre, precio, stock);
        edicion.añadirProducto(nuevoProducto);
        
        System.out.println("Producto añadido al inventario de la edición.");
    }

    public static void listarTodo() {
        System.out.println("\n--- LISTADO COMPLETO ---");
        for (Evento e : listaEventos) {
            System.out.println("EVENTO: " + e.getNombre());
            for (Edicion ed : e.getEdiciones()) {
                System.out.println("   -> Edición: " + ed.getLugar() + " [" + ed.getFecha() + "]");
                
                ArrayList<Participación> parts = ed.getParticipaciones();
                if (!parts.isEmpty()) {
                    System.out.println("      [Inscritos]:");
                    for (Participación p : parts) {
                        System.out.println("       - " + p.getDeportista().getNombre() + " (Dorsal " + p.getNdeInscripción() + ")");
                    }
                }

                ArrayList<Productos> prods = ed.getProductos();
                if (!prods.isEmpty()) {
                    System.out.println("      [Inventario]:");
                    for (Productos prod : prods) {
                        System.out.println("       - " + prod.getNombre() + " | Precio: " + prod.getPrecio() + "€ | Stock: " + prod.getStock());
                    }
                } else {
                    System.out.println("      (Sin productos a la venta)");
                }
            }
        }
    }

    private static Evento elegirEvento() {
        System.out.println("--- Elige Evento ---");
        for (int i = 0; i < listaEventos.size(); i++) {
            System.out.println(i + ". " + listaEventos.get(i).getNombre());
        }
        try { return listaEventos.get(Integer.parseInt(sc.nextLine())); } 
        catch (Exception e) { return null; }
    }

    private static Deportista elegirDeportista() {
        System.out.println("--- Elige Deportista ---");
        for (int i = 0; i < listaDeportistas.size(); i++) {
            System.out.println(i + ". " + listaDeportistas.get(i).getNombre());
        }
        try { return listaDeportistas.get(Integer.parseInt(sc.nextLine())); } 
        catch (Exception e) { return null; }
    }

    private static Edicion elegirEdicion() {
        Evento ev = elegirEvento();
        if (ev == null) return null;
        if (ev.getEdiciones().isEmpty()) {
            System.out.println("!! Este evento no tiene ediciones.");
            return null;
        }
        System.out.println("--- Elige Edición ---");
        for (int i = 0; i < ev.getEdiciones().size(); i++) {
            System.out.println(i + ". " + ev.getEdiciones().get(i).getLugar());
        }
        try { return ev.getEdiciones().get(Integer.parseInt(sc.nextLine())); } 
        catch (Exception e) { return null; }
    }
}