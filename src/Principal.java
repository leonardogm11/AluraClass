import br.com.jobflix.calculos.CalculadoraDeTempo;
import br.com.jobflix.calculos.FiltroRecomendacao;
import br.com.jobflix.modelos.Episodio;
import br.com.jobflix.modelos.Filme;
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

        Serie nomeSerie = new Serie();
        nomeSerie.setNome("The Wicher");
        nomeSerie.setAnoDeLancamento(2022);
        nomeSerie.exibeFichaTecnica();
        nomeSerie.setTemporadas(2);
        nomeSerie.setEpisodioTemporada(8);
        nomeSerie.setMinustosEpisodio(90);
        System.out.println("Para terminar a serie são: " + nomeSerie.getDuracaoEmMinutos());
        //=====================================================================================

        Filme meuFilme = new Filme();
        meuFilme.setNome("Luqueta Jumper");
        meuFilme.setAnoDeLancamento(2009);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme "+meuFilme.getDuracaoEmMinutos());



        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempT());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNome("Dark");
        episodio.setNumero(300);
        filtro.filtra(episodio);


        }
    }
