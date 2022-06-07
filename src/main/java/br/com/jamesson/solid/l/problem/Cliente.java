package br.com.jamesson.solid.l.problem;

import jdk.jshell.spi.ExecutionControl;

import java.time.LocalDate;

public abstract class Cliente {

    private String nome;
    private LocalDate dataCadastro;

    public Cliente(String nome, LocalDate dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    protected abstract boolean clientePremium() throws UnsupportedOperationException;

}
