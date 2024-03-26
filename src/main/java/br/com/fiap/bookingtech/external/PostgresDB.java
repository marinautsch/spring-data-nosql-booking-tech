package br.com.fiap.bookingtech.external;

import br.com.fiap.bookingtech.entities.AvaliacaoEntity;
import br.com.fiap.bookingtech.entities.ClienteEntity;
import br.com.fiap.bookingtech.entities.ReservaEntity;
import br.com.fiap.bookingtech.entities.RestauranteEntity;
import br.com.fiap.bookingtech.interfaces.IDatabaseClient;

public class PostgresDB implements IDatabaseClient {
    @Override
    public AvaliacaoEntity GravarAvaliacao(AvaliacaoEntity avaliacao) {
        return null;
    }

    @Override
    public ReservaEntity GravarReserva(ReservaEntity reserva) {
        return null;
    }

    @Override
    public ReservaEntity ObterTodasAsReservas() {
        return null;
    }

    @Override
    public ReservaEntity AtualizarReserva(ReservaEntity reserva) {
        return null;
    }

    @Override
    public RestauranteEntity GravarRestaurante(RestauranteEntity restaurante) {
        return null;
    }

    @Override
    public RestauranteEntity ObterRestaurantePorIdentificacao(RestauranteEntity restaurante) {
        return null;
    }

    @Override
    public RestauranteEntity ObterRestaurantePorNome(String nome) {
        return null;
    }

    @Override
    public RestauranteEntity ObterRestaurantePorEndereco(String endereco) {
        return null;
    }

    @Override
    public RestauranteEntity ObterRestaurantePorTipoDeCozinha(String tipoDeCozinha) {
        return null;
    }

    @Override
    public ClienteEntity GravarCliente(ClienteEntity cliente) {
        return null;
    }
}
