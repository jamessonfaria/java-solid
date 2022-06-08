package br.com.jamesson.solid.dip.globomanticshr.before.main;

import br.com.jamesson.solid.dip.globomanticshr.before.notifications.EmailSender;
import br.com.jamesson.solid.dip.globomanticshr.before.payment.PaymentProcessor;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeFileRepository;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeFileSerializer;
import br.com.jamesson.solid.dip.globomanticshr.before.persistence.EmployeeRepository;

public class PayEmployeesMain {

    /*
    Will take a couple of seconds to execute due to the
    sending of mails.
     */

    public static void main(String[] args) {
        var employeeFileSerializer = new EmployeeFileSerializer();
        var employeeFileRepository = new EmployeeFileRepository(employeeFileSerializer);
        var employeeNotifier = new EmailSender();

        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeFileRepository, employeeNotifier);
        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
