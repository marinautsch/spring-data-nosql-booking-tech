package br.com.fiap.bookingtech.usecases;

import br.com.fiap.bookingtech.entities.AvaliacaoEntity;
import br.com.fiap.bookingtech.entities.ClienteEntity;
import br.com.fiap.bookingtech.entities.RestauranteEntity;

import java.time.LocalDateTime;

public class AvaliacaoUseCases {

    public static AvaliacaoEntity RegistrarAvaliacao (int nota, String comentario, ClienteEntity cliente, RestauranteEntity restaurante, LocalDateTime dataAvaliacao){

        ValidarDadosDaAvaliacao(nota, comentario, cliente, restaurante, dataAvaliacao);
        AvaliacaoEntity avaliacao = new AvaliacaoEntity(nota, comentario, cliente, restaurante, dataAvaliacao);
        return avaliacao;
    }

    private static void ValidarDadosDaAvaliacao(int nota, String comentario, ClienteEntity cliente, RestauranteEntity restaurante, LocalDateTime dataAvaliacao){

        if (nota <1 || nota>5){
            throw new IllegalArgumentException("Nota não pode ser menor que 1 ou maior que 5");
        }
        if (comentario == null){
            throw new IllegalArgumentException("Comentário não pode ser nulo");
        }
        if (cliente == null){
            throw new IllegalArgumentException("Cliente não pode ser nulo");
        }
        if (restaurante == null){
            throw new IllegalArgumentException("Restaurante não pode ser nulo");
        }
        if (dataAvaliacao.isAfter(LocalDateTime.now())){
            throw new IllegalArgumentException("Data de avaliação não pode ser no futuro");
        }

        //incluir na validação
        // avaliação somente após o comparecimento do cliente no restaurante

    }
}
