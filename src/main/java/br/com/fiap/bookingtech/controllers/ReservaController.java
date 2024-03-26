package br.com.fiap.bookingtech.controllers;

import br.com.fiap.bookingtech.entities.ClienteEntity;
import br.com.fiap.bookingtech.entities.ReservaEntity;
import br.com.fiap.bookingtech.entities.RestauranteEntity;
import br.com.fiap.bookingtech.gateway.ClienteGateway;
import br.com.fiap.bookingtech.gateway.RestauranteGateway;
import br.com.fiap.bookingtech.interfaces.IClienteGateway;
import br.com.fiap.bookingtech.interfaces.IDatabaseClient;
import br.com.fiap.bookingtech.interfaces.IRestauranteGateway;
import br.com.fiap.bookingtech.records.ClienteRecord;
import br.com.fiap.bookingtech.records.RestauranteRecord;
import br.com.fiap.bookingtech.usecases.ReservaUseCases;

import java.time.LocalDateTime;

public class ReservaController {

    public ReservaEntity gravar (
            LocalDateTime dataReserva,
            RestauranteRecord restaurante,
            ClienteRecord cliente,
            IDatabaseClient databaseClient){
        IRestauranteGateway restauranteGateway = new RestauranteGateway(databaseClient);
        IClienteGateway clienteGateway = new ClienteGateway(databaseClient);

        var restauranteEntity = restauranteGateway.ObterRestaurantePorIdentificacao(restaurante.identificacao(restaurante));
        var clienteEntity = clienteGateway.ObterClientePorIdentificacao(cliente);

        var reserva = ReservaUseCases.RegistrarReserva(clienteEntity, restauranteEntity, dataReserva);
    }
}
