package br.com.jamesson.solid.dip.problem;

public class Main {

    public static void main(String[] args) {
        LeitorTxt leitor = new LeitorTxt();
        Test test = new Test(leitor);
        test.ler();
    }

}
