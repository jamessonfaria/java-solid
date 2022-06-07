package br.com.jamesson.solid.o.solution;

import java.time.LocalDate;

public class Cartao implements Instrumento, AntiFraude{
    private Integer numero;
    private LocalDate vencimento;
    private String nome;

    public Cartao(Integer numero, LocalDate vencimento, String nome) {
        this.numero = numero;
        this.vencimento = vencimento;
        this.nome = nome;
    }

    @Override
    public void valido() {
        if(this.numero == null) return;
        if(this.vencimento == null) return;
        if(this.nome.isBlank()) return;
        System.out.println("Dados do cartao estao validos...");
        antifraude(this);
    }

    @Override
    public void cobrar() {
        System.out.println("Cobranca do cartao...");
    }

    @Override
    public void antifraude(Cartao cartao) {
        System.out.println("Validando fraude do cartao...");
    }
}
