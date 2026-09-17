import java.util.Scanner;

// Programa para cardápio digital de restaurante

public class TheoBubani_Algoritmo12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demonstração do cardápio para o usuário

        System.out.println("===Cardápio===");
        System.out.println("1 - Bife a cavalo");
        System.out.println("2 - Feijoada");
        System.out.println("3 - Bife à parmegiana");
        System.out.println("4 - Filé de peixe com purê de batata");

        // Solicita a escolha do usuário

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        // Exibe a opção escolhida

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Bife a cavalo.");
                break;

            case 2:
                System.out.println("Você escolheu Feijoada.");
                break;

            case 3:
                System.out.println("Você escolheu Bife à parmegiana.");
                break;

            case 4:
                System.out.println("Você escolheu Filé de peixe com purê de batata.");
                break;

            default:
                System.out.println("Opção inválida.");

        }

        scanner.close();

    }
}