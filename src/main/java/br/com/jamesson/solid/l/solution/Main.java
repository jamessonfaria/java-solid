package br.com.jamesson.solid.l.solution;

import jdk.jshell.spi.ExecutionControl;

import java.time.LocalDate;

/*
* LSP - Principio da substituicao de liskov
*
* */
public class Main {

    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Cliente cliente = new ClienteContratado("James", LocalDate.now());
        var premium = cliente.clientePremium();
    }
}

