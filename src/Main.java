import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroRandom = (int) (Math.random() * 10 + 1);
        int intento = 0;

        System.out.println("Adivina el número (entre 1 y 10):");

        while (intento != numeroRandom) {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroRandom) {
                System.out.println("Muy bajo, intenta de nuevo.");
            } else if (intento > numeroRandom) {
                System.out.println("Muy alto, intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        }
    }
}