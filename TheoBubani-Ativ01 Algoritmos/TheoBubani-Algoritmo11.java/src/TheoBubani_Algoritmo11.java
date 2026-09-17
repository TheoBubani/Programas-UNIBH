import java.util.Scanner;

// Programa para verificar tipo de triângulo

public class TheoBubani_Algoritmo11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os três lados do triângulo

        System.out.print("Insira o primeiro lado: ");
        double x = scanner.nextDouble();

        System.out.print("Insira o segundo lado: ");
        double y = scanner.nextDouble();

        System.out.print("Insira o terceiro lado: ");
        double z = scanner.nextDouble();

        // Verifica se os três lados podem formar um triângulo

        if (x + y > z && x + z > y && y + z > x) {

            // Verifica se o triângulo é equilátero

            if (x == y && y == z) {
                System.out.println("O triângulo é equilátero.");

                //Verifica se o triângulo é isósceles
            } else if (x == y || x == z || y == z) {
                System.out.println("O triângulo é isósceles");

                // Caso nenhum lado seja igual, o triângulo é escaleno

            } else {
                System.out.println("O triângulo é escaleno.");
            }

        } else {
            System.out.println("Os lados informados não formam um triângulo.");
        }

        scanner.close();

        }
    }
