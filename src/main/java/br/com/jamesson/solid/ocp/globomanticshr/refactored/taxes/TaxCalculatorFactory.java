package br.com.jamesson.solid.ocp.globomanticshr.refactored.taxes;

import br.com.jamesson.solid.ocp.globomanticshr.refactored.personnel.Employee;
import br.com.jamesson.solid.ocp.globomanticshr.refactored.personnel.FullTimeEmployee;
import br.com.jamesson.solid.ocp.globomanticshr.refactored.personnel.Intern;
import br.com.jamesson.solid.ocp.globomanticshr.refactored.personnel.PartTimeEmployee;

public class TaxCalculatorFactory {
    public static TaxCalculator create(Employee employee){
        if (employee instanceof FullTimeEmployee)
            return new FullTimeTaxCalculator();

        if (employee instanceof PartTimeEmployee)
            return new PartTimeTaxCalculator();

        if (employee instanceof Intern)
            return new InternTaxCalculator();

        throw new RuntimeException("Invalid employee type");

    }
}
