package br.com.jamesson.solid.dip.globomanticshr.before.taxes;

import br.com.jamesson.solid.dip.globomanticshr.before.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
