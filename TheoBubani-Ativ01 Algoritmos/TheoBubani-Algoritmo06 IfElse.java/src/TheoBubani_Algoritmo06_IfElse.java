import java.util.Scanner;

// Programa para verificação de maioridade

public class TheoBubani_Algoritmo06_IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade do usuário

        System.out.print("Insira a sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se a pessoa é maior de idade

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");

        } else {
            System.out.println("Você é menor de idade.");
        }

        scanner.close();

    }
}