package br.com.jamesson.solid.lsp.globomanticshr.refactored.main;

import br.com.jamesson.solid.lsp.globomanticshr.refactored.personnel.ServiceLicenseAgreement;
import br.com.jamesson.solid.lsp.globomanticshr.refactored.personnel.Subcontractor;

import java.util.Arrays;
import java.util.List;

public class ApproveSLAMain {
    public static void main(String[] args) {

        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;
        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(
                minTimeOffPercent,
                maxResolutionDays);

        // Grab subcontractors
        Subcontractor subcontractor1 = new Subcontractor(
                "Rebekah Jackson",
                "rebekah-jackson@abc.com",
                3000,15
        );

        Subcontractor subcontractor2 = new Subcontractor(
                "Harry Fitz",
                "harryfitzn@def.com",
                3000,15
        );

        List<Subcontractor> collaborators = Arrays.asList(subcontractor1, subcontractor2);

        for (Subcontractor s : collaborators){
            s.approveSLA(companySla);
        }
    }
}