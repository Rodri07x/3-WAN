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
        }
        sc.close();
    }
}
