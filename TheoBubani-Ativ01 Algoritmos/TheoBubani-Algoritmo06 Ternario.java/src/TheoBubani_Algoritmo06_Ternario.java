import java.util.Scanner;

// Programa para verificação de maioridade

public class TheoBubani_Algoritmo06_Ternario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade do usuário

        System.out.print("Insira a sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se a pessoa é maior de idade

        String resultado = idade >= 18 ? "Você é maior de idade." : "Você é menor de idade.";

        System.out.println(resultado);

        scanner.close();

    }
}