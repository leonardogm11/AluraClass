package br.com.jobflix.modelos;

import br.com.jobflix.calculos.Classificavel;

public class Episodio implements Classificavel {
        private int numero;
        private String nome;
        private Serie serie; //variavel serie indica a qual a serie ele pertence.
        private int totaViews;

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Serie getSerie() {
            return serie;
        }

        public void setSerie(Serie serie) {
            this.serie = serie;
        }

    public int getTotaViews() {
        return totaViews;
    }

    public void setTotaViews(int totaViews) {
        this.totaViews = totaViews;
    }

    @Override
    public int getClassificacao() {
        if (totaViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }


}

