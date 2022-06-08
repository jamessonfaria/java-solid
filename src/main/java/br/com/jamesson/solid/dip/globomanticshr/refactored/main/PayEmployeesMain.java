package br.com.jamesson.solid.dip.globomanticshr.refactored.main;

import br.com.jamesson.solid.dip.globomanticshr.refactored.notifications.EmailSender;
import br.com.jamesson.solid.dip.globomanticshr.refactored.payment.PaymentProcessor;
import br.com.jamesson.solid.dip.globomanticshr.refactored.persistence.EmployeeFileRepository;
import br.com.jamesson.solid.dip.globomanticshr.refactored.persistence.EmployeeFileSerializer;

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
