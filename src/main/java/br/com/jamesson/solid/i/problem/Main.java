package br.com.jamesson.solid.i.problem;

public class Main {

    public static void main(String[] args) {
        IAve gaviao = new Gaviao();
        gaviao.bicar();
        gaviao.Voar();

        IAve pinguim = new Pinguim();
        pinguim.bicar();
        pinguim.Voar(); // nao faz sentido
    }

}
