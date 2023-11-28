package br.com.jobflix.modelos;

import br.com.jobflix.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { // implemetes usando pra n usar dois extends.
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome,anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) obterMedia() / 2;  //casting
    }
}
