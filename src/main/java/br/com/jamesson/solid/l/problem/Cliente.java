package br.com.jamesson.solid.l.problem;

import java.time.LocalDate;

public abstract class Cliente {

    protected String nome;
    protected LocalDate dataCadastro;

    public Cliente(String nome, LocalDate dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    protected abstract boolean clientePremium() throws UnsupportedOperationException;

}
