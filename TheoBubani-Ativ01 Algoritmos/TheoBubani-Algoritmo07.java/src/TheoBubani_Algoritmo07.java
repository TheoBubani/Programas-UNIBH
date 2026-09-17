import java.util.Scanner;

// Programa para categorizar idade

public class TheoBubani_Algoritmo07 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade do nadador

        System.out.print("Insira a sua idade: ");
        int idade = scanner.nextInt();

        // Verifica a categoria de acordo com a idade

        if (idade <= 7) {
            System.out.println("Infantil.");

        } else if (idade <= 10) {
            System.out.println("Juvenil.");

        } else if (idade <= 15) {
            System.out.println("Adolescente.");

        } else if (idade <= 30) {
            System.out.println("Adulto.");

        } else {
            System.out.println("Sênior.");
        }

        scanner.close();

    }
}