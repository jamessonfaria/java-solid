package br.com.jamesson.solid.ocp.globomanticshr.refactored.taxes;

import br.com.jamesson.solid.ocp.globomanticshr.refactored.personnel.Employee;

public interface TaxCalculator {

    double calculate(Employee employee);

}
