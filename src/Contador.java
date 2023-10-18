import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Parametro digitado não corresponde ao tipo inteiro");
        }
    }
    public static void contar(int parametroUm, int parametroDolis) throws ParametrosInvalidosException {
            int quantidade = parametroDolis - parametroUm;
            if (quantidade < 0) {
                System.out.println("O valor do primerio parametro deve ser positivo");
                throw new ParametrosInvalidosException();
            }
            for (int i = 0; i <= quantidade; i++) {
                System.out.println(i);
            }
        }
    }



