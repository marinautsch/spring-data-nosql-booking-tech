package controllers;

import entities.RestauranteEntity;
import interfaces.IDatabaseClient;
import interfaces.IRestauranteGateway;

public class RestauranteGateway implements IRestauranteGateway {

    private final IDatabaseClient databaseClient;


    public RestauranteGateway(IDatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }


    @Override
    public RestauranteEntity GravarRestaurante(RestauranteEntity restaurante) {
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
}
