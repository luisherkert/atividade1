import java.util.Scanner;

public class atividademaioridade {
    public static void main(String[] args) {

        int idade;
        Scanner scanner = new Scanner( System.in);
        System.out.println("informe a idade");
        idade = scanner.nextInt();


        if (idade >= 18) {

            System.out.println("A pessoa é maior de idade.");
        } else {

            System.out.println("A pessoa é menor de idade.");
        }
    }

}