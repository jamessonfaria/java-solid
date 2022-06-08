package br.com.jamesson.solid.lsp.globomanticshr.refactored.personnel;

public class Subcontractor {

    private final int monthlyIncome;
    private int nbHoursPerWeek;
    private String email;
    private String name;

    public Subcontractor(String name, String email, int monthlyIncome, int nbHoursPerWeek) {
        this.monthlyIncome = monthlyIncome;
        this.nbHoursPerWeek = nbHoursPerWeek;
        this.email = email;
        this.name = name;
    }

    public boolean approveSLA(ServiceLicenseAgreement sla) {

        boolean result = false;
        if (sla.getMinUptimePercent() >= 98
                && sla.getProblemResolutionTimeDays() <= 2) {
            result=  true;
        }

        System.out.println("SLA approval for " + this.name + ": " + result);
        return result;
    }
}
