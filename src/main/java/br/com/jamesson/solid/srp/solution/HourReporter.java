package br.com.jamesson.solid.srp.solution;

public class HourReporter {
    public void reportHours(String origem){
        System.out.println(origem + ": Reportando horas do funcionario....");
        Hour.regularHours();
    }
}
