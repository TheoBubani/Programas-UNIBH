import java.util.Scanner;

// Programa para cálculo de venda atacado x varejo

public class TheoBubani_Algoritmo01_Ternario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define o limite para o preço de atacado

        final int LIMITE_DUZIA = 12;

        // Define os preços das maçãs

        final double PRECO_ATACADO = 1.00;
        final double PRECO_VAREJO = 1.30;

        // Solicita e escaneia a quantidade de maçãs compradas

        System.out.print("Quantas maçãs voce comprou: ");
        int quantidade = scanner.nextInt();

        // Define o preço de acordo com a quantidade comprada

        double preco = quantidade >= LIMITE_DUZIA ? PRECO_ATACADO : PRECO_VAREJO;

        // Calcula o preço total da compra

        double custoTotal = quantidade * preco;

        // Imprime o valor da compra

        System.out.println("Custo total: R$" + custoTotal);

        scanner.close();

    }
}