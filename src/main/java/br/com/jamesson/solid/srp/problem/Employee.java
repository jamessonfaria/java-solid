package br.com.jamesson.solid.srp.problem;

/*
* SRP - Princio da reponsabilidade unica
*
*  */

public class Employee {

    public void calculatePay(String origem){
        System.out.println(origem + ": Calculando pagamento do funcionario....");
        regularHours();
    }

    public void reportHours(String origem){
        System.out.println(origem + ": Reportando horas do funcionario....");
        regularHours();
    }

    public void save(String origem){
        System.out.println(origem + ": Salvando funcionario no banco de dados...");
    }

    private static void regularHours(){
        System.out.println("========> Regularizando horas do funcionario...");
    }

}
