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

