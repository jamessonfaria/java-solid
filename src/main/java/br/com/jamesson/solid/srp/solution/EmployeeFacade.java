package br.com.jamesson.solid.srp.solution;

public class EmployeeFacade {
    private final PayCalculator payCalculator;
    private final HourReporter hourReporter;
    private final EmployeeSaver employeeSaver;

    public EmployeeFacade() {
        this.payCalculator = new PayCalculator();
        this.hourReporter = new HourReporter();
        this.employeeSaver = new EmployeeSaver();
    }

    public void calculatePay(String origem){
        payCalculator.calculatePay(origem);
    }

    public void reportHours(String origem){
        hourReporter.reportHours(origem);
    }

    public void save(String origem){
        employeeSaver.save(origem);
    }

}
