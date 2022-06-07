package br.com.jamesson.solid.s.solution;

/*
 * SRP - Princio da reponsabilidade unica
 *
 *  */

public class Main {

    private static final EmployeeFacade employeeFacade = new EmployeeFacade();

    public static void main(String[] args) {
        var employee = new Employee();
        cfo(employee);
        coo(employee);
        dba(employee);
    }

    public static void cfo(Employee employee){
        employeeFacade.calculatePay("cfo");
    }

    public static void coo(Employee employee){
        employeeFacade.reportHours("coo");
    }

    public static void dba(Employee employee){
        employeeFacade.save("dba");
    }

}
