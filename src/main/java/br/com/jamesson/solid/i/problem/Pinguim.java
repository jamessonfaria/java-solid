package br.com.jamesson.solid.i.problem;

public class Pinguim implements IAve {
    @Override
    public void bicar() {
        System.out.println("Pinguim bicando...");
    }

    @Override
    public void Voar() {
        // nao faz sentido
    }
}
