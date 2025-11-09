package Sprint2Program.Sprint4;

import java.util.Scanner;

public class Inicio_de_sesion {
    public static void main(String[] args) {
        String[] usuarios = {"Daniel", "Telmo", "Rodrigo"};
        String[] contraseñas = {"claveDaniel", "claveTelmo", "claveRodrigo"};

        Scanner sc = new Scanner(System.in);
        boolean autenticado = false;

        System.out.println("Iniciar sesión");
        while (!autenticado) {
            System.out.println("Usuario:");
            String usuario = sc.nextLine();
            System.out.println("Contraseña:");
            String contraseña = sc.nextLine();

            for (int i = 0; i < usuarios.length; i++) {
                if (usuario.equals(usuarios[i]) && contraseña.equals(contraseñas[i])) {
                    autenticado = true;
                    break; // no le gusta usar break a Egoitz pero lo pongo porque a mi si -- Rodrigo
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
