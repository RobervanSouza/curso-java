import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Digite ano do  filme ");
        int anoDoFilme = leitura.nextInt();

        System.out.println("Digite avaliação do filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println("O filme que foi digitado: " + filme);
        System.out.println("O ano  digitado foi: " + anoDoFilme);
        System.out.println("O Avaliação: " + avaliacao);

    }
}
