package br.com.jamesson.solid.ocp.globomanticshr.before.main;

import br.com.jamesson.solid.ocp.globomanticshr.before.logging.ConsoleLogger;
import br.com.jamesson.solid.ocp.globomanticshr.before.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.ocp.globomanticshr.before.persistence.EmployeeRepository;
import br.com.jamesson.solid.ocp.globomanticshr.before.personnel.Employee;
import br.com.jamesson.solid.ocp.globomanticshr.before.taxes.TaxCalculator;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CalculateTaxesMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        TaxCalculator taxCalculator = new TaxCalculator();

        double totalTaxes = 0;
        for (Employee employee: employees){

            // compute individual tax
            double tax = taxCalculator.calculate(employee);
            String formattedTax = currencyFormatter.format(tax);
            consoleLogger.writeInfo(employee.getFullName() + " taxes: " + formattedTax);

            // add to company total taxes
            totalTaxes += taxCalculator.calculate(employee);
        }
        consoleLogger.writeInfo("Total taxes = " + currencyFormatter.format(totalTaxes));
    }
}
