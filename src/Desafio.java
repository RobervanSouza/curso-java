import java.util.Scanner;

public class Desafio {


    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Scanner opcao2 = new Scanner(System.in);
        int opcao = 0;


        System.out.print("Digite seu nome:  ");
        String nome = leitura.nextLine();

        System.out.print("Digite seu tipo de conta:  ");
        String conta = leitura.nextLine();

        System.out.print("Digite seu valor:  ");
        int valor = leitura.nextInt();

        System.out.println("********************************** ");

        System.out.println("\n Nome do cliente: " + nome);
        System.out.println("\n Tipo de conta " + conta);
        System.out.println("\n saldo: " + valor + "R$");
        System.out.println("\n ********************************** ");

        String menu = """
                    ** Digite a opção **
                    1 - Consultar Saldo
                    2 - Tranferiar valor
                    3 - rebeber valor
                    4 - sair
                """;
        System.out.print(" ");



        while (opcao != 4) {
            System.out.println(menu);
            opcao = opcao2.nextInt();

            if (opcao == 1) {
                System.out.println("\nSaldo: " + valor +"R$");
            } else if (opcao == 2) {
                System.out.print("\nQual o valor que deseja transferir: ");
                double valorConta = opcao2.nextDouble();
                if (valorConta > valor) {
                    System.out.print("\nNão tem saldo suficiente \n");
                } else {
                    valor -= valorConta;
                    System.out.print("Tranferencia realizado con sucesso, Novo Saldo: " + valor +"R$ \n");

                }
            } else if (opcao == 3) {
                System.out.print("Valor Recebido: ");
                double valorRecebido = opcao2.nextDouble();
                valor += valorRecebido;
        } else if (opcao != 4) {
                System.out.print("opção invalida ");


            }


        }


}}
