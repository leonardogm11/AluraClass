package br.com.jobflix.modelos;

public class Serie extends Titulo { // Na aula br.com.jobflix.modelos.Serie troca por Filme

        private int temporadas;
        private boolean ativa;
        private int episodioTemporada;
        private int minustosEpisodio;

        public int getTemporadas() {
                return temporadas;
        }

        public void setTemporadas(int temporadas) {
                this.temporadas = temporadas;
        }

        public boolean isAtiva() {
                return ativa;
        }

        public void setAtiva(boolean ativa) {
                this.ativa = ativa;
        }

        public int getEpisodioTemporada() {
                return episodioTemporada;
        }

        public void setEpisodioTemporada(int episodioTemporada) {
                this.episodioTemporada = episodioTemporada;
        }

        public int getMinustosEpisodio() {
                return minustosEpisodio;
        }

        public void setMinustosEpisodio(int minustosEpisodio) {
                this.minustosEpisodio = minustosEpisodio;
        }

        @Override
        public int getDuracaoEmMinutos() { // especializando a classe.
                return temporadas * episodioTemporada * minustosEpisodio;
        }
}
