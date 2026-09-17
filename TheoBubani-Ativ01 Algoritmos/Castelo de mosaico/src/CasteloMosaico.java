import java.util.Scanner;

public class CasteloMosaico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n = teclado.nextInt();

        if (n < 3 || n > 20) {
            System.out.println("Valor inválido. Digite um número entre 3 e 20.");
        } else {

            System.out.println("--- DIMENSÃO " + n + "x" + n + " ---");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == 0 || i == n - 1) && (j == 0 || j == n - 1)) {
                        System.out.print("+");

                    } else if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("#");

                    } else {
                        System.out.print(".");
                    }
                }

                System.out.println();
            }
        }
    }
}