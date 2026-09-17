import java.util.Scanner;

// Programa para análise de salário

public class TheoBubani_Algoritmo05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define o valor do salário mínimo

        final double SALARIO_MINIMO = 1621.00;

        // Solicita o salário do usuário

        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        // Verifica se o salário é maior ou igual ao salário mínimo

        if (salario >= SALARIO_MINIMO) {
            System.out.println("Você está ganhando pelo menos um salário mínimo. ");

        } else {
            System.out.println("Você está ganhando menos de um salário mínimo. ");

        }

        scanner.close();

    }
}