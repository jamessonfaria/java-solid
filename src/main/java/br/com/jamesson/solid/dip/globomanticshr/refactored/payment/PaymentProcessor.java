package br.com.jamesson.solid.dip.globomanticshr.refactored.payment;

import br.com.jamesson.solid.dip.globomanticshr.refactored.notifications.EmployeeNotifier;
import br.com.jamesson.solid.dip.globomanticshr.refactored.persistence.EmployeeRepository;
import br.com.jamesson.solid.dip.globomanticshr.refactored.personnel.Employee;

import java.util.List;

public class PaymentProcessor {
    private EmployeeRepository employeeRepository;
    private EmployeeNotifier employeeNotifier;

    public PaymentProcessor(EmployeeRepository employeeRepository, EmployeeNotifier employeeNotifier) {
        this.employeeRepository = employeeRepository;
        this.employeeNotifier = employeeNotifier;
    }

    public int sendPayments(){
        List<Employee> employees = this.employeeRepository.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            this.employeeNotifier.notify(employee);
        }

        return totalPayments;
    }
}
