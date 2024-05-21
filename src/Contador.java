import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.println("Digite o primeiro parâmetro");
        parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e){

            System.out.println(e.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        int contagem = parametroDois - parametroUm;

        if(parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior do que o primeiro!");
        }
        else {

            for (int i = 1; i < contagem; i++) {
                System.out.println("Imprimindo o número: " + i);
            }

            System.out.println("\nTotal de interações: " + contagem);
        }
    }
}
