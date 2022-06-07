package br.com.jamesson.solid.i.solution;

/*
*
* ISP - Principio da segregacao de interface
*
* */

import br.com.jamesson.solid.i.problem.Gaviao;
import br.com.jamesson.solid.i.problem.IAve;
import br.com.jamesson.solid.i.problem.Pinguim;

public class Main {

    public static void main(String[] args) {
        br.com.jamesson.solid.i.problem.IAve gaviao = new Gaviao();
        gaviao.bicar();
        gaviao.Voar();

        IAve pinguim = new Pinguim();
        pinguim.bicar();
    }

}
