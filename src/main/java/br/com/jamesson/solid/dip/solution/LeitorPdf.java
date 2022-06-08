package br.com.jamesson.solid.dip.solution;

public class LeitorPdf implements ILeitorArquivo {
    private final String caminho;

    public LeitorPdf(String caminho) {
        this.caminho = caminho;
    }

    @Override
    public void ler() {
        System.out.println("Lendo o PDF ... " + this.caminho);
    }
}
