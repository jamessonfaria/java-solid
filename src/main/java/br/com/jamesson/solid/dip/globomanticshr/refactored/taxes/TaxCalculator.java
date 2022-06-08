package br.com.jamesson.solid.dip.globomanticshr.refactored.taxes;

import br.com.jamesson.solid.dip.globomanticshr.refactored.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
