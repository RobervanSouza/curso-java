import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {

        System.out.println("Digita a avaliação do filme: ");
        nota = leitura.nextDouble();
        media = media + nota; // duas formas de usar media += nota;

        }
        System.out.println("Media de avaliação geral foi: " + media/3 );
    }
}
