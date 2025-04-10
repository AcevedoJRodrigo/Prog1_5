import java.util.Scanner;

public class activ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String passwordCorrecto = "1234";
        int intentos = 0;
        boolean accesoPermitido = false;

        while (intentos < 3) {
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String password = scanner.nextLine();

            if (usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecto)) {
                accesoPermitido = true;
                break;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intento " + (intentos + 1) + " de 3.");
                intentos++;
            }
        }

        if (accesoPermitido=true) {
            System.out.println("¡Acceso concedido!");
        } else {
            System.out.println("Se ha bloqueado el usuario.");
        }
    }
}