import java.util.Scanner;

public class atividadeImparEPar {

        public static void main(String[] args) {

            int numero;
            Scanner scanner = new Scanner( System.in);
            System.out.println("informe o numero");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {

                System.out.println("O número é par.");
            } else {

                System.out.println("O número é ímpar.");
            }
        }

}
