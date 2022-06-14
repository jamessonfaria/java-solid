package br.com.jamesson.solid.dip.globomanticshr.refactored.main;

import br.com.jamesson.solid.dip.globomanticshr.refactored.logging.ConsoleLogger;
import br.com.jamesson.solid.dip.globomanticshr.refactored.persistence.EmployeeFileRepository;
import br.com.jamesson.solid.dip.globomanticshr.refactored.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.dip.globomanticshr.refactored.personnel.Employee;
import br.com.jamesson.solid.dip.globomanticshr.refactored.taxes.TaxCalculator;
import br.com.jamesson.solid.dip.globomanticshr.refactored.taxes.TaxCalculatorFactory;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CalculateEmployeeTaxesMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeFileRepository repository = new EmployeeFileRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        double totalTaxes = 0;
        for (Employee employee: employees){
            TaxCalculator taxCalculator = TaxCalculatorFactory.create(employee);

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