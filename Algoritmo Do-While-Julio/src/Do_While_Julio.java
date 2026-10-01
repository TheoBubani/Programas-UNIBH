import java.util.Scanner;

public class Do_While_Julio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int matricula;

        do {

            System.out.print("\nDigite a matrícula: ");
            matricula = leitor.nextInt();

            if (matricula > 0) {

                System.out.print("Digite a primeira nota: ");
                double nota1 = leitor.nextDouble();

                System.out.print("Digite a segunda nota: ");
                double nota2 = leitor.nextDouble();

                System.out.print("Digite a terceira nota: ");
                double nota3 = leitor.nextDouble();

                double media = (nota1 + nota2 + nota3) / 3;

                System.out.println("\nMatrícula: " + matricula);
                System.out.println("Média: " + media);

                if (media >= 70) {
                    System.out.println("\nAluno aprovado!");
                } else if (media >= 60) {
                    System.out.println("\nAluno em exame.");
                } else {
                    System.out.println("\nAluno reprovado.");
                }
            }
        } while (matricula > 0);

        System.out.println("Programa encerrado.");

        leitor.close();

    }
}