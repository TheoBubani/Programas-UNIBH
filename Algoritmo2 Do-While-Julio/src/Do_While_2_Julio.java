import java.util.Scanner;

public class Do_While_2_Julio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valor;
        double soma = 0;

        do {

            System.out.print("\nDigite um valor (0 para sair): ");
            valor = leitor.nextDouble();

            soma += valor;

            System.out.println("\nSoma atual: " + soma);

        } while (valor != 0);

        System.out.println("\nSoma final: " + soma);

        leitor.close();

    }
}