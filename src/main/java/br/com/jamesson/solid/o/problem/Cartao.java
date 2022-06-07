package br.com.jamesson.solid.o.problem;

import java.time.LocalDate;

public record Cartao (Integer numero, LocalDate vencimento, String nome){}
