package br.com.jamesson.solid.dip.globomanticshr.before.main;

import br.com.jamesson.solid.dip.globomanticshr.before.documents.Payslip;
import br.com.jamesson.solid.dip.globomanticshr.before.logging.ConsoleLogger;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeFileRepository;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.dip.globomanticshr.before.personnel.Employee;

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
