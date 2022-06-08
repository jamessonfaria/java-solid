package br.com.jamesson.solid.dip.globomanticshr.before.payment;

import br.com.jamesson.solid.dip.globomanticshr.before.notifications.EmailSender;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeFileRepository;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.dip.globomanticshr.before.personnel.Employee;

import java.util.List;

public class PaymentProcessor {

    private EmployeeFileRepository employeeRepository;

    public PaymentProcessor(){
        EmployeeFileSerializer serializer =
                new EmployeeFileSerializer();
        this.employeeRepository =
                new EmployeeFileRepository(serializer);
    }

    public int sendPayments(){
        List<Employee> employees = this.employeeRepository.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            EmailSender.notify(employee);
        }

        return totalPayments;
    }
}
