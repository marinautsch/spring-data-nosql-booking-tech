package br.com.fiap.bookingtech.gateway;

import br.com.fiap.bookingtech.entities.RestauranteEntity;
import br.com.fiap.bookingtech.interfaces.IDatabaseClient;
import br.com.fiap.bookingtech.interfaces.IRestauranteGateway;

public class RestauranteGateway implements IRestauranteGateway {

    private final IDatabaseClient databaseClient;

    public RestauranteGateway(IDatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    @Override
    public RestauranteEntity GravarRestaurante(RestauranteEntity restaurante) {
        return this.databaseClient.GravarRestaurante(restaurante);
    }

    @Override
    public RestauranteEntity ObterRestaurantePorIdentificacao(RestauranteEntity restaurante) {
        return this.databaseClient.ObterRestaurantePorIdentificacao(restaurante);
    }

    @Override
    public RestauranteEntity ObterRestaurantePorNome(String nome) {
        return this.databaseClient.ObterRestaurantePorNome(nome);
    }

    @Override
    public RestauranteEntity ObterRestaurantePorEndereco(String endereco) {
        return this.databaseClient.ObterRestaurantePorEndereco(endereco);
    }

    @Override
    public RestauranteEntity ObterRestaurantePorTipoDeCozinha(String tipoDeCozinha) {
        return this.databaseClient.ObterRestaurantePorTipoDeCozinha(tipoDeCozinha);
    }
}
