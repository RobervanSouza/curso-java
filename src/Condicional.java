public class Condicional {
    public static void main(String[] args) {
        System.out.println(" robervan esta aqui!!!");
        System.out.println("filme: Era do gelo");

        int ano = 2021;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (ano >= 2022) {
            System.out.println("lançamento ok");
        }
        else {
            System.out.println("lançamento menor ");

        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) System.out.println("filme liberado !!!");
        else {
            System.out.println("filme não liberado !!!");

        }



    }
}
