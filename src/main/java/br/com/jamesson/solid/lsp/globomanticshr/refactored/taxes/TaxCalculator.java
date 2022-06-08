package br.com.jamesson.solid.lsp.globomanticshr.refactored.taxes;

import br.com.jamesson.solid.lsp.globomanticshr.refactored.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
