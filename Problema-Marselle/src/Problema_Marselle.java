import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double tamanho_marselle = 1.50;
        double tamanho_giovanna = 1.10;
        int ano = 0;

        while (tamanho_giovanna < tamanho_marselle) {

            tamanho_marselle = tamanho_marselle + 0.02;
            tamanho_giovanna = tamanho_giovanna + 0.03;
            ano = ano + 1;

        }

        System.out.println("\nPara Giovanna passar Marselle, serão necessários: " + ano + " anos.");

    }
}