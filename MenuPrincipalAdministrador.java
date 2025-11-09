package Sprint2Program.Sprint4;

import java.util.Scanner;

public class MenuPrincipalAdministrador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner para leer opciones -- Rodrigo Martin
        boolean salir = false;
        System.out.println("Bienvenido, AdminGunea"); //Mensaje de bienvenida -- Rodrigo Martin
        while (!salir) {
            System.out.println();
            System.out.println("--Menú Administrador--"); //Menú principal de administración -- Rodrigo Martin
            System.out.println("Seleccione una sección para acceder a sus opciones (1-4)");
            System.out.println("1.Eventos");
            System.out.println("2.Ciudades");
            System.out.println("3.Deportistas");
            System.out.println("4.Ediciones");
            System.out.println("5.Salir del menú");
            int opcionMenu = sc.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println();
                    System.out.println("--Sección Eventos--"); //Gestión básica de eventos -- Rodrigo Martin
                    System.out.println("Escriba una acción (1-4)");
                    System.out.println("1.Registrar evento");
                    System.out.println("2.Eventos existentes");
                    System.out.println("3.Actualizar evento");
                    System.out.println("4.Eliminar evento");
                    int opcionEventos = sc.nextInt();
                    sc.nextLine();
                    switch (opcionEventos) {
                        case 1:
                            System.out.println("Ingrese nombre del evento");
                            String nombreEvento = sc.nextLine();
                            System.out.println("Ingrese descripción del evento");
                            String descripcionEvento = sc.nextLine();
                            System.out.println("Evento registrado exitosamente");
                            break;
                        case 2:
                            System.out.println("Listado de eventos:");
                            System.out.println("*");
                            System.out.println("*");
                            System.out.println("*");
                            System.out.println("*");
                            System.out.println("*");
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre del evento a actualizar");
                            String eventoActualizar = sc.nextLine();
                            System.out.println("Ingrese nuevos datos del evento");
                            String datosEvento = sc.nextLine();
                            System.out.println("Evento actualizado");
                            break;
                        case 4:
                            System.out.println("Ingrese el nombre del evento a eliminar");
                            String eventoEliminar = sc.nextLine();
                            System.out.println("Evento eliminado");
                            break;
                        default:
                            System.out.println("Opción mala, escriba un número del 1 al 4");
                    }
                    break;