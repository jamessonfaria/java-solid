package hr.payment;

import br.com.jamesson.solid.dip.globomanticshr.before.notifications.EmailSender;
import br.com.jamesson.solid.dip.globomanticshr.before.payment.PaymentProcessor;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeFileRepository;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeFileSerializer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentProcessorTest {

    @Test
    public void send_payments_should_pay_all_employee_salaries(){
         // arrange
        var employeeFileSerializer = new EmployeeFileSerializer();
        var employeeFileRepository = new EmployeeFileRepository(employeeFileSerializer);
        var employeeNotifier = new EmailSender();
        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeFileRepository, employeeNotifier);

        // act
        int result = paymentProcessor.sendPayments();

        // assert
        assertEquals(5440, result);
    }
}