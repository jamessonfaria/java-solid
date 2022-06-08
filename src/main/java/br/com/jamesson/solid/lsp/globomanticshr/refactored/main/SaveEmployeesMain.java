package br.com.jamesson.solid.lsp.globomanticshr.refactored.main;

import br.com.jamesson.solid.lsp.globomanticshr.refactored.logging.ConsoleLogger;
import br.com.jamesson.solid.lsp.globomanticshr.refactored.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.lsp.globomanticshr.refactored.persistence.EmployeeRepository;
import br.com.jamesson.solid.lsp.globomanticshr.refactored.personnel.Employee;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);
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
