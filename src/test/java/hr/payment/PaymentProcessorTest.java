package hr.payment;


import br.com.jamesson.solid.dip.globomanticshr.refactored.notifications.EmployeeNotifier;
import br.com.jamesson.solid.dip.globomanticshr.refactored.payment.PaymentProcessor;
import br.com.jamesson.solid.dip.globomanticshr.refactored.persistence.EmployeeRepository;
import br.com.jamesson.solid.dip.globomanticshr.refactored.personnel.Employee;
import br.com.jamesson.solid.dip.globomanticshr.refactored.personnel.FullTimeEmployee;
import br.com.jamesson.solid.dip.globomanticshr.refactored.personnel.Intern;
import br.com.jamesson.solid.dip.globomanticshr.refactored.personnel.PartTimeEmployee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
In order to run these test class, 2 dependencies
have been added in the pom.xml file:
    - junit
    - mockito
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PaymentProcessorTest {

    private EmployeeRepository employeeRepositoryMock;
    private EmployeeNotifier employeeNotifierMock;

    @BeforeAll
    public void beforeAll(){
        // Income of all employees is 1700 $
        List<Employee> testEmployees = Arrays.asList(
                new FullTimeEmployee("Anna Smith",1000),
                new PartTimeEmployee("John Doe",500),
                new Intern("Gabriel Ortega", 200, 10)
        );

        employeeRepositoryMock = Mockito.mock(EmployeeRepository.class);
        Mockito.when(employeeRepositoryMock.findAll())
                .thenReturn(testEmployees);

        employeeNotifierMock = Mockito.mock(EmployeeNotifier.class);
    }

    @Test
    public void send_payments_should_pay_all_employee_salaries(){
        // arrange
        PaymentProcessor paymentProcessor = new PaymentProcessor(
                this.employeeRepositoryMock,
                this.employeeNotifierMock
        );

        // act
        int result = paymentProcessor.sendPayments();

        // assert
        assertEquals(1700, result);
    }
}