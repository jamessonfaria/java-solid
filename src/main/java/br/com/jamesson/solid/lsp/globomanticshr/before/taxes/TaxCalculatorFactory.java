package br.com.jamesson.solid.lsp.globomanticshr.before.taxes;

import br.com.jamesson.solid.lsp.globomanticshr.before.personnel.Employee;
import br.com.jamesson.solid.lsp.globomanticshr.before.personnel.FullTimeEmployee;
import br.com.jamesson.solid.lsp.globomanticshr.before.personnel.Intern;
import br.com.jamesson.solid.lsp.globomanticshr.before.personnel.PartTimeEmployee;

public class TaxCalculatorFactory {
    public static TaxCalculator create(Employee employee) {
        if (employee instanceof FullTimeEmployee) {
            return new FullTimeTaxCalculator();
        }

        if (employee instanceof PartTimeEmployee) {
            return new PartTimeTaxCalculator();
        }

        if (employee instanceof Intern) {
            return new InternTaxCalculator();
        }

        throw new RuntimeException("Invalid employee type");
    }
}
