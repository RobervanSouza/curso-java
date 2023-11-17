
public class Main {
    public static void main(String[] args) {

        System.out.println(" robervan esta aqui!!!");
        System.out.println("filme: Era do gelo");

        int ano = 2023;
        System.out.println("ano de lançamento: "+ ano ); // media dos filmes
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 8.5)/2;
        System.out.println(media);

        String descricao;
        descricao =
                """
                Filme de aventura.
                filme anos 80.
                """ + ano
        ;
        System.out.println(descricao);

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        String nome2 ="João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome2, aulas);

        System.out.println(mensagem);


        int classificacao = (int) (media / 2);
        System.out.println(classificacao);



    }


}


/*
    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }
*/


