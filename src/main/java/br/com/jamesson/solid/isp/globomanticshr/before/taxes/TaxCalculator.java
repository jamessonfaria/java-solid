package br.com.jamesson.solid.isp.globomanticshr.before.taxes;

import br.com.jamesson.solid.isp.globomanticshr.before.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
