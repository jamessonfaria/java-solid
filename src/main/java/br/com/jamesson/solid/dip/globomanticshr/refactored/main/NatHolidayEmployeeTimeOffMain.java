package br.com.jamesson.solid.dip.globomanticshr.refactored.main;

import br.com.jamesson.solid.dip.globomanticshr.refactored.logging.ConsoleLogger;
import br.com.jamesson.solid.dip.globomanticshr.refactored.persistence.EmployeeFileRepository;
import br.com.jamesson.solid.dip.globomanticshr.refactored.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.dip.globomanticshr.refactored.personnel.Employee;
import br.com.jamesson.solid.dip.globomanticshr.refactored.personnel.FullTimeEmployee;

import java.util.List;

public class NatHolidayEmployeeTimeOffMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeFileRepository repository = new EmployeeFileRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();
        Employee manager = new FullTimeEmployee("Steve Jackson", 5000);

        // Request time off for each employee on
        // national holiday
        for (Employee employee : employees){
            employee.requestTimeOff(1, manager);
        }
    }
}
