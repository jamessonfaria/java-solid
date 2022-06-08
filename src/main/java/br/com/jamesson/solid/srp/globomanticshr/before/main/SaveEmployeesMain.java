package br.com.jamesson.solid.srp.globomanticshr.before.main;

import br.com.jamesson.solid.srp.globomanticshr.before.persistence.EmployeeRepository;
import br.com.jamesson.solid.srp.globomanticshr.before.personnel.Employee;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            Employee.save(e);
        }
    }
}
