package br.com.jamesson.solid.s.problem;

public class Main {

    public static void main(String[] args) {

        var employee = new Employee();
        cfo(employee);
        coo(employee);
        dba(employee);
    }

    public static void cfo(Employee employee){
        employee.calculatePay("cfo");
    }

    public static void coo(Employee employee){
        employee.reportHours("coo");
    }

    public static void dba(Employee employee){
        employee.save("dba");
    }

}
