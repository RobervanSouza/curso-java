import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite seu nome:  ");
        String nome = leitura.nextLine();

        System.out.print("Digite seu tipo de conta:  ");
        String conta = leitura.nextLine();

        System.out.print("Digite seu valor:  ");
        int valor = leitura.nextInt();

        System.out.println("********************************** ");

        System.out.println( "\n Nome do cliente: " + nome);
        System.out.println( "\n Tipo de conta " + conta);
        System.out.println( "\n saldo: " + valor +"R$");
        System.out.println("\n ********************************** ");


/*
        System.out.print("Digite 1 para saldo  ");
        int saldo = leitura.nextInt();

        System.out.print("Digite 2 para receber  ");
        int receber = leitura.nextInt();

        System.out.print("Digite 3 para tranferir  ");
        int transferir = leitura.nextInt();

        System.out.print("Digite 4 para sair  ");
        int sair = leitura.nextInt();

        if (saldo == 1) {
            System.out.println("Valor em conta: " + saldo +"R$");
        }



        System.out.print("********************************** ");
        System.out.print("Dados do Cliente");
        */

    }
}

/*





 */