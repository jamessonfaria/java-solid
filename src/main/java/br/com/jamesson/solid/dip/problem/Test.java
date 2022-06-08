package br.com.jamesson.solid.dip.problem;

public class Test {

    private final LeitorTxt leitor;

    public Test(LeitorTxt leitor) {
        this.leitor = leitor;
    }

    public void ler(){
        leitor.ler("c:\\work\\arquivo.txt");
    }
}
