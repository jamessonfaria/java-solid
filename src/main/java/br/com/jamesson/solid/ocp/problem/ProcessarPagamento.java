package br.com.jamesson.solid.ocp.problem;

public class ProcessarPagamento {

    public void run(Object obj){

        if(obj instanceof Cartao){
            if(((Cartao) obj).numero() == null) return;
            if(((Cartao) obj).vencimento() == null) return;
            if(((Cartao) obj).nome().isBlank()) return;
            System.out.println("Dados do cartao estao validos...");
            antifraude((Cartao) obj);
        }else if(obj instanceof Boleto){
            if (((Boleto )obj).codigoBarras().isBlank()) return;
            System.out.println("Dados do boleto estao validos...");

        }

        cobrar(obj);

    }

    private void antifraude(Cartao cartao){
        System.out.println("Validando fraude do cartao...");
    }

    private void cobrar(Object obj){
        if(obj instanceof  Cartao)
            System.out.println("Cobranca do cartao...");
        else if(obj instanceof Boleto)
            System.out.println("Cobranca do boleto...");
    }

}
