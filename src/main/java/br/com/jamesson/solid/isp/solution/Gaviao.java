package br.com.jamesson.solid.isp.solution;

public class Gaviao implements IAveVoadora {
    @Override
    public void bicar() {
        System.out.println("Gaviao bicando...");
    }

    @Override
    public void Voar() {
        System.out.println("Gaviao voando...");
    }
}
