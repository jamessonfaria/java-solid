package br.com.jamesson.solid.i.problem;

public class Gaviao implements IAve {
    @Override
    public void bicar() {
        System.out.println("Gaviao bicando...");
    }

    @Override
    public void Voar() {
        System.out.println("Gaviao voando...");
    }
}
