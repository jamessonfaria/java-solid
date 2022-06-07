package br.com.jamesson.solid.o.solution;

public class ProcessarPagamento {

    public void run(Instrumento instrumento){
        instrumento.valido();
        instrumento.cobrar();
    }

}
