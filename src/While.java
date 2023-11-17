import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalAvaliacao = 0;

        while (nota != -1) {

            System.out.println("Digita a avaliação do filme ou -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota != -1){

            media = media + nota; // duas formas de usar media += nota;
            totalAvaliacao++;
            }

        }
        System.out.println("Media de avaliação geral foi: " + media/totalAvaliacao );
    }
}
