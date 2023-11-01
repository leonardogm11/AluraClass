import br.com.jobflix.modelos.Serie;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args) {

       // br.com.jobflix.modelos.Serie minhaSerie = new br.com.jobflix.modelos.Serie(); pegaria a classe serie e dentro da variavel minhaSerie coloca algo.

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Iniciador");
        minhaSerie.setAnoDeLancamento(2023);

        minhaSerie.setDuracaoEmMinutos( 100);


        minhaSerie.exibeFichaTecnica();

        minhaSerie.avalia(6);// nota é uma dica de pra onde ta indo o paramentro.
        minhaSerie.avalia(7);
        minhaSerie.avalia(5);

        System.out.println(minhaSerie.getTotalDeAvaliacoes());
        System.out.println(minhaSerie.obterMedia());



        }
    }
