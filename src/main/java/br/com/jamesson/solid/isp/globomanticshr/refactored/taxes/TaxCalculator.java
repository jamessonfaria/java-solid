package br.com.jamesson.solid.isp.globomanticshr.refactored.taxes;

import br.com.jamesson.solid.isp.globomanticshr.refactored.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
