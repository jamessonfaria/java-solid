package br.com.jamesson.solid.d.solution;

/*
* DIP - Principio da inversao de dependencia
*
* */

public class Main {

    public static void main(String[] args) {
        ILeitorArquivo leitor = new LeitorTxt("c:\\work\\arquivo.txt");
        Test test = new Test(leitor);
        test.ler();

        ILeitorArquivo leitor2 = new LeitorPdf("c:\\work\\file.pdf");
        Test test2 = new Test(leitor2);
        test2.ler();

    }

}
