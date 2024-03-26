package br.com.fiap.bookingtech.records;

import java.time.LocalDateTime;

public record RestauranteRecord (String identificacao, String nome, String endereco, String tipoCozinha, LocalDateTime horarioFuncionamentoInicio, LocalDateTime horarioFuncionamentoTermino, int capacidade) {

}
