package br.com.jamesson.solid.ocp.problem;

import java.time.LocalDate;

public record Cartao (Integer numero, LocalDate vencimento, String nome){}
