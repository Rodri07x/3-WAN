package RETO2.SPRINT1PROGRAM;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio_de_sesion {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>(); //Añadimos usuarios y contraseñas a listas (arraylist) -- Rodrigo
        usuarios.add("Aritz");
        usuarios.add("Telmo");
        usuarios.add("Rodrigo");

        ArrayList<String> contraseñas = new ArrayList<>();
        contraseñas.add("claveAritz");
        contraseñas.add("claveTelmo");
        contraseñas.add("claveRodrigo");

        Scanner sc = new Scanner(System.in);
        boolean autenticado = false;

        System.out.println("Iniciar sesión");
        while (!autenticado) {
            System.out.println("Usuario:");
            String usuario = sc.nextLine();
            System.out.println("Contraseña:");
            String contraseña = sc.nextLine();

            for (int i = 0; i < usuarios.size(); i++) {
                if (usuario.equals(usuarios.get(i)) && contraseña.equals(contraseñas.get(i))) {
                    autenticado = true;
                    break;
                }
            }

            if (autenticado) {
                System.out.println("Sesión iniciada");
            } else {
                System.out.println("Error, usuario o contraseña incorrectos");
            }
        }

        sc.close();
    }
}
