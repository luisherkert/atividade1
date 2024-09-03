import java.util.Scanner;

public class atividademaioridade {
    public static void main(String[] args) {
        // Declarar e inicializar a variável

        int idade = 0;
        Scanner scanner = new Scanner( System.in);
        System.out.println("informe a idade");
        idade = scanner.nextInt();

        // Verificar se a pessoa é maior de idade
        if (idade >= 18) {
            // mensagem se for maior de idade
            System.out.println("A pessoa é maior de idade.");
        } else {
            // mensagem se for menor de idade
            System.out.println("A pessoa é menor de idade.");
        }
    }
}