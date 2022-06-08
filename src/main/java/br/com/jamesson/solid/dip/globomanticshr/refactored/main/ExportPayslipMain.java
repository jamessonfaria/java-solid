package br.com.jamesson.solid.dip.globomanticshr.refactored.main;

import br.com.jamesson.solid.dip.globomanticshr.refactored.documents.Payslip;
import br.com.jamesson.solid.dip.globomanticshr.refactored.logging.ConsoleLogger;
import br.com.jamesson.solid.dip.globomanticshr.refactored.persistence.EmployeeFileRepository;
import br.com.jamesson.solid.dip.globomanticshr.refactored.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.dip.globomanticshr.refactored.personnel.Employee;

import java.time.Month;
import java.util.List;

public class ExportPayslipMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeFileRepository repository = new EmployeeFileRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();

        for (Employee employee : employees){
            Payslip payslip = new Payslip(employee , Month.AUGUST);

            String exportableText = payslip.toTxt().toUpperCase();
            System.out.println(exportableText);
        }
    }
}
