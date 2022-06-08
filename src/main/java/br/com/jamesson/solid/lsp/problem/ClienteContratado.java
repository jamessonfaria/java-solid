package br.com.jamesson.solid.lsp.problem;

import java.time.LocalDate;

public class ClienteContratado extends Cliente {

    public ClienteContratado(String nome, LocalDate dataCadastro) {
        super(nome, dataCadastro);
    }

    @Override
    protected boolean clientePremium() throws UnsupportedOperationException {
        return dataCadastro.getYear() < 2017;
    }
}
