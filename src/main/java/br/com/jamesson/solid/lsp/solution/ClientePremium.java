package br.com.jamesson.solid.lsp.solution;

import java.time.LocalDate;

public abstract class ClientePremium extends Cliente{
    public ClientePremium(String nome, LocalDate dataCadastro) {
        super(nome, dataCadastro);
    }

    protected abstract boolean clientePremium();
}
