package br.com.jamesson.solid.dip.globomanticshr.before.main;

import br.com.jamesson.solid.dip.globomanticshr.before.logging.ConsoleLogger;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeFileRepository;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.dip.globomanticshr.before.personnel.Employee;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        EmployeeFileRepository repository = new EmployeeFileRepository(employeeFileSerializer);
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            try {
                repository.save(e);
                consoleLogger.writeInfo("Saved employee " + e.toString());
            } catch (IOException exception) {
                consoleLogger.writeError("Error saving employee", exception);
            }
        }
    }
}
