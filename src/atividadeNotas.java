import java.util.Scanner;

public class atividadeNotas {
    public static void main(String[] args) {
        // Declarar e inicializar a variável

        int media;
        Scanner scanner = new Scanner( System.in);
        System.out.println("informe a media");
        media = scanner.nextInt();


        if (media >= 9) {

            System.out.println("Exc");
        } else if (media >= 7) {
            System.out.println("BOM");
        } else if (media >= 5) {
            System.out.println("Satisfatório");
        } else {

            System.out.println("Insatisfatório");
        }
    }

}

