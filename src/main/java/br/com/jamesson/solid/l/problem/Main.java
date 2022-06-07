package br.com.jamesson.solid.l.problem;

import jdk.jshell.spi.ExecutionControl;

import java.time.LocalDate;

/*
* LSP - Principio da substituicao de liskov
*
* */
public class Main {

    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Cliente cliente2 = new ClienteContratado("James", LocalDate.now());
        var premium2 = cliente2.clientePremium();
        System.out.println(premium2);

        Cliente cliente = new ClienteAlvo("James", null);
        var premium = cliente.clientePremium();
        System.out.println(premium);
    }
}

