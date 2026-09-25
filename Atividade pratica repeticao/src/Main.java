import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        double media = 0.00;
        double soma = 0.00;
        int valorUsuario = 0;
        int maiorValor = 0;

        for(contador = 1; contador <= 15; contador++) {
            System.out.print("Informe o número: ");
            valorUsuario = scanner.nextInt();
            soma = soma + valorUsuario;

            if (valorUsuario > maiorValor) {
                maiorValor = valorUsuario;
            }

        }

        System.out.println("O maior número é: " + maiorValor);
        System.out.println("Média:" + soma / 15);

    }
}
