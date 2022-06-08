package br.com.jamesson.solid.dip.solution;

public class Test {

    private final ILeitorArquivo leitor;

    public Test(ILeitorArquivo leitor) {
        this.leitor = leitor;
    }

    public void ler(){
        leitor.ler();
    }
}
