package br.com.jamesson.solid.ocp.problem;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        var cartao = new Cartao(1010, LocalDate.now(), "Jamesson");
        var processador = new ProcessarPagamento();
        processador.run(cartao);

        System.out.println("---------------------------------------------");

        var boleto = new Boleto("123213213213");
        processador.run(boleto);

    }

}
