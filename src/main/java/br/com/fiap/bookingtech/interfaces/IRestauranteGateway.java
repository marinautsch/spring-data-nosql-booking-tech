package br.com.fiap.bookingtech.interfaces;

import br.com.fiap.bookingtech.entities.RestauranteEntity;

public interface IRestauranteGateway {


    public RestauranteEntity GravarRestaurante (RestauranteEntity restaurante);

    public RestauranteEntity ObterRestaurantePorIdentificacao (RestauranteEntity restaurante);

    public RestauranteEntity ObterRestaurantePorNome (String nome);
    public RestauranteEntity ObterRestaurantePorEndereco (String endereco);
    public RestauranteEntity ObterRestaurantePorTipoDeCozinha (String tipoDeCozinha);

}
