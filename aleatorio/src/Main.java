import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        long senha = 1000000000L + aleatorio.nextLong(9000000000L);

        System.out.println("Senha: " + senha);
    }
}