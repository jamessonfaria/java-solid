package br.com.jamesson.solid.lsp.problem;

import java.time.LocalDate;

public class ClienteAlvo extends Cliente{

    public ClienteAlvo(String nome, LocalDate dataCadastro) {
        super(nome, dataCadastro);
    }

    @Override
    protected boolean clientePremium() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
