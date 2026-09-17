import java.util.Scanner;

// Programa para cálculo de saldo do usuário

public class TheoBubani_Algoritmo03_IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        // Solicita o atual saldo da conta

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Solicita o valor do débito

        System.out.print("Digite o débito: ");
        double debito = scanner.nextDouble();

        //Solicita o valor do crédito

        System.out.print("Digite o crédito: ");
        double credito = scanner.nextDouble();

        // Calcula o saldo após o débito e o crédito

        double saldoAtual = saldo - debito + credito;

        System.out.println("Saldo atual: " + saldoAtual);

        // Verifica se o saldo atual é positivo ou negativo

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo. ");
        } else {
            System.out.println("Saldo Negativo. ");

        }

        scanner.close();

    }
}

