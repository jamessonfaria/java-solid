package br.com.jamesson.solid.lsp.solution;

import java.time.LocalDate;

public class ClienteContratado extends ClientePremium {

    public ClienteContratado(String nome, LocalDate dataCadastro) {
        super(nome, dataCadastro);
    }

    @Override
    protected boolean clientePremium() {
        return dataCadastro.getYear() < 2017;
    }
}
