package br.com.jobflix.modelos;

public class Serie { // Na aula br.com.jobflix.modelos.Serie troca por Filme

        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaAvaliacao; // se eu quisece mudar poderia usar Shift + F6 renomeia elemento
        private int totalDeAvaliacoes;
        private int duracaoEmMinutos;



        public double getSomaAvaliacao(){
                return somaAvaliacao;
        }


        public String getNome() {
                return nome;
        }

        public int getAnoDeLancamento() {
                return anoDeLancamento;
        }

        public boolean isIncluidoNoPlano() {
                return incluidoNoPlano;
        }

        public int getDuracaoEmMinutos() {
                return duracaoEmMinutos;
        }

        public int getTotalDeAvaliacoes(){ //get pra pegar a informação
                return totalDeAvaliacoes;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public void setIncluidoNoPlano(Boolean incluidoNoPlano){
                this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
                this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
                this.anoDeLancamento = anoDeLancamento;
        }



        public void exibeFichaTecnica(){ //mandeira de fazer a ficha técnica. metodo
               // System.out.println(minhaSerie);
                System.out.println("Nome da serie: " + nome);
                System.out.println("O ano de lançamento: "+ anoDeLancamento);
        }

        public void avalia(double nota){
                somaAvaliacao += nota;
                totalDeAvaliacoes++; // toda vez que eu der uma avaliação eu vou invrementar aki.

        }

        public double obterMedia(){

                return somaAvaliacao / totalDeAvaliacoes;
        }


}
