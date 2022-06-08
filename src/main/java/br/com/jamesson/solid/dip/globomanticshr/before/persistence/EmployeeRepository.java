package br.com.jamesson.solid.dip.globomanticshr.before.persistence;

import br.com.jamesson.solid.dip.globomanticshr.before.personnel.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    void save(Employee employee) throws IOException;
}
