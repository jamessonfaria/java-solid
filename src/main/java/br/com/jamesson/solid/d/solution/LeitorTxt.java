package br.com.jamesson.solid.d.solution;

public class LeitorTxt implements ILeitorArquivo {
    private final String caminho;

    public LeitorTxt(String caminho) {
        this.caminho = caminho;
    }

    @Override
    public void ler() {
        System.out.println("Lendo o TXT ... " + this.caminho);
    }

}
