import java.util.Random;
import java.util.Scanner;

public class ListaVetores_Otaviano {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);



        Algoritmo01(leitor);
        Algoritmo02(leitor);
        Algoritmo03();
        Algoritmo04();
        Algoritmo05();
        Algoritmo06(leitor);
        Algoritmo07(leitor);
        Algoritmo08();
        Algoritmo09(leitor);
        Algoritmo10(leitor);
        Algoritmo11(leitor);
        Algoritmo12();
        Algoritmo13(leitor);
        Algoritmo14(leitor);
        Algoritmo15(leitor);
        Algoritmo16(leitor);
        Algoritmo17(leitor);
        Algoritmo18(leitor);
        Algoritmo19(leitor);
        Algoritmo20(leitor);



        leitor.close();

    }

    private static void Algoritmo01(Scanner leitor) {

        System.out.println("\n=== ALGORITMO 01 ===");

        int[] numeros = new int[10];

        for (int contador = 0; contador < numeros.length; contador++) {

            System.out.print("\nDigite o " + (contador + 1) + "° número: ");
            numeros[contador] = leitor.nextInt();

        }

        System.out.println("\nN° Primo\tPosição");

        for (int contador = 0; contador < numeros.length; contador++) {

            boolean ehPrimo = true;

            if (numeros[contador] <= 1) {

                ehPrimo = false;

            } else {

                for (int divisor = 2; divisor < numeros[contador]; divisor++) {

                    if (numeros[contador] % divisor == 0) {

                        ehPrimo = false;
                        break;

                    }

                }

            }

            if (ehPrimo) {

                System.out.println(numeros[contador] + "\t        " + contador);

            }
        }
    }

    private static void Algoritmo02(Scanner leitor) {

        System.out.println("\n=== ALGORITMO 02 ===");

        double[] numeros = new double[10];
        double[] numeros2 = new double[10];
        double[] intercalacao = new double[20];

        System.out.println("\n= PRIMEIRO VETOR =");

        for (int contador = 0; contador < numeros.length; contador++) {

            System.out.print("\nDigite o " + (contador + 1) + "° número: ");
            numeros[contador] = leitor.nextDouble();

        }

        System.out.println("\n= SEGUNDO VETOR =");

        for (int contador = 0; contador < numeros2.length; contador++) {

            System.out.print("\nDigite o " + (contador + 1) + "° número: ");
            numeros2[contador] = leitor.nextDouble();

        }

        System.out.println("\n=== INTERCALAÇÃO VETORES ===");
        System.out.println("\nNúmeros\t\tPosição");

        for (int contador = 0; contador < 10; contador++) {

            intercalacao[contador * 2] = numeros[contador];
            intercalacao[contador * 2 + 1] = numeros2[contador];

        }

        for (int contador = 0; contador < intercalacao.length; contador++) {

            System.out.println(intercalacao[contador] + "\t\t" + (contador / 2));

        }

    }

    private static void Algoritmo03() {

        System.out.println("\n=== ALGORITMO 03 ===");

        int[] numeros = new int[10];
        Random aleatorio = new Random();
        int somaVetor = 0;
        double mediaVetor = 0;

        for (int contador = 0; contador < numeros.length; contador++) {

            numeros[contador] = aleatorio.nextInt();

        }

        for (int contador = 0; contador < numeros.length; contador++) {

            somaVetor += numeros[contador];

        }

        mediaVetor = (double) somaVetor / numeros.length;
        System.out.println("A média do vetor é: " + mediaVetor);

    }

    private static void Algoritmo04() {

        System.out.println("\n=== ALGORITMO 04 ===");

        int[] numeros = new int[20];
        Random aleatorio = new Random();
        boolean tem25 = false;

        for (int contador = 0; contador < numeros.length; contador++) {

            numeros[contador] = aleatorio.nextInt(30) + 1;

        }

        for (int contador = 0; contador < numeros.length; contador++) {

            if (numeros[contador] == 25) {

                tem25 = true;

            }

        }

        if (tem25) {

            System.out.println("\nO vetor possui o número 25.");

        } else {

            System.out.println("\nO vetor não possui o número 25.");

        }

    }

    private static void Algoritmo05() {

        System.out.println("\n=== ALGORITMO 05 ===");

        int[] numeros = new int[15];
        Random aleatorio = new Random();
        boolean tem20 = false;

        System.out.println("\nNúmero   Índice");

        for (int contador = 0; contador < numeros.length; contador++) {

            numeros[contador] = aleatorio.nextInt(50) + 1;

        }

        for (int contador = 0; contador < numeros.length; contador++) {

            if (numeros[contador] == 20) {

                tem20 = true;

                System.out.println(numeros[contador] + "       " + contador);

            }

        }

        if (tem20 == false) {

            System.out.println("O vetor não possui o número 20.");

        }

    }

    private static void Algoritmo06(Scanner leitor) {

        System.out.println("\n=== ALGORITMO 06 ===");

        int[] numeros = new int[30];
        Random aleatorio = new Random();
        int valor = 0;
        int qntdValorIgual = 0;

        for (int contador = 0; contador < numeros.length; contador++) {

            numeros[contador] = aleatorio.nextInt(100) + 1;

        }

        System.out.print("\nDigite um número de 1 a 100: ");
        valor = leitor.nextInt();

        System.out.println("\nNúmero   Índice");

        for (int contador = 0; contador < numeros.length; contador++) {

            if (numeros[contador] == valor) {

                qntdValorIgual++;

            }

        }

        int[] numeros2 = new int[30 - qntdValorIgual];

        int contador2 = 0;

        for (int contador = 0; contador < numeros.length; contador++) {

            if (numeros[contador] != valor) {

                numeros2[contador2] = numeros[contador];

                contador2++;

            }

        }

        for (int contador = 0; contador < numeros2.length; contador++) {

            System.out.println(numeros2[contador] + "\t\t " + contador);

        }

    }

    private static void Algoritmo07(Scanner leitor) {

        double[] numeros = new double[5];

        for (int contador = 0; contador < numeros.length; contador++) {

            System.out.print("Digite o " + (contador + 1) + "° número: ");
            numeros[contador] = leitor.nextDouble();

        }

        double menorNumero = numeros[0];
        double maiorNumero = numeros[0];

        for (int contador = 0; contador < numeros.length; contador++) {

            if (numeros[contador] < menorNumero) {

                menorNumero = numeros[contador];

            } else if (numeros[contador] > maiorNumero) {

                maiorNumero = numeros[contador];

            }

        }

        System.out.println("Menor: " + menorNumero);
        System.out.println("Maior: " + maiorNumero);

    }

    private static void Algoritmo08() {

        int[] numeros = new int[15];
        Random aleatorio = new Random();

        System.out.println("");

        for (int contador = 0; contador < numeros.length; contador++) {

            numeros[contador] = aleatorio.nextInt();

        }

        int[] numeros2 = new int[15];

        for (int contador2 = 0; contador2 < numeros.length; contador2++) {

            numeros2[contador2] = numeros[14 - contador2];

            System.out.println(contador2 + "\t\t" + numeros[contador2] + "\t\t" + numeros2[contador2]);

        }

    }

    private static void Algoritmo09(Scanner leitor) {

        int qntdRecibos = 0;

        System.out.print("Insira a quantidade de recibos para imprimir: ");
        qntdRecibos = leitor.nextInt();

        int[] recibos = new int[qntdRecibos];

        for (int contador = 0; contador < recibos.length; contador++) {

            recibos[contador] = contador + 1;

        }

        System.out.println("=== RECIBOS ===");

        for (int contador = 0; contador < recibos.length; contador++) {

            System.out.println(recibos[contador]);

        }

    }

    private static void Algoritmo10(Scanner leitor) {

        int numero = 0;
        int contador = 1;

        System.out.print("Digite o número para a tabuada: ");
        numero = leitor.nextInt();

        int[] tabuada = new int[10];

        for (contador = 1; contador <= tabuada.length; contador++) {

            tabuada[contador - 1] = numero * contador;

        }

        for (contador = 0; contador < tabuada.length; contador++) {

            System.out.println(numero + " * " + (contador + 1) + " é igual a: " + tabuada[contador]);

        }

    }

    private static void Algoritmo11(Scanner leitor) {

        double somaTemperatura = 0;
        double mediaTemperatura = 0;

        double[] temperaturas = new double[10];

        for (int contador = 0; contador < temperaturas.length; contador++) {

            System.out.print("Digite a " + (contador + 1) + "° temperatura: ");
            temperaturas[contador] = leitor.nextDouble();

            somaTemperatura += temperaturas[contador];

        }

        mediaTemperatura = somaTemperatura / temperaturas.length;

        System.out.println("A média das temperaturas é: " + mediaTemperatura);

    }

    private static void Algoritmo12() {

        int[] numerosPares = new int[25];

        for (int contador = 0; contador < numerosPares.length; contador++) {

            numerosPares[contador] = (contador + 1) * 2;

        }

        for (int contador = 0; contador < numerosPares.length; contador++) {

            System.out.println(numerosPares[contador]);

        }

    }

    private static void Algoritmo13(Scanner leitor) {

        int numero = 0;
        int quantidadePrimos = 0;
        boolean ehPrimo = true;

        System.out.print("Insira um número: ");
        numero = leitor.nextInt();

        int[] numerosPrimos = new int[numero];

        for (int contador = 2; contador <= numero; contador++) {

            ehPrimo = true;

            for (int divisor = 2; divisor < contador; divisor++) {

                if (contador % divisor == 0) {

                    ehPrimo = false;
                    break;

                }

            }

            if (ehPrimo) {

                numerosPrimos[quantidadePrimos] = contador;
                quantidadePrimos++;

            }

        }

        for (int contador = 0; contador < quantidadePrimos; contador++) {

            System.out.println("Os números primos são: " + numerosPrimos[contador]);

        }

    }

    private static void Algoritmo14(Scanner leitor) {

        final int TEMPO = 5;
        int etapas = 0;
        int tempoMaximo = 0;

        System.out.print("Insira o número de etapas da produção: ");
        etapas = leitor.nextInt();

        int[] temposEtapas = new int[etapas];

        for (int contador = 0; contador < temposEtapas.length; contador++) {

            temposEtapas[contador] = TEMPO;

        }

        for (int contador = 0; contador < temposEtapas.length; contador++) {

            tempoMaximo += temposEtapas[contador];

        }

        System.out.println("O tempo total de produção é " + tempoMaximo + " minutos");

    }

    private static void Algoritmo15(Scanner leitor) {

        int numeroDigitado = 0;
        int anterior = 0;
        int atual = 1;
        int proximo = 1;

        System.out.print("Insira um número: ");
        numeroDigitado = leitor.nextInt();

        int[] fibonacci = new int[numeroDigitado];

        for (int contador = 0; contador < fibonacci.length; contador++) {

            proximo = anterior + atual;

            fibonacci[contador] = anterior;

            anterior = atual;
            atual = proximo;

        }

        for (int contador = 0; contador < fibonacci.length; contador++) {

            System.out.println(fibonacci[contador]);

        }

    }

    private static void Algoritmo16(Scanner leitor) {

        int[] numeros = new int[5];

        for (int contador = 0; contador < numeros.length; contador++) {

            System.out.print("Insira a resposta: ");
            numeros[contador] = leitor.nextInt();

        }

        for (int contador = 4; contador > -1; contador--) {

            System.out.println(numeros[contador]);

        }

    }

    private static void Algoritmo17(Scanner leitor) {

        double[] numeros = new double[10];
        double somaNotas = 0;
        double mediaNotas = 0;

        for (int contador = 0; contador < numeros.length; contador++) {

            System.out.print("Insira a nota: ");
            numeros[contador] = leitor.nextDouble();

        }

        for (int contador = 0; contador < numeros.length; contador++) {

            somaNotas += numeros[contador];

        }

        mediaNotas = somaNotas / numeros.length;

        System.out.println("A media das notas é: " + mediaNotas);

    }

    private static void Algoritmo18(Scanner leitor) {

        double[] temperaturas = new double[8];
        double maiorTemperatura = Double.NEGATIVE_INFINITY;

        for (int contador = 0; contador < temperaturas.length; contador++) {

            System.out.print("Insira a temperatura: ");
            temperaturas[contador] = leitor.nextDouble();

        }

        for (int contador = 0; contador < temperaturas.length; contador++) {

            if (temperaturas[contador] > maiorTemperatura) {

                maiorTemperatura = temperaturas[contador];

            }

        }

        System.out.println("A maior temperatura é: " + maiorTemperatura);

    }

    private static void Algoritmo19(Scanner leitor) {

        int[] produtos = new int[50];
        int produto = 0;

        Random aleatorio = new Random();

        boolean sistema = false;

        for (int contador = 0; contador < produtos.length; contador++) {

            produtos[contador] = aleatorio.nextInt(50) + 1;

        }

        System.out.print("Insira o código do produto: ");
        produto = leitor.nextInt();

        for (int contador = 0; contador < produtos.length; contador++) {

            if (produto == produtos[contador]) {

                sistema = true;

            }

        }

        if (sistema) {

            System.out.println("O produto existe no sistema.");

        } else {

            System.out.println("O produto não existe no sistema.");

        }

    }

    private static void Algoritmo20(Scanner leitor) {

        double[] precosProdutos = new double[10];
        double auxiliar = 0;

        for (int contador = 0; contador < precosProdutos.length; contador++) {

            System.out.print("Insira o preço do produto: ");
            precosProdutos[contador] = leitor.nextDouble();

        }

        for (int contador = 0; contador < precosProdutos.length - 1; contador++) {

            for (int posicao = 0; posicao < precosProdutos.length - 1 - contador; posicao++) {

                if (precosProdutos[posicao] > precosProdutos[posicao + 1]) {
                    auxiliar = precosProdutos[posicao];
                    precosProdutos[posicao] = precosProdutos[posicao + 1];
                    precosProdutos[posicao + 1] = auxiliar;

                }

            }

        }

        System.out.println("Preços em ordem crescente:");

        for (int contador = 0; contador < precosProdutos.length; contador++) {

            System.out.println(precosProdutos[contador]);

        }

    }

}