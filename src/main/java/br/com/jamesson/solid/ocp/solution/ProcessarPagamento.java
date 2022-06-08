package br.com.jamesson.solid.ocp.solution;

public class ProcessarPagamento {

    public void run(Instrumento instrumento){
        instrumento.valido();
        instrumento.cobrar();
    }

}
