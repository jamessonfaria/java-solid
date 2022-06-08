package br.com.jamesson.solid.isp.globomanticshr.refactored.main;

import br.com.jamesson.solid.isp.globomanticshr.refactored.documents.Payslip;
import br.com.jamesson.solid.isp.globomanticshr.refactored.logging.ConsoleLogger;
import br.com.jamesson.solid.isp.globomanticshr.refactored.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.isp.globomanticshr.refactored.persistence.EmployeeRepository;
import br.com.jamesson.solid.isp.globomanticshr.refactored.personnel.Employee;

import java.time.Month;
import java.util.List;

public class ExportPayslipMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();

        for (Employee employee : employees){
            Payslip payslip = new Payslip(employee , Month.AUGUST);

            String exportableText = payslip.toTxt().toUpperCase();
            System.out.println(exportableText);
        }
    }
}
