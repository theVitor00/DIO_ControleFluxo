import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = scan.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for (int contador = 0; contador < contagem; contador++) {
            System.out.printf("Imprimindo número %d%n", contador + 1);
        }
    }

}
