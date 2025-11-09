package Sprint2Program.Sprint4;

import java.util.Scanner;

public class MenuPrincipalUsuarioFinal {
    public static void main(String[] args) {

        //Declaración de Variables y Datos -- Rodrigo Martin
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        //Menú Principal -- Rodrigo Martin
        System.out.println("Bienvenido, Usuario");
        while (!salir) {
            System.out.println();
            System.out.println("--Menú Usuario--");
            System.out.println("1.Ver información personal");
            System.out.println("2.Gestionar reservas");
            System.out.println("3.Asistencia y soporte");
            System.out.println("4.Darse de baja");
            System.out.println("5.Salir");
            int opcionMenu = sc.nextInt();
            sc.nextLine();
            switch (opcionMenu) { //Opciones enfocadas al usuario final -- Rodrigo Martin
                case 1:
                    System.out.println();
                    System.out.println("--Tu información--"); //Consulta rápida de datos -- Rodrigo Martin
                    System.out.println("Nombre: Usuario Invitado");
                    System.out.println("Correo: usuario@correo.com");
                    System.out.println("Teléfono: 600000000");
                    System.out.println("Estado: Activo");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("--Gestión de reservas--"); //Submenú de reservas -- Rodrigo Martin
                    System.out.println("1.Ver reservas");
                    System.out.println("2.Crear reserva");
                    System.out.println("3.Cancelar reserva");
                    System.out.println("4.Volver");
                    int opcionReserva = sc.nextInt();
                    sc.nextLine();
                    if (opcionReserva == 1) {
                        System.out.println("No tienes reservas activas");
                    } else if (opcionReserva == 2) {
                        System.out.println("Servicio que deseas reservar:");
                        String servicio = sc.nextLine();
                        System.out.println("Fecha solicitada:");
                        String fecha = sc.nextLine();
                        System.out.println("Reserva creada para " + servicio + " el " + fecha);
                    } else if (opcionReserva == 3) {
                        System.out.println("Código de la reserva a cancelar:");
                        String codigo = sc.nextLine();
                        System.out.println("Reserva " + codigo + " cancelada");
                    } else if (opcionReserva == 4) {
                        System.out.println("Volviendo al menú principal");
                    } else {
                        System.out.println("Opción mala, escriba un número del 1 al 4");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("--Asistencia y soporte--"); //Información de ayuda -- Rodrigo Martin
                    System.out.println("1.Consultar preguntas frecuentes");
                    System.out.println("2.Solicitar ayuda urgente");
                    System.out.println("3.Volver");
                    int opcionSoporte = sc.nextInt();
                    sc.nextLine();
                    if (opcionSoporte == 1) {
                        System.out.println("Preguntas frecuentes:");
                        System.out.println("- ¿Cómo cambio mi contraseña?");
                        System.out.println("- ¿Dónde veo mis reservas?");
                        System.out.println("- ¿Cómo contacto con soporte?");
                    } else if (opcionSoporte == 2) {
                        System.out.println("Describe tu incidencia:");
                        String incidencia = sc.nextLine();
                        System.out.println("Hemos registrado tu incidencia: " + incidencia);
                    } else if (opcionSoporte == 3) {
                        System.out.println("Volviendo al menú principal");
                    } else {
                        System.out.println("Opción mala, escriba un número del 1 al 3");
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("--Solicitud de baja--"); //El usuario abandona el servicio -- Rodrigo Martin
                    System.out.println("¿Confirmas que deseas darte de baja? s/n");
                    String confirmacion = sc.nextLine();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        System.out.println("Tu cuenta ha sido dada de baja. Cerrando sesión...");
                        salir = true;
                    } else {
                        System.out.println("Operación cancelada. Tu cuenta sigue activa");
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("Hasta luego"); //Salida del usuario -- Rodrigo Martin
                    break;
                default:
                    System.out.println("Opción mala, escriba un número del 1 al 5"); //Validación del menú principal -- Rodrigo Martin
            }
        }
        sc.close();
    }
}
