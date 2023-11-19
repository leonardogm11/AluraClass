package br.com.jobflix.calculos;

import br.com.jobflix.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempT = 0;

    public int getTempT (){
        return this.tempT; //this opcional
    }

    public void inclui(Titulo titulo){
        this.tempT +=titulo.getDuracaoEmMinutos();
    }

}
