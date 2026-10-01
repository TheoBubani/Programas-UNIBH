import java.util.Scanner;

public class EstruturasRepeticao_Otaviano_Ativ01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Algoritmo01(leitor);
        Algoritmo02();
        Algoritmo03(leitor);
        Algoritmo04(leitor);
        Algoritmo05(leitor);
        Algoritmo06(leitor);
        Algoritmo07(leitor);
        Algoritmo08(leitor);
        Algoritmo09(leitor);
        Algoritmo10();
        Algoritmo11(leitor);
        Algoritmo15(leitor);

        leitor.close();

    }

    private static void Algoritmo01(Scanner leitor) {
        System.out.println("=== ALGORITMO 01 ===");

        boolean programaAtivo = true;

        while (programaAtivo) {

            System.out.println("\n=== ESCOLHA DE OPERAÇÕES ===");
            System.out.println("\n1 - Soma.");
            System.out.println("2 - Subtração.");
            System.out.println("3 - Multiplicação.");
            System.out.println("4 - Divisão.");
            System.out.println("5 - Sair.");
            System.out.print("\nEscolha a operação que você quer: ");

            int opcao = leitor.nextInt();

            int numero1 = 0;
            int numero2 = 0;

            if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {

                System.out.print("\nDigite o primeiro número: ");
                numero1 = leitor.nextInt();

                System.out.print("Digite o segundo número: ");
                numero2 = leitor.nextInt();

            }

            switch (opcao) {

                case 1:
                    System.out.println("\nOpção 1 selecionada.");

                    int soma = numero1 + numero2;

                    System.out.print("Resultado: " + soma);

                    break;

                case 2:
                    System.out.println("\nOpção 2 selecionada.");

                    int subtracao = numero1 - numero2;

                    System.out.print("Resultado: " + subtracao);

                    break;

                case 3:
                    System.out.println("\nOpção 3 selecionada.");

                    int multiplicacao = numero1 * numero2;

                    System.out.print("Resultado: " + multiplicacao);

                    break;

                case 4:
                    System.out.println("\nOpção 4 selecionada.");


                    if (numero2 == 0) {

                        System.out.println("Não é possível dividir por 0. Voltando ao menu.");

                    } else {

                        int divisao = numero1 / numero2;
                        System.out.print("Resultado: " + divisao);

                    }

                    break;

                case 5:
                    System.out.println("\nOpção 5 selecionada. Encerrando programa.");

                    programaAtivo = false;

                    break;

                default:
                    System.out.println("Opção inválida.");

            }

        }
    }

    private static void Algoritmo02() {
        System.out.println("\n=== ALGORITMO 02 ===");

        int soma = 0;

        for (int contador = 0; contador <= 500; contador += 3) {

            if (contador % 2 == 1) {

                soma += contador;

            }

        }

        System.out.println("\nA soma é: " + soma);

    }

    private static void Algoritmo03(Scanner leitor) {
        System.out.println("\n=== ALGORITMO 03 ===");

        System.out.print("\nDigite o número do funcionário: ");
        int numeroFuncionario = leitor.nextInt();

        System.out.print("Digite a quantos meses o funcionário está na empresa: ");
        int mesesFuncionario = leitor.nextInt();

        int quantidadeFuncionarios = 0;
        int numeroMaisNovo = 0;
        int mesesMaisNovo = 0;
        int numeroMaisAntigo = 0;
        int mesesMaisAntigo = 0;

        while ((numeroFuncionario != 0 || mesesFuncionario != 0) && quantidadeFuncionarios < 300) {

            quantidadeFuncionarios++;

            if (quantidadeFuncionarios == 1) {

                numeroMaisNovo = numeroFuncionario;
                numeroMaisAntigo = numeroFuncionario;
                mesesMaisAntigo = mesesFuncionario;
                mesesMaisNovo = mesesFuncionario;

            }

            if (mesesFuncionario > mesesMaisAntigo) {

                mesesMaisAntigo = mesesFuncionario;
                numeroMaisAntigo = numeroFuncionario;
            }

            if (mesesFuncionario < mesesMaisNovo) {

                mesesMaisNovo = mesesFuncionario;
                numeroMaisNovo = numeroFuncionario;

            }

            if (quantidadeFuncionarios < 300) {

                System.out.print("\nDigite o número do funcionário: ");
                numeroFuncionario = leitor.nextInt();

                System.out.print("Digite a quantos meses o funcionário está na empresa: ");
                mesesFuncionario = leitor.nextInt();

            }

        }

        if (quantidadeFuncionarios == 0) {

            System.out.println("\nNenhum funcionário foi informado.");

        } else {

            System.out.println("\nO funcionário mais novo é: " + numeroMaisNovo + " ele está na empresa há " + mesesMaisNovo + " meses.");
            System.out.println("O funcionário mais antigo é: " + numeroMaisAntigo + " ele está na empresa há " + mesesMaisAntigo + " meses.");
        }
    }

    private static void Algoritmo04(Scanner leitor) {
        System.out.println("\n=== ALGORITMO 04 ===");

        double altura;
        double menorAltura = 0;
        double maiorAltura = 0;
        double somaMulheres = 0;
        double mediaMulheres;

        int sexo;
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;
        int sexoMaior = 0;

        for (int quantidade = 1; quantidade <= 15; quantidade++) {

            System.out.print("\nDigite a sua altura: ");
            altura = leitor.nextDouble();

            System.out.print("Digite o seu sexo (1 - M / 2 - F): ");
            sexo = leitor.nextInt();

            if (quantidade == 1) {

                menorAltura = altura;
                maiorAltura = altura;
                sexoMaior = sexo;

            }

            if (altura < menorAltura) {

                menorAltura = altura;

            }

            if (altura > maiorAltura) {

                maiorAltura = altura;
                sexoMaior = sexo;

            }

            if (sexo == 1) {

                quantidadeHomens++;

            }

            if (sexo == 2) {

                somaMulheres += altura;
                quantidadeMulheres++;

            }

        }

        if (quantidadeMulheres > 0) {

            mediaMulheres = somaMulheres / quantidadeMulheres;


        } else {

            mediaMulheres = 0;

        }

        System.out.println("\nA menor altura do grupo é: " + menorAltura);
        System.out.println("A média de altura das mulheres é: " + mediaMulheres);
        System.out.println("A quantidade de homens é: " + quantidadeHomens);
        System.out.println("O sexo da pessoa mais alta é (1 - M / 2 - F): " + sexoMaior);

    }

    private static void Algoritmo05(Scanner leitor) {
        System.out.println("\n=== ALGORITMO 05 ===");

        double somaSalário = 0;
        double mediaSalário;

        double somaFilhos = 0;
        double mediaFilhos;

        double maiorSalario = 0;
        int salarioAte250 = 0;

        int quantidadePessoas = 0;
        double salario = 0;
        int filhos = 0;
        double percentualAte250 = 0;

        System.out.print("\nDigite o seu salário (Número negativo para sair): R$");
        salario = leitor.nextDouble();

        while (salario >= 0) {

            System.out.print("Digite quantos filhos você tem: ");
            filhos = leitor.nextInt();

            somaSalário += salario;
            somaFilhos += filhos;
            quantidadePessoas++;

            if (salario > maiorSalario) {

                maiorSalario = salario;

            }

            if (salario <= 250 && salario >= 0) {

                salarioAte250++;

            }

            System.out.print("\nDigite o seu salário (Número negativo para sair): R$");
            salario = leitor.nextDouble();

        }

        if (quantidadePessoas > 0) {


            mediaSalário = somaSalário / quantidadePessoas;
            mediaFilhos = somaFilhos / quantidadePessoas;
            percentualAte250 = ((double) salarioAte250 / quantidadePessoas) * 100;

            System.out.println("\nA média dos salários é: R$" + mediaSalário);
            System.out.println("A média de filhos é: " + mediaFilhos);
            System.out.println("O maior salário é: R$" + maiorSalario);
            System.out.println("O percentual de pessoas com salário de 250 para baixo é: " + percentualAte250 + "%");

        } else {

            System.out.println("\nNenhuma pessoa foi cadastrada.");

        }
    }

    private static void Algoritmo06(Scanner leitor) {

        System.out.println("\n=== ALGORITMO 06 ===");

        double valor = 0;
        double media;
        double somaValores = 0;
        double percentualPositivo = 0;
        double percentualNegativo = 0;

        int positivo = 0;
        int negativo = 0;
        int quantidade = 0;
        int opcao;

        boolean programaAtivo = true;

        do {

            System.out.println("\n1 - Adicionar valor.");
            System.out.println("2 - Encerrar.");
            System.out.print("\nEscolha uma das opções: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {

                System.out.print("\nDigite o valor: ");
                valor = leitor.nextDouble();

                if (valor != 0) {

                    somaValores += valor;
                    quantidade++;

                    if (valor < 0) {

                        negativo++;

                    }

                    if (valor > 0) {

                        positivo++;

                    }

                } else {

                    System.out.println("\nValor inválido. Digite valor diferente de 0.");

                }

            } else if (opcao == 2) {

                programaAtivo = false;

            } else {

                System.out.println("\nEscolha uma opção válida.");

            }

        } while (programaAtivo);

        if (quantidade != 0) {

            media = somaValores / quantidade;
            percentualNegativo = ((double) negativo / quantidade) * 100;
            percentualPositivo = ((double) positivo / quantidade) * 100;

            System.out.println("\nA média é: " + media);
            System.out.println("A quantidade de positivos é: " + positivo);
            System.out.println("A quantidade de negativos é: " + negativo);
            System.out.println("A porcentagem de negativos é : " + percentualNegativo + "%");
            System.out.println("A porcentagem de positivos é : " + percentualPositivo + "%");

        } else {

            System.out.println("\nNenhum valor foi cadastrado.");

        }

    }

    private static void Algoritmo07(Scanner leitor) {

        System.out.println("\n=== ALGORITMO 07 ===");

        int opcao;
        int valor;
        int somaValores = 0;
        int quantidade = 0;
        double mediaValores;
        boolean programaAtivo = true;


        while (quantidade < 75 && programaAtivo) {

            System.out.println("\n1 - Adicionar valor.");
            System.out.println("2 - Sair.");
            System.out.print("Qual opção você deseja: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {

                System.out.print("\nDigite o valor: ");
                valor = leitor.nextInt();

                if (valor > 0) {

                    somaValores += valor;
                    quantidade++;

                } else {

                    System.out.println("\nDigite um número válido. (Somente inteiros e positivos)");

                }

            } else if (opcao == 2) {

                System.out.println("\nEncerrando programa.");
                programaAtivo = false;

            } else {

                System.out.println("\nEscolha uma opção válida.");

            }

        }

        if (quantidade > 0) {

            mediaValores = ((double) somaValores / quantidade);
            System.out.println("\nA média é: " + mediaValores);
            System.out.println("A quantidade de valores lidos é: " + quantidade);

        } else {

            System.out.println("\nEncerrando programa.");

        }

    }

    private static void Algoritmo08(Scanner leitor) {

        System.out.println("\n=== ALGORITMO 08 ===");

        String nome = "";
        String nomeMaior = "";
        String nomeMenor = "";

        double altura = 0;
        double menorAltura = 0;
        double maiorAltura = 0;

        double somaAlturaM = 0;
        double somaAlturaF = 0;
        double somaAlturaTurma = 0;

        double mediaAlturaM = 0;
        double mediaAlturaF = 0;
        double mediaAlturaTurma = 0;

        int sexo;
        int mulheres = 0;
        int homens = 0;
        int quantidade = 0;

        leitor.nextLine();

        while (quantidade < 15) {

            quantidade++;

            System.out.print("\nQual o seu nome: ");
            nome = leitor.nextLine();

            System.out.println("Qual a sua altura: ");
            altura = leitor.nextDouble();

            do {

                System.out.println("\nQual o seu sexo (1 - M / 2 - F):");
                sexo = leitor.nextInt();
                leitor.nextLine();

                if (sexo != 1 && sexo != 2) {

                    System.out.println("\nDigite opção válida.");

                }

            } while (sexo != 1 && sexo != 2);

            if (quantidade == 1) {

                maiorAltura = altura;
                menorAltura = altura;
                nomeMaior = nome;
                nomeMenor = nome;

            }

            if (altura > maiorAltura) {

                maiorAltura = altura;
                nomeMaior = nome;

            }

            if (altura < menorAltura) {

                menorAltura = altura;
                nomeMenor = nome;

            }

            if (sexo == 1) {

                somaAlturaM += altura;
                somaAlturaTurma += altura;
                homens++;

            } else if (sexo == 2) {

                somaAlturaF += altura;
                somaAlturaTurma += altura;
                mulheres++;

            }
        }

        if (mulheres > 0) {

            mediaAlturaF = somaAlturaF / mulheres;

        }

        if (homens > 0) {
            mediaAlturaM = somaAlturaM / homens;

        }

        mediaAlturaTurma = somaAlturaTurma / quantidade;

        System.out.println("\nA pessoa mais baixa da turma é: " + nomeMenor + " com seus " + menorAltura + " de altura.");
        System.out.println("A pessoa mais alta da turma é: " + nomeMaior + " com seus " + maiorAltura + " de altura.");
        System.out.println("A média de altura das mulheres é " + mediaAlturaF + " de altura.");
        System.out.println("A média de altura dos homens é " + mediaAlturaM + " de altura.");
        System.out.println("A média de altura da turma é: " + mediaAlturaTurma + " de altura.");

    }

    private static void Algoritmo09(Scanner leitor) {

        System.out.println("\n=== ALGORITMO 09 ===");

        double nota = 0;
        double maiorNota = 0;
        double menorNota = 0;

        final int NOTA_MAXIMA = 15;
        final int NOTA_MINIMA = 0;

        String nome = "";
        String nomeMaior = "";
        String nomeMenor = "";

        int notas;

        System.out.println("\nInforme quantas notas serão lidas: ");
        notas = leitor.nextInt();
        leitor.nextLine();

        for (int quantidade = 1; quantidade <= notas; quantidade++) {

            System.out.println("\nAluno " + quantidade);

            System.out.println("Informe o seu nome: ");
            nome = leitor.nextLine();

            do {

                System.out.println("Informe a sua nota: ");
                nota = leitor.nextDouble();
                leitor.nextLine();

                if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {

                    System.out.println("\nNota inválida. Digite uma nota entre 0 e 15.");

                }

            } while (nota < NOTA_MINIMA || nota > NOTA_MAXIMA);

            if (quantidade == 1) {

                maiorNota = nota;
                menorNota = nota;
                nomeMaior = nome;
                nomeMenor = nome;

            } else {

                if (nota > maiorNota) {

                    maiorNota = nota;
                    nomeMaior = nome;

                }

                if (nota < menorNota) {

                    menorNota = nota;
                    nomeMenor = nome;

                }

            }

        }

        System.out.println("\nO aluno com a maior nota é " + nomeMaior + " e sua nota é: " + maiorNota);
        System.out.println("O aluno com a menor nota é " + nomeMenor + " e sua nota é: " + menorNota);

    }

    private static void Algoritmo10() {

        int quantidade;

        double cm = 0;

        System.out.println("\n=== TABELA POLEGADA --> CM ===");
        System.out.println("\nPOLEGADA\tCM");

        for (quantidade = 1; quantidade <= 20; quantidade++) {

            cm = quantidade * 2.54;

            System.out.println(quantidade + "\t\t" + cm);

        }
    }

    private static void Algoritmo11(Scanner leitor) {

        System.out.println("\n=== ALGORITMO 11 ===");

        int limiteSuperior = 0;
        int limiteInferior = 0;
        int contador = 0;

        int soma = 0;

        System.out.print("\nInforme o limite superior: ");
        limiteSuperior = leitor.nextInt();

        System.out.print("Informe o limite inferior: ");
        limiteInferior = leitor.nextInt();

        if (limiteInferior % 2 != 0) {

            limiteInferior++;

        }

        for (contador = limiteInferior; contador <= limiteSuperior; contador += 2) {

            soma += contador;

        }

        System.out.println("\nA soma dos números pares dentro do limite informado é: " + soma);

    }

    private static void Algoritmo15(Scanner leitor) {

        System.out.println("=== Algoritmo 15 ===");

        int numeroAluno;
        int numeroAlunoMaior = 0;
        int numeroAlunoSegundaMaior = 0;
        int quantidade;

        double notaAluno;
        double maiorNota = 0;
        double segundaMaiorNota = 0;

        final int QUANTIDADE_ALUNOS = 100;

        for (quantidade = 1; quantidade <= QUANTIDADE_ALUNOS; quantidade++) {

            System.out.print("\nInsira número do aluno: ");
            numeroAluno = leitor.nextInt();

            System.out.print("Insira nota do aluno: ");
            notaAluno = leitor.nextDouble();

            if (quantidade == 1) {

                maiorNota = notaAluno;
                numeroAlunoMaior = numeroAluno;

            } else if (quantidade == 2) {

                if (notaAluno > maiorNota) {

                    segundaMaiorNota = maiorNota;
                    maiorNota = notaAluno;
                    numeroAlunoSegundaMaior = numeroAlunoMaior;
                    numeroAlunoMaior = numeroAluno;

                } else if (notaAluno < maiorNota) {

                    segundaMaiorNota = notaAluno;
                    numeroAlunoSegundaMaior = numeroAluno;

                }

            } else {

                if (notaAluno > maiorNota) {

                    segundaMaiorNota = maiorNota;
                    numeroAlunoSegundaMaior = numeroAlunoMaior;
                    maiorNota = notaAluno;
                    numeroAlunoMaior = numeroAluno;

                } else if (notaAluno > segundaMaiorNota) {

                    segundaMaiorNota = notaAluno;
                    numeroAlunoSegundaMaior = numeroAluno;

                }

            }
        }

        System.out.println("\nO aluno com a maior nota é: " + numeroAlunoMaior + " e a sua nota foi: " + maiorNota);
        System.out.println("\nO aluno com a segunda maior nota é: " + numeroAlunoSegundaMaior + " e a sua nota foi: " + segundaMaiorNota);

    }
}