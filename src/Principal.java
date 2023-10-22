// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args) {

       // Serie minhaSerie = new Serie(); pegaria a classe serie e dentro da variavel minhaSerie coloca algo.

        Serie minhaSerie = new Serie();
        minhaSerie.nome = "Iniciador";
        minhaSerie.anoDeLancamento = 2022;
        minhaSerie.somaAvaliacao = 8.0;
        minhaSerie.totalDeAvaliacoes = 0;

        minhaSerie.exibeFichaTecnica();

        minhaSerie.avalia(6);// nota é uma dica de pra onde ta indo o paramentro.
        minhaSerie.avalia(7);
        minhaSerie.avalia(5);
        System.out.println(minhaSerie.somaAvaliacao);
        System.out.println(minhaSerie.totalDeAvaliacoes);
        System.out.println(minhaSerie.obterMedia());



        }
    }
