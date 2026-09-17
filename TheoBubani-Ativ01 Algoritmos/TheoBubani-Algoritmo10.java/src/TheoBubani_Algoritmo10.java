import java.util.Scanner;

// Programa para calcular aumento de salário

public class TheoBubani_Algoritmo10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define o salário limite para receber o aumento

        final double SALARIO_LIMITE = 1000.00;

        // Define a porcentagem de aumento

        final double AUMENTO = 0.30;

        // Solicita o salário do usuário

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        // Verifica se o salário está abaixo do limite

        if (salario < SALARIO_LIMITE) {

            //Calcula o novo salário

            double novoSalario = salario + (salario * AUMENTO);

            System.out.println("Você recebeu um aumento de 30%.");
            System.out.println("Novo salário: R$ " + novoSalario);

        } else {

            System.out.println("Você não receberá aumento.");

        }

        scanner.close();

    }
}