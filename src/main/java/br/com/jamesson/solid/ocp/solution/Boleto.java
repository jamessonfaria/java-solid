package br.com.jamesson.solid.ocp.solution;

public class Boleto implements Instrumento {

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    private String codigoBarras;
    @Override
    public void valido() {
        if (this.codigoBarras.isBlank()) return;
        System.out.println("Dados do boleto estao validos...");
    }

    @Override
    public void cobrar() {
        System.out.println("Cobranca do boleto...");
    }
}
