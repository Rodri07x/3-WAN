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
                case 2:
                    System.out.println();
                    System.out.println("--Sección Ciudades--"); //Opciones para ciudades de la agenda -- Rodrigo Martin
                    System.out.println("Escriba una acción (1-4)");
                    System.out.println("1.Registrar ciudad");
                    System.out.println("2.Ciudades registradas");
                    System.out.println("3.Actualizar ciudad");
                    System.out.println("4.Eliminar ciudad");
                    int opcionCiudades = sc.nextInt();
                    sc.nextLine();
                    switch (opcionCiudades) {
                        case 1:
                            System.out.println("Ingrese nombre de la ciudad");
                            String nombreCiudad = sc.nextLine();
                            System.out.println("Ingrese país de la ciudad");
                            String paisCiudad = sc.nextLine();
                            System.out.println("Ciudad registrada exitosamente");
                            break;
                        case 2:
                            System.out.println("Listado de ciudades:");
                            System.out.println("*");
                            System.out.println("*");
                            System.out.println("*");
                            System.out.println("*");
                            System.out.println("*");
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre de la ciudad a actualizar");
                            String ciudadActualizar = sc.nextLine();
                            System.out.println("Ingrese nuevos datos de la ciudad");
                            String datosCiudad = sc.nextLine();
                            System.out.println("Ciudad actualizada");
                            break;
                        case 4:
                            System.out.println("Ingrese el nombre de la ciudad a eliminar");
                            String ciudadEliminar = sc.nextLine();
                            System.out.println("Ciudad eliminada");
                            break;
                        default:
                            System.out.println("Opción mala, escriba un número del 1 al 4");
                    }
                    break;
                    case 3:
                    System.out.println();
                    System.out.println("--Sección Deportistas--"); //Gestión y consultas de deportistas -- Rodrigo Martin
                    System.out.println("Escriba una acción (1-6)");
                    System.out.println("1.Registrar deportista");
                    System.out.println("2.Deportistas activos");
                    System.out.println("3.Horario del deportista");
                    System.out.println("4.Competición próxima");
                    System.out.println("5.Actualizar datos del deportista");
                    System.out.println("6.Eliminar deportista");
                    int opcionDeportistas = sc.nextInt();
                    sc.nextLine();
                    switch (opcionDeportistas) {
                        case 1:
                            System.out.println("Ingrese nombre del deportista");
                            String nombreDeportista = sc.nextLine();
                            System.out.println("Ingrese categoría del deportista");
                            String categoriaDeportista = sc.nextLine();
                            System.out.println("Deportista inscrito exitosamente");
                            break;
                        case 2:
                            System.out.println("Listado de deportistas activos:");
                            System.out.println("*");
                            System.out.println("*");
                            System.out.println("*");
                            System.out.println("*");
                            System.out.println("*");
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre del deportista para ver horario");
                            String deportistaHorario = sc.nextLine();
                            System.out.println("El horario de " + deportistaHorario + " es de 08:00 a 20:00");
                            break;
                        case 4:
                            System.out.println("Ingrese el nombre del deportista para ver competición");
                            String deportistaCompeticion = sc.nextLine();
                            System.out.println("La próxima competición de " + deportistaCompeticion + " es el mes próximo");
                            break;
                        case 5:
                            System.out.println("Ingrese el nombre del deportista a actualizar");
                            System.out.println("Ingrese nuevos datos del deportista");
                            String datosDeportista = sc.nextLine();
                            System.out.println("Datos actualizados");
                            break;
                        case 6:
                            System.out.println("Ingrese el nombre del deportista a eliminar");
                            String deportistaEliminar = sc.nextLine();
                            System.out.println("Deportista eliminado");
                            break;
                        default:
                            System.out.println("Opción mala, escriba un número del 1 al 6");
                    }
                    break;