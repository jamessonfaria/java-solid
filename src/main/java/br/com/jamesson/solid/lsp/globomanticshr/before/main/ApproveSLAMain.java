package br.com.jamesson.solid.lsp.globomanticshr.before.main;

import br.com.jamesson.solid.lsp.globomanticshr.before.logging.ConsoleLogger;
import br.com.jamesson.solid.lsp.globomanticshr.before.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.lsp.globomanticshr.before.persistence.EmployeeRepository;
import br.com.jamesson.solid.lsp.globomanticshr.before.personnel.Employee;
import br.com.jamesson.solid.lsp.globomanticshr.before.personnel.ServiceLicenseAgreement;
import br.com.jamesson.solid.lsp.globomanticshr.before.personnel.Subcontractor;

import java.util.List;

public class ApproveSLAMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;
        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(
                minTimeOffPercent,
                maxResolutionDays);

        // Grab subcontractors
        List<Employee> subcontractors = repository.findAll();

        for (Employee e : subcontractors){
            if(e instanceof Subcontractor){
                Subcontractor s = (Subcontractor)e;
                s.approveSLA(companySla);
            }
        }
    }
}
