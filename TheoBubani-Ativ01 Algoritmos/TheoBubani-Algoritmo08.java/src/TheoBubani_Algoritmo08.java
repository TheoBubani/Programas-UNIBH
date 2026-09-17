import java.util.Scanner;

// Programa de calculadora simples

public class TheoBubani_Algoritmo08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Exibe as opções disponíveis

        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        // Verifica se o usuário escolheu sair

        if (opcao == 5) {
            System.out.println("Saindo.");

        } else {

            // Realiza a operação de acordo com a opção escolhida

            switch (opcao) {
                case 1:
                    double soma = numero1 + numero2;
                    System.out.println("Resultado: " + soma);
                    break;

                case 2:
                    double subtracao = numero1 - numero2;
                    System.out.println("Resultado: " + subtracao);
                    break;

                case 3:
                    double multiplicacao = numero1 * numero2;
                    System.out.println("Resultado: " + multiplicacao);
                    break;

                case 4:

                    // Verifica se o segundo número é zero antes da divisão

                    if (numero2 == 0) {
                        System.out.println("Erro: Não é possível dividir por zero.");

                    } else {
                        double divisao = numero1 / numero2;
                        System.out.println("Resultado: " + divisao);
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");

            }

        }

        scanner.close();

    }
}