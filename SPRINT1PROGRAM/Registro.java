package RETO2.SPRINT1PROGRAM;


import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();
        usuarios.add("Daniel");
        usuarios.add("Telmo");

        ArrayList<String> contraseñas = new ArrayList<>();
        contraseñas.add("claveDaniel");
        contraseñas.add("claveTelmo");

        boolean registro = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Registro");
        while (registro) {
            System.out.println("Usuario:");
            String usuario = sc.nextLine();

            if (usuario.length() > 15) {  // Comprobar que lo que ponga el usuario sea menos de 15 caracteres -- Rodrigo
                System.out.println("Error, el usuario debe de tener menos de 15 caracteres");
                System.out.println("Inténtelo de nuevo");
                continue;
            }

            System.out.println("Contraseña:");
            String contraseña = sc.nextLine();
            System.out.println("Confirmar contraseña:");
            String confirmarcontraseña = sc.nextLine();

            if (!contraseña.equals(confirmarcontraseña)) { // Que la constraseña sea igual a la puesta en confirmar contraseña -- Rodrigo
                System.out.println("Error, las contraseñas no coinciden");
                System.out.println("Inténtelo de nuevo");
                continue;
            }

            usuarios.add(usuario);
            contraseñas.add(contraseña);
            System.out.println("Registro exitoso. Usuarios registrados:");
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println("- " + usuarios.get(i));
            }
            registro = false;
        }

        sc.close(); // Terminamos el Scanner aqui porque lo dijo Egoitz ya que podria dar bugs-- Rodrigo
    }
}
