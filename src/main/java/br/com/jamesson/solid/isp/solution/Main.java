package br.com.jamesson.solid.isp.solution;

/*
*
* ISP - Principio da segregacao de interface
*
* */

import br.com.jamesson.solid.isp.problem.Gaviao;
import br.com.jamesson.solid.isp.problem.IAve;
import br.com.jamesson.solid.isp.problem.Pinguim;

public class Main {

    public static void main(String[] args) {
        br.com.jamesson.solid.isp.problem.IAve gaviao = new Gaviao();
        gaviao.bicar();
        gaviao.Voar();

        IAve pinguim = new Pinguim();
        pinguim.bicar();
    }

}
