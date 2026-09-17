import java.util.Scanner;

// Programa para cálculo de pontuação do aço

public class TheoBubani_Algoritmo04 {

    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados do aço

        System.out.print("Insira a dureza: ");
        double dureza = scanner.nextDouble();

        System.out.print("Insira teor de carvão: ");
        double teor = scanner.nextDouble();

        System.out.print("Insira resistência da tração: ");
        double resistencia = scanner.nextDouble();

        int pontuacao;

        // Verifica as condições para determinar a pontuação do aço

        if (dureza > 50 && teor < 0.7 && resistencia > 5600) {
            pontuacao = 10;

        } else if (dureza > 50 && teor < 0.7) {
            pontuacao = 9;

        } else if (teor < 0.7 && resistencia > 5600) {
            pontuacao = 8;

        } else if (dureza > 50 && resistencia > 5600) {
            pontuacao = 7;

        } else if (dureza > 50 || teor < 0.7 || resistencia > 5600) {
            pontuacao = 6;

        } else {
            pontuacao = 5;

        }

        // Exibe a pontuação obtida

        System.out.println("A pontuação do aço é: " + pontuacao);

        scanner.close();

    }
}