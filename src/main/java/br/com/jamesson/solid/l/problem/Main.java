package br.com.jamesson.solid.l.problem;

import jdk.jshell.spi.ExecutionControl;

/*
* LSP - Principio da substituicao de liskov
*
* */
public class Main {

    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Cliente cliente = new ClienteAlvo("James", null);
        var premium = cliente.clientePremium();
    }
}

