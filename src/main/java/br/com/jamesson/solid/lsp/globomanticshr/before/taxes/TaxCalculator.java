package br.com.jamesson.solid.lsp.globomanticshr.before.taxes;

import br.com.jamesson.solid.lsp.globomanticshr.before.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
