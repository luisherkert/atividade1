import java.util.Scanner;

public class atividadeImparEPar {

        public static void main(String[] args) {
            // 1. Crie uma variável que armazene um número inteiro
            // Você pode alterar esse valor para testar diferentes números

            int numero;
            Scanner scanner = new Scanner( System.in);
            System.out.println("informe o numero");
            numero = scanner.nextInt();
            // 2. Verifique se o número é par ou ímpar
            if (numero % 2 == 0) {
                // Imprima uma mensagem se o número for par
                System.out.println("O número é par.");
            } else {
                // Imprima uma mensagem se o número for ímpar
                System.out.println("O número é ímpar.");
            }
        }

}
