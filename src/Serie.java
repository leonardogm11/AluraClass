public class Serie { // Na aula Serie troca por Filme

        String nome;
        int anoDeLancamento;
        double somaAvaliacao; //se eu quisece mudar poderia usar Shift + F6 renomeia elemento
        int totalDeAvaliacoes;
        int duracaoEmMinutos;

        void exibeFichaTecnica(){ //mandeira de fazer a ficha técnica. metodo
               // System.out.println(minhaSerie);
                System.out.println("Nome da serie: " + nome);
                System.out.println("O ano de lançamento: "+ anoDeLancamento);
        }

        void avalia(double nota){
                somaAvaliacao += nota;
                totalDeAvaliacoes++; // toda vez que eu der uma avaliação eu vou invrementar aki.

        }

        double obterMedia(){
                return somaAvaliacao / totalDeAvaliacoes;
        }


}
